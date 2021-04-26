package ru.gbcourse.java.trjamich;

public class Main {
    public static void main(String[] args) {

        MyThread.runThread(1,2,"A");
        MyThread.runThread(2,3,"B");
        MyThread.runThread(3,1,"C");

    }
}
