package ru.otus.homework.testingsystemoop;

import java.util.Scanner;

public class Menu {
    public static String strMenu = "1.Начать тест\n2.Показать вопросы\n3.Показать Ответы\n4.Выйти";

    public static void appMenu(){
        QuizData quizData = new QuizData();
        InformationOutput informationOutput = new InformationOutput();
        boolean exit = false;
        Scanner sc = new Scanner(System.in);
        while (!exit){
            System.out.println(strMenu);
            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    Quiz.startQuiz();
                    break;
                case 2:
                    informationOutput.showQuestions();
                    break;
                case 3:
                    informationOutput.showAnswers();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("неправильное значени");
                    break;
            }
            if (exit){
                break;
        }

        }

    }
}
