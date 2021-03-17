package ru.gbcourse.java.trjamich;

import ru.gbcourse.java.trjamich.Exeptions.MyArrayDataException;
import ru.gbcourse.java.trjamich.Exeptions.MyArraySizeException;

import static ru.gbcourse.java.trjamich.Arrays.MyArray.arrayElementsSum;


public class Main {
    public static void main(String[] args) {

        String[][] arr1 = {{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"}};
        String[][] arr2 = {{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"}};
        String[][] arr3 = {{"1","2","3","4"},{"1","2","4"},{"1","2","3","4"},{"1","2","3","4"}};
        String[][] arr4 = {{"1","2","3","4"},{"1","2","З","4"},{"1","2","3","4"},{"1","2","3","4"}};

        try {
            arrayElementsSum(arr1);
            arrayElementsSum(arr2);
        }catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }

        try {
            arrayElementsSum(arr3);
        }catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }

        try {
            arrayElementsSum(arr4);
        }catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }

    }
}
