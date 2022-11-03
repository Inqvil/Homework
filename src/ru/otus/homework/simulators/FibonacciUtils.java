package ru.otus.homework.simulators;

import java.math.BigInteger;
/*
Дано число. Реализуйте метод, который вычисляет числа Фибоначчи (0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 ...), находит их сумму и возвращает её в виде строки.
Формула расчёта чисел: Fn = Fn-1 + Fn-2 - где n переданное в метод число.
Например для n=5 сумма будет равна 7, а для n=2 сумма будет равна 1.
Если в метод передано отрицательное число - он должен вернуть 0.
 */

public class FibonacciUtils {
    public static String getFibonacciSum(byte limit) {

        return "0";
    }

    private FibonacciUtils(){

    }

    public static void main(String[] args) {
        System.out.println("Сумма чисел фибоначчи до 5 должна равняться 7 - " + FibonacciUtils.getFibonacciSum((byte) 5));
    }
}