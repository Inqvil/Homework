package ru.otus.homework.simulators.arrayloops;

//Реализуйте метод, который принимает строку с пробелами и возвращает количество слов в этой строке.

public class TypesTaskWordCount {
    public static int wordCount(String input) {
        int whitespace = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' '){
                whitespace++;
            }

        }
        return whitespace;

    }

    private TypesTaskWordCount() {

    }

    public static void main(String[] args) {
        System.out.println(
                "В этой строке пять слов: " + wordCount("я пошел кушать еду в вкусно и точка сколько тут слов")
        );
    }
}