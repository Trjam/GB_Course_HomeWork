package ru.gbcourse.java.trjamich;


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

        Box <Apple> box3 = new Box<>();
        box3.addFruit(new Apple());
        box3.moveTo(box2);
        System.out.println(box3.getWeight() + " " + box2.getWeight());



    }
}
