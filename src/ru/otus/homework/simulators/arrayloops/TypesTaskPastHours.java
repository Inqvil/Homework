package ru.otus.homework.simulators.arrayloops;

public class TypesTaskPastHours {
    private static final int SECONDS_IN_DAY = 86400;

    public static int pastHours(int second) {
        if (second > SECONDS_IN_DAY || second < 0){
            return 0;
        }

        return second / 3600;



    }

    private TypesTaskPastHours(){

    }

    public static void main(String[] args) {
        System.out.println("С начала дня прошло 2 часа: " + pastHours(125* 60));
        System.out.println("С начала дня прошло 0 часа: " + pastHours(-10));
    }
}