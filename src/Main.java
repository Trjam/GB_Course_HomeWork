import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // 1 пункт
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("1. Массив до: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1)
                arr[i] = 0;
            else
                arr[i] = 1;
        }
        System.out.println("Массив после: " + Arrays.toString(arr));

        // 2 пункт
        int[] arr2 = new int[8];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i * 3;
        }
        System.out.println("\n2. Массив arr2: " + Arrays.toString(arr2));

        // 3 пункт
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("\n3. Массив до: " + Arrays.toString(arr3));
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6)
                arr3[i] *= 2;
        }
        System.out.println("Массив после: " + Arrays.toString(arr3));

        // 4 пункт
        System.out.println("\n4. Диагонали\n");
        int[][] arr4 = new int[9][9];
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4.length; j++) {
                if (i == j || j == arr4.length - i - 1) {
                    arr4[i][j] = 1;
                }
                System.out.print(arr4[i][j] + "  ");
            }
            System.out.println();
        }

        //5 пункт
        int[] arr5 = {48, 18, 70, 11, 35, 63, 12, 87, 35, 63};
        int min = arr5[0], max = 0, minelem = 0, maxelem = 0;
        for (int i = 0; i < arr5.length; i++) {
            if (arr5[i] >= max) {
                max = arr5[i];
                maxelem = i;
            }
            if (arr5[i] <= min) {
                min = arr5[i];
                minelem = i;
            }
        }
        System.out.println("\n5. Элемент с максимальным значением массива: [" + maxelem + "] = " + max);
        System.out.println("Элемент с минимальным значением массива: [" + minelem + "] = " + min);

        // 6 пункт
        int[] arr6 = {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println("\n6. Наличие в масиве равенстра частей: " + equalsOfLeftAndRight(arr6));

        // 7 пункт
        int[] arr7 = {1, 2, 3, 4, 5};
        System.out.println("\n7. Массив до: " + Arrays.toString(arr7));
        moveElems(arr7, -2);


    }

    // 6 пункт
    public static boolean equalsOfLeftAndRight(int[] arr) {
        int leftsum = 0;
        boolean result = false;
        for (int i = 0; i < arr.length - 1; i++) {
            int rightsum = 0;
            leftsum += arr[i];
            for (int j = arr.length - 1; j > 0; j--) {
                rightsum += arr[j];
                if (leftsum == rightsum)
                    result = true;
            }
        }
        return result;
    }

    //7 пункт. Не радует что блоки почти повторяют друг друга, но как покомпактнее сделать хз

    public static void moveElems(int[] arr, int positions) {
        if (positions >= 0) {
            int temp = arr[arr.length-1];
            for (int i = 0; i < positions; i++) {
                for (int j = arr.length-1; j >=0; j--) {
                    if (j == 0)
                        arr[j]=temp;
                    else
                        arr[j] = arr[j-1];
                }
                temp = arr[arr.length-1];
            }
        } else {
            int temp = arr[0];
            positions*=-1;
            for (int i = 0; i < positions; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (j == arr.length-1)
                        arr[j]=temp;
                    else
                        arr[j] = arr[j+1];
                }
                temp = arr[0];
            }
        }
        System.out.println("Массив после: " + Arrays.toString(arr));
    }

}


