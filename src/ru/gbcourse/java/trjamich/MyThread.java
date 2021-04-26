package ru.gbcourse.java.trjamich;

public class MyThread {

    static Object mon = new Object();
    static int currentNumber = 1;

    public static void runThread (int num, int nextNum, String str) {
        new Thread(()-> {
            try {
                for (int i = 0; i < 5; i++) {
                    synchronized (mon) {
                        while (currentNumber!=num) {
                            mon.wait();;
                        }
                        System.out.println(str);
                        currentNumber = nextNum;
                        mon.notifyAll();
                    }
                }
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
