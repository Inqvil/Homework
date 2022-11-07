package ru.otus.homework.basicsalgorithms;

import java.util.Arrays;

public class SortingAlgorithms {







    public static int [] createIntArr(int length, int minValue, int maxValue){
        int [] arr = new int[length];

        for(int i = 0; i < length; i++){
            arr[i] = ((int) (Math.random()*maxValue) - minValue);
        }
        return arr;

    }
    public static void bubbleSort (int [] arr){
        boolean isSorted = false;

        int buf = 0;

        while (!isSorted){
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i+1]){
                    isSorted = false;
                    arr[i] = buf;


                }

            }
        }
    }



}
