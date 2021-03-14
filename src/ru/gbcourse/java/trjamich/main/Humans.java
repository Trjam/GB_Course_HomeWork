package ru.gbcourse.java.trjamich.main;

import java.util.Random;

public enum Humans {
    Аркадий, Валерий, Роман, Ирина, Всеволод, Мария, Наталья, Анастасия, Анна, Алексей;

    public static String getHumanName() {
        Random random = new Random();
        return String.valueOf(values()[random.nextInt(values().length)]);
    }
}
