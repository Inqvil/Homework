package ru.otus.homework.tesingsystemoop;

import java.util.Scanner;

public class Quiz extends PrintArray {
    private String [] questions =
            {"Количество материков на земле?",
                    "Столица Австралии?",
                    "Какая команда используется для копирования удаленного репозитория?",
                    "Что будет в результате выполнения операции 2 + 2 == 5 && 12 / 4 == 3 || 2 == 5 % 3"};

    private String [] answers = {"1) - 6 | 2) - 4 | 3) - 7 | 4) - 5",
            "1) - Сидней| 2) - Мельбурн | 3) - Канберра |  4) - Брисберн",
            "1) - commit | 2) - push | 3) - clone |  4) - copy",
            "1) - false | 2) - true | 3) - null | 4) - 0"};

    private int [] arrRightAnswers = {1, 3, 3, 2};

    public void startQuiz(){
        int correctAnswers = 0;
        int inCorrectAnswers = 0;
        Scanner sc = new Scanner(System.in);



        for (int i = 0; i < 4; i++){

            System.out.println(questions[i] + "\n"  + answers[i]);
            int choice = sc.nextInt();

            if (choice == 0){
                System.out.println(Menu.menuStr);
                break;}

            if (choice == arrRightAnswers[i]){
                ++correctAnswers;}

            else {
                ++inCorrectAnswers;}

        }
        System.out.println("Правильные ответы: " + correctAnswers +
                "\nНеправильные ответы " + inCorrectAnswers +
                "\n" + Menu.menuStr);
    }


    public void getAnswers(){
        printArrElement(answers);
        System.out.println("\n"+Menu.menuStr);
    }
    public void getQuestions(){
        printArrElement(questions);
        System.out.println("\n" + Menu.menuStr);;
    }
    public void getRightAnswers(){
        printArrElement(arrRightAnswers);
        System.out.println("\n" + Menu.menuStr);
    }

}
