package ru.otus.homework.simulators;



public class WordUtils {
    public static String reverseWords(String str) {

        String reverseStr = "";

        char [] reverseArray = str.toCharArray();

        for (int i = reverseArray.length - 1; i >= 0; i --){
            reverseStr += reverseArray[i];
        }
        return reverseStr;
    }

    private WordUtils() {

    }

    public static void main(String[] args) {
        System.out.println("Ввод пустой строки - " + WordUtils.reverseWords(""));
        System.out.println("Ввод одного слова - " + WordUtils.reverseWords("word"));
        System.out.println("Ввод двух слов - " + WordUtils.reverseWords("два слова"));
    }
}