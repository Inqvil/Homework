package ru.otus.homework.testingsystemoop;

import java.util.Scanner;

public class Menu {
    public static void menu(){
        Scanner sc = new Scanner(System.in);

        String menuStr = "1.Начать тест\n2.Проверить вопросы\n3.Проверить ответы\n4.Выйти";


        boolean exit = false;

        while (!exit){
            System.out.println(menuStr);
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    Quiz.startQuiz();
                    break;
                case 2:
                    QuizData.printAllQuestions();
                    break;
                case 3:
                    QuizData.printAnswers();
                    break;
                case 4:
                    exit = true;
                    break;
            }
        }
    }
}
