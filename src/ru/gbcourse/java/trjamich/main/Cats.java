package ru.gbcourse.java.trjamich.main;

import java.util.Random;

public enum Cats {
    Васька, Максим, Мурка, Маська, Бегемот, Кокос, Владыка, Пушок, Снежок, Обормот;

    public static String getCatName() {
        Random random = new Random();
        return String.valueOf(values()[random.nextInt(values().length)]);
    }
}
