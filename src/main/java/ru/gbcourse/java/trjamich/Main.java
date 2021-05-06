package ru.gbcourse.java.trjamich;

import java.lang.reflect.InvocationTargetException;


import static ru.gbcourse.java.trjamich.Start.start;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        start(MyTests.class);
    }
}
