package ru.gbcourse.java.trjamich.Arrays;

import ru.gbcourse.java.trjamich.Exeptions.*;

public class MyArray {

    /**Сумма элементов масива
     * @param arr массив должен быть 4х4 и содержать цифры
     * @throws MyArraySizeException при размере массива, отличным от 4х4
     * @throws MyArrayDataException при элементе массива не являющемся цислом
     * */
    public static void arrayElementsSum(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;

        for (int i = 0, arrLength = arr.length; i < arrLength; i++) {
            String[] elements = arr[i];

            if (arr.length != 4) {
                throw new MyArraySizeException("Переданный массив не соответствует требованиям, количество строк и элементов в этих строках должно быть равно 4" +
                        "\nВ данном массиве передано колчество строк: " + arr.length, arr.length);

            } else if (elements.length != 4)
                throw new MyArraySizeException("Переданный массив не соответствует требованиям, количество строк и столбцов в этих строках должно быть равно 4" +
                        "\nВ данном массиве в строке " + i + " передано колчество элементов : " + elements.length, i, elements.length);

            /*вот не уверен, что верно перехватывать тут NumberFormatException и подменять его MyArrayDataException...
            но по другому как сделать не придумал, пип его знает как проверить число или нет в элементе не сделав парсинт,
            а на нем сразу в NumberFormatException уходим, а до этого там стринг и какой нить isPrimitive() у массива бесполезен*/
            for (int j = 0; j < elements.length; j++) {
                try {
                    sum += Integer.parseInt(elements[j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Элемент массива [" + i + ", " + j + "] не является числом", i, j);
                }
            }
        }
        System.out.println("Сумма элементов массива: " + sum);
    }

}

