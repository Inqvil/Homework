package ru.otus.homework.testingsystemoop;

import java.util.Arrays;

public class InformationOutput extends QuizData{
    public void show(String [] arr){
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }

    public void showQuestions(){
        show(getQuestions());
    }
    public void showAnswers(){
        show(getAnswers());
    }

}
















