package ru.otus.homework.testingsystemoop;

import java.util.ArrayList;

public class QuizData {
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



     String getQuestions(int index) {
        return questions[index];
    }
     String getAnswersIndex(int index) {
        return answers[index];
    }



     String [] getQuestions() {
        return questions;
    }
     String [] getAnswers() {
        return answers;
    }


    int getLength(){
        return questions.length;
    }

    int getRightAnswer(int index){
        return arrRightAnswers[index];


    }
}
