package ru.gbcourse.java.trjamich;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        final int size = 10000000;
        final int h = size / 2;
        float[] arr1 = new float[size];
        float[] arr2 = new float[size];
        Arrays.fill(arr1, 1);
        Arrays.fill(arr2, 1);


        long t = System.currentTimeMillis();
        SingleThread.calculate (arr1, 0);
        System.out.println(System.currentTimeMillis() - t);

        t = System.currentTimeMillis();
        DoubleThread.calculate(arr2, h);
        System.out.println(System.currentTimeMillis() - t);

        System.out.println(Arrays.toString(arr1).equals(Arrays.toString(arr2)));
    }
}
