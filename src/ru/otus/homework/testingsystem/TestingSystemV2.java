package ru.otus.homework.testingsystem;

import java.util.Scanner;

public class TestingSystemV2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int correctAnswers = 0;
        int incorrectAnswers = 0;

        Object [][][] questionsAnswers = new Object[3][4][4];

        questionsAnswers[0][0][0] = "Количество материков на земле?";
        questionsAnswers[0][0][1] = "Столица Австралии?";
        questionsAnswers[0][0][2] = "Какая команда используется для копирования удаленного репозитория?";
        questionsAnswers[0][0][3] = "Что будет в результате выполнения операции 2 + 2 == 5 && 12 / 4 == 3 || 2 == 5 % 3";

        questionsAnswers[1][0][0] = "1) - 6 | 2) - 4 | 3) - 7 | 4) - 5";
        questionsAnswers[1][0][1] = "1) - Сидней| 2) - Мельбурн | 3) - Канберра |  4) - Брисберн";
        questionsAnswers[1][0][2] = "1) - commit | 2) - push | 3) - clone |  4) - copy";
        questionsAnswers[1][0][3] = "1) - false | 2) - true | 3) - null | 4) - 0";



        questionsAnswers[2][0][0] = 1;
        questionsAnswers[2][0][1] = 3;
        questionsAnswers[2][0][2] = 3;
        questionsAnswers[2][0][3] = 2;

        for (int i = 0; i < 4; i++){
            System.out.println(questionsAnswers[0][0][i] + "\n" + questionsAnswers[1][0][i]);
            int n = sc.nextInt();


            if (n == (Integer) questionsAnswers[2][0][i]){
                ++correctAnswers;
            }
            else {
                ++incorrectAnswers;
            }
        }
        System.out.println("Правильных ответов: " + correctAnswers + "\n" +
                "Неправильных ответов: " + incorrectAnswers);

    }
    }