package ru.otus.homework.simulators.arrayloops;



public class TypesTaskSumN {
    public static long sumN(int input) {

        if (input < 1){
            return 0;
        }
        int current = 0;
        for (int i = 1; i <= input; i++){
            current += i;
        }
        return current;
    }

    private TypesTaskSumN() {

    }

    public static void main(String[] args) {
        System.out.println(
                "Ввод меньше 1 должен вернуть 0: " +
                        sumN(-1)
        );
        System.out.println(
                "Сумма от 1 до 7: " +
                        sumN(7)
        );
    }
}