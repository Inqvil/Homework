package ru.otus.homework.testingsystemoop;

import java.util.Scanner;

class Menu {
    public static String strMenu = "1. начать тест\n" + "2.Показать вопросы\n" + "3. Показать ответы\n" + "4.выйти из приложения";
    public static void appMenu() {
        Scanner sc = new Scanner(System.in);
        Quiz quiz = new Quiz();

        System.out.println(strMenu);

        boolean exit = false;
        while (exit != true) {
            int count = sc.nextInt();

            String choice1 = "Здесь вторая";
            String choice2 = "Здесь третья";
            String choice3 = "Здесь четвертая";
            switch (count) {
                case 1:
                    quiz.startQuiz();
                    break;
                case 2:
                    quiz.getQuestions();
                    break;

                case 3:
                    System.out.println(choice3);
                    quiz.getAnswers();

                    break;
                case 4:
                    exit = true;
                    break;

                default:
                    System.out.println("выбраное неправильное значние");
                    break;

            }if (exit) {
                break;
            }
            }

        }


    }


