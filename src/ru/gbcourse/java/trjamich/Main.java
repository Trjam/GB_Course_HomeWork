package ru.gbcourse.java.trjamich;


import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] arr1 = {1,2,3,4,5,6};
        String[] arr2 = {"qwe0","qwe1","qwe2","qwe3","qwe4","qwe5","qwe6"};

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println();

        swapElements(arr1, 2,4);
        swapElements(arr2, 2,4);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println();

        System.out.println(arrayToArrayList(arr1));
        System.out.println(arrayToArrayList(arr2));
        System.out.println();


        Box <Orange> box1 = new Box<> ();
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

        System.out.println(box3.getFruits().size() + " " + box2.getFruits().size());
        box3.moveTo(box2);
        System.out.println(box3.getFruits().size() + " " + box2.getFruits().size());
    }

    public static <T> ArrayList<T> arrayToArrayList(T arr) {
        return new ArrayList<>(Arrays.asList(arr));
    }

    public static <T> void swapElements (T[] arr, int elmindx1, int elmindx2) {
        if (elmindx1 < arr.length && elmindx2 < arr.length && elmindx1 >= 0 && elmindx2 >= 0) {
            T temp = arr[elmindx2];
            arr[elmindx2] = arr[elmindx1];
            arr[elmindx1] = temp;
        } else {
            System.out.println("индексы за пределом массива");
        }
    }
}
