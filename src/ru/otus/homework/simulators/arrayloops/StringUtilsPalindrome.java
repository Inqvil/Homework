package ru.otus.homework.simulators.arrayloops;

public class StringUtilsPalindrome {
    public static boolean isPalindrome(String input) {
        String str = input.replaceAll("\\w","");
        String str1 = new String(str);
        return false;





    }


    private StringUtilsPalindrome() {

    }

    public static void main(String[] args) {
        System.out.println("При вводе строки \"шалаш\" метод должен вернуть true - " + StringUtilsPalindrome.isPalindrome("шалаш"));

    }
}