package ru.gbcourse.java.trjamich;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        final int size = 10000000;
        final int h = size / 2;
        float[] arr = new float[size];


        MyArray.fillArray(arr);
        long t = System.currentTimeMillis();
        SingleThread.calculate (arr, 0);
        System.out.println(System.currentTimeMillis() - t);


        MyArray.fillArray(arr);
        t = System.currentTimeMillis();
        DoubleThread.calculate(arr, h);
        System.out.println(System.currentTimeMillis() - t);
    }
}
