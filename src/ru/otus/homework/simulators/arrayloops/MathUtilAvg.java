package ru.otus.homework.simulators.arrayloops;

public class MathUtilAvg {
    public static int getPrimeNumbersSum(byte lowEdge, byte highEdge) {
        if ((lowEdge < highEdge) &&
                        (lowEdge < 0 & highEdge < 0))
                {return 1;}

        int sum = 0;
        int counter = 0;

        for(int i = lowEdge; i <= highEdge; i++){
            if (i %2 == 0){
                sum +=i;
                ++counter;
            }
        }

        return sum/counter;


    }


    private MathUtilAvg() {

    }

    public static void main(String[] args) {
        System.out.println("avg четных чисел у ряда с 1 до 10 должен равняться 6 - "
                + MathUtilAvg.getPrimeNumbersSum((byte) 1, (byte) 10));
    }

}