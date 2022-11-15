package ru.otus.homework.testingsystemoop;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz {
    public static void startQuiz(){
        QuizData quizData = new QuizData();
        Scanner sc = new Scanner(System.in);
        int correct = 0;
        int incorrect = 0;
        System.out.println("0 для выхода к меню");
        for (int i = 0; i < quizData.getLength(); i++){
            System.out.println(quizData.getQuestions(i) + "\n" + quizData.getAnswersIndex(i));

            int n = sc.nextInt();
            if (n == 0){
                break;
            }
            if (n == quizData.getRightAnswer(i)){
                ++correct;
            }
            else {
                ++incorrect;
            }
        }
        System.out.println("Правильно " + correct + "Неправильно" + incorrect);
    }



}

