package ru.gbcourse.java.trjamich.entity;

import java.util.Map;
import java.util.TreeMap;

public class WordCounter {

    static Map<String,Integer> wordsCount= new TreeMap<>();

    public static void countWordsInArray(String[] words) {
        for (String w : words) {
            w = w.toLowerCase();
            if (!(wordsCount.containsKey(w))) {
                wordsCount.put(w, 1);
            } else {
                wordsCount.put(w, wordsCount.get(w) + 1);
            }
        }
    }

    public static void resultOfCount() {
        System.out.println(wordsCount.toString()
                .replace(", ", "\n")
                .replace("{","")
                .replace("}","\n")
                .replace("=", " : "));

    }

}

