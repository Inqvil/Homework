package ru.otus.homework.testingsystemoop;

import java.util.ArrayList;
import java.util.Arrays;


public class QuizData {

    private static String [] questions =
            {"Количество материков на земле?",
                    "Столица Австралии?",
                    "Какая команда используется для копирования удаленного репозитория?",
                    "Что будет в результате выполнения операции 2 + 2 == 5 && 12 / 4 == 3 || 2 == 5 % 3"};

    private static String [] answers = {"1) - 6 | 2) - 4 | 3) - 7 | 4) - 5",
            "1) - Сидней| 2) - Мельбурн | 3) - Канберра |  4) - Брисберн",
            "1) - commit | 2) - push | 3) - clone |  4) - copy",
            "1) - false | 2) - true | 3) - null | 4) - 0"};

    private static String [] arrRightAnswers = {"1", "3", "3", "2"};



    public static String getQuestion(int index){
        return questions[index];
    }
    public static String getAnswer(int index){
        return answers[index];
    }
    public static String getRightAnswers(int index){
        return arrRightAnswers[index];
    }
    public static Integer getSize(){
        return questions.length;
    }
    public static void printAllQuestions(){
        System.out.println(Arrays.toString(questions));

    }
    public static void printAnswers(){
        System.out.println(Arrays.toString(answers));
    }
    public static void printRightAnswers(){
        System.out.println(Arrays.toString(arrRightAnswers));
    }
}
