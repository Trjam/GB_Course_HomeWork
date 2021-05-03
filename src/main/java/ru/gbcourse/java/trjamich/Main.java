package ru.gbcourse.java.trjamich;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(getArrAfter4(new int[]{1,4,1,4})));

        System.out.println(only1and4(new int[]{1, 1, 1, 4, 4, 4, 1, 4, 4}));


    }

    public static int[] getArrAfter4 (int [] arr) throws RuntimeException {
        int[] result = null;
        int elmNum = 0;

        for (int i = arr.length-1; i >=0 ; i--) {
            if (arr[i]==4) {
                elmNum = i+1;
                result = new int[arr.length-elmNum];
                break;
            }
        }
        if (result==null){
            throw new RuntimeException();
        }else {
            if (arr.length - elmNum >= 0) {
                System.arraycopy(arr, elmNum, result, 0, arr.length - elmNum);
            }
            return result;
        }
    }

    public static boolean only1and4 (int [] arr) {
        int have4 = 0;
        int have1 = 0;

        for (int j : arr) {
            if (j == 1) {
                have1++;
            } else if (j == 4) {
                have4++;
            } else {
                return false;
            }
        }
        return have1 > 0 && have4 > 0;
    }
}
