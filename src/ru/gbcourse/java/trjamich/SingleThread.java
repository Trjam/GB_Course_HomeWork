package ru.gbcourse.java.trjamich;

public class SingleThread {

    //небольшая хитрость с h, чтобы метод подходил для 2х потоков и не пришлость копипастить строчки
    public static void calculate (float[] arr, int h) {
        for (int i = 0; i < arr.length; i++)
            arr[i] = (float)(arr[i] * Math.sin(0.2f + (i+h) / 5) * Math.cos(0.2f + (i+h) / 5) * Math.cos(0.4f + (i+h) / 2));
    }
}
