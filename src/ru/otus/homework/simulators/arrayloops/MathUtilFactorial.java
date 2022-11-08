package ru.otus.homework.simulators.arrayloops;



public class MathUtilFactorial {
    public static long getFactorial(byte number) {
        int result = 1;


        for (int i = 1; i <= number; i++){
            result = result * i;
        }
        return result;




    }

    private MathUtilFactorial() {

    }

    public static void main(String[] args) {
        System.out.println("Факториал от 5 должен равняться 120 - " + getFactorial((byte) 5));
    }
}