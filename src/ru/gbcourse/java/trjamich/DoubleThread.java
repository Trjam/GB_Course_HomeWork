package ru.gbcourse.java.trjamich;

public class DoubleThread {

    public static void calculate (float[] arr, int h) throws InterruptedException {

        Thread t1= new Thread(() -> {
            float[] arr1 = new float[h];
            System.arraycopy(arr, 0, arr1, 0, h);
            SingleThread.calculate(arr1, 0);
            System.arraycopy(arr1, 0, arr, 0, h);
        });

        Thread t2= new Thread(() -> {
            float[] arr2 = new float[h];
            System.arraycopy(arr, h, arr2, 0, h);
            SingleThread.calculate(arr2, h);
            System.arraycopy(arr2, 0, arr, h, h);
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}
