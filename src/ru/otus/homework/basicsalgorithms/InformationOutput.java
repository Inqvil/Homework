package ru.otus.homework.basicsalgorithms;


import java.util.Date;

public class InformationOutput extends PrintArrToTheLine {




    public void bubbleSortRunningTime(){
        int[] intArr = SortingAlgorithms.createIntArr(10_000, -100, 100);
        printArrElement(intArr);

        System.out.println("исходный массив\n" + "-----------------------------------------------" + "Происходит сортировка..." );

        long time = System.currentTimeMillis();

        SortingAlgorithms.bubbleSort(intArr);



        long timeBubble = System.currentTimeMillis() - time;
        System.out.println("Отсортированный массив \n ________________________________________________________________" );
        printArrElement(intArr);

        System.out.println("массив упорядочен, время выполнения в миллисекундах: " + timeBubble
        +   "\nВ секундах:" + (double) timeBubble/1000);
    }

    public void insertionSortRunningTime() {
        int[] intArr = SortingAlgorithms.createIntArr(10_000, -100, 100);
        printArrElement(intArr);

        System.out.println("исходный массив\n" + "-----------------------------------------------" + "Происходит сортировка..." );
        long time = System.currentTimeMillis();

        SortingAlgorithms.insertionSort(intArr);
        long timeBubble = System.currentTimeMillis() - time;

        System.out.println("Отсортированный массив \n ________________________________________________________________" );
        printArrElement(intArr);

        System.out.println("массив упорядочен, время выполнения в миллисекундах: " + timeBubble
                +   "\nВ секундах:" + (double) timeBubble/1000);



    }



}
