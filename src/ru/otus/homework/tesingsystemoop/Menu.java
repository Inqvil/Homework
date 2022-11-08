package ru.otus.homework.tesingsystemoop;

import java.util.Scanner;

public class Menu{
    Quiz quiz = new Quiz();
    public static String menuStr = "1. Начать тест\n" +
            "2.Показать вопросы\n" +
            "3.Показать ответы\n" +
            "4.Показать правильные ответы\n" +
            "5.Выход";

    public  void menuApp(){
        System.out.println(menuStr);
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (exit != true){

            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    quiz.startQuiz();
                    break;
                case 2:
                    quiz.getQuestions();
                    break;
                case 3:
                    quiz.getAnswers();
                    break;
                case 4:
                    quiz.getRightAnswers();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("выбрано неправильно значение");
            }
            if (exit){
                break;
            }
        }
    }
}
