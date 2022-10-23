package ru.otus.homework.testingsystem;

import java.util.Scanner;

public class TestingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int correctAnswers = 0;
        int incorrectAnswers = 0;


        String [] questions =
                {"Количество материков на земле?",
                "Столица Австралии?",
                "Какая команда используется для копирования удаленного репозитория?",
                "Что будет в результате выполнения операции 2 + 2 == 5 && 12 / 4 == 3 || 2 == 5 % 3"};

        String [] answers = {"1) - 6 | 2) - 4 | 3) - 7 | 4) - 5",
                "1) - Сидней| 2) - Мельбурн | 3) - Канберра |  4) - Брисберн",
                "1) - commit | 2) - push | 3) - clone |  4) - copy",
                "1) - false | 2) - true | 3) - null | 4) - 0"};

        int [] arrRightAnswers = {1, 3, 3, 2};



        for (int i = 0; i < questions.length; i ++){
            System.out.println(questions[i] + "\n" + answers[i]);
            int answer = sc.nextInt();
            if (answer == arrRightAnswers[i]){
                ++correctAnswers;
            }
            else {
                ++incorrectAnswers;
            }


        }

        System.out.println("Общее количество" +
                "\n" + "Правильных ответов: " + correctAnswers +
                "\nНеправильных ответов: " + incorrectAnswers);


    }
}
