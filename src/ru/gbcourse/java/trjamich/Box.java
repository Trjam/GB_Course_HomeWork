package ru.gbcourse.java.trjamich;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.valueOf;

public class Box <T extends Fruit>{

    private float weight;

    List fruits;// = new ArrayList<>();

    public <T> Box () {
        //this.weight = 0.0f;
        fruits = new ArrayList<T>();
    }

    public void addFruit(T fruit){
        fruits.add(fruit);
        //this.weight+= fruit.getWeight();
    }

    public List<T> getFruits() {
        return fruits;
    }

    public float getWeight() {
        this.weight = 0.0f;
        for (T fruit : (List<T>) fruits) {
            this.weight += fruit.getWeight();
        }
        return this.weight;
    }

    public boolean compare (Box box) {
        return Math.abs(this.getWeight() - box.getWeight()) < 0.00001;
    }
}
