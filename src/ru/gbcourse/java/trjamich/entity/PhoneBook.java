package ru.gbcourse.java.trjamich.entity;

import java.util.*;

public class PhoneBook {

    static Map <String, List<String>> book = new TreeMap<>();

    public static void add(String name, String phone) {
        if (!(book.containsKey(name))) {
            book.put(name, Arrays.asList(phone));
        } else {

            //Интересно, насколько применима такая конструкция? а то из листа в стринг, потом опять в лист...
            book.put(name, Arrays.asList(book.get(name).toString(), phone));
        }
    }

    public static String get(String name) {
        return name + ": " +book.get(name).toString()
                .replace("[", "")
                .replace("]","");

    }

}
