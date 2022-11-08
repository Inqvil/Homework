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



     public static int [] bubbleSort (int [] arr){

        boolean isSorted = false;
        int buf = 0;

        while (!isSorted){
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++){

                if (arr[i] > arr[i+1]){
                    isSorted = false;
                    buf = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = buf;

                }
            }
        }
        return arr;

    }

   public static int [] insertionSort(int [] arr) {
        for (int i = 1; i < arr.length; i++){
            int current = arr[i];
            int j = i;

            while (j > 0 && arr[j-1] > current){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = current;
        }
        return arr;
   }









}
