package ru.gbcourse.java.trjamich;

import java.util.ArrayList;
import java.util.List;

public class Box <T extends Fruit>{

    private float weight;

    List<T> fruits;

    public Box () {
        fruits = new ArrayList<>();
    }

    public void addFruit(T fruit){
        fruits.add(fruit);
    }

    public List<T> getFruits() {
        return fruits;
    }

    public float getWeight() {
        this.weight = 0.0f;
        for (T fruit : this.getFruits()) {
            this.weight += fruit.getWeight();
        }
        return this.weight;
    }

    public boolean compare (Box<?> box) {
        return Math.abs(this.getWeight() - box.getWeight()) < 0.00001;
    }

    public void moveTo(Box<T> box) {
        if (this == box) {
            return;
        }

        for (T fruit : this.getFruits()) {
            box.addFruit(fruit);
        }
        this.getFruits().clear();
    }
}
