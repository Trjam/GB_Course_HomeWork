package ru.gbcourse.java.trjamich;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException {

        Box <Orange> box1 = new Box<>();
        box1.addFruit(new Orange());
        box1.addFruit(new Orange());

        Box <Apple> box2 = new Box<>();
        box2.addFruit(new Apple());
        box2.addFruit(new Apple());
        box2.addFruit(new Apple());
        //box2.addFruit(new Apple());
        //box2.addFruit(new Apple());

        System.out.println(box1.compare(box2));

        System.out.println(box1.getWeight() + " " + box2.getWeight());



    }
}
