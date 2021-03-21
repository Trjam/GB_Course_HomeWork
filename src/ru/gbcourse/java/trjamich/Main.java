package ru.gbcourse.java.trjamich;

import ru.gbcourse.java.trjamich.entity.PhoneBook;
import ru.gbcourse.java.trjamich.entity.WordCounter;

public class Main {
    public static void main(String[] args) {

        String[] words = {"слово", "другое", "СловО","еще","одно","слово", "и", "оно", "уже",
                "не", "одно", "выходит", "это", "СЛОВО", "еще", "немного", "и", "куча", "слов", "выходит","Уже"};

        WordCounter.countWordsInArray(words);
        WordCounter.resultOfCount();



        PhoneBook.add("Иванов", "+79001234567");
        PhoneBook.add("Иванов", "+7 (900) 1234567");
        PhoneBook.add("Петров", "+79999999999");
        PhoneBook.add("Петров", "+79999999999");
        PhoneBook.add("Петров", "+79999999999");
        PhoneBook.add("Сидоров", "+79999999999");

        System.out.println(PhoneBook.get("Иванов"));
        System.out.println(PhoneBook.get("Петров"));
        System.out.println(PhoneBook.get("Сидоров"));
    }
}
