package ru.otus.homework.testingsystemoop;

import java.util.Scanner;

public class Quiz {
    public static void startQuiz(){
        Scanner sc = new Scanner(System.in);
        int correct = 0;
        int incorrect = 0;

        for(int i = 0; i < QuizData.getSize(); i++){
            Broker broker = new Broker(i);
            System.out.println(broker);
            int n = sc.nextInt();
            if (n == Integer.parseInt(broker.getRightAnswer())){
                correct++;
            }
            else {
                incorrect++;
            }
        }
        System.out.println("Количество правильных ответов: " + correct + "\n" + "Неправильных: " + incorrect );



    }
}
