package ru.otus.homework.basicsalgorithms;


import java.util.Scanner;

public class Menu {


    public static String strMenu = "Создает массив, заполненный случайными числами, длиной 10 000 и применяет к нему:\n" +
            "1.Сортировка пузырьком\n"
            + "2.Сортировка вставками\n" +
            "5.выход";

    public static void menuApp(){

        InformationOutput informationOutput = new InformationOutput();

        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (!exit){
            System.out.println(Menu.strMenu);
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    informationOutput.bubbleSortRunningTime();

                    break;
                case 2:
                    informationOutput.insertionSortRunningTime();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    exit = true;
                    break;
            }
            if (exit){
                break;
            }
        }
    }
}
