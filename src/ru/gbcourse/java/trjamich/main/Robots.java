package ru.gbcourse.java.trjamich.main;

import java.util.Random;

public enum Robots {
    T1000, RX30, T800, Петр, ФантазияКончилась1, ФантазияКончилась2, ФантазияКончилась3, ФантазияКончилась4, ФантазияКончилась5, ФантазияКончилась6;

    public static String getRobotName() {
        Random random = new Random();
        return String.valueOf(values()[random.nextInt(values().length)]);
    }
}
