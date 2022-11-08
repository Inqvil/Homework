package ru.otus.homework.basicsalgorithms;

import ru.otus.homework.tesingsystemoop.PrintArray;

public class PrintArrToTheLine extends PrintArray {
    @Override
    public void printArrElement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
