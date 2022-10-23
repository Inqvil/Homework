package ru.otus.homework.simulators;

public class BracketUtil {
    public static boolean parsing(String str) {
        int check = 0;
        for (int i = 0; i < str.length(); i++) {
            if (check < 0) {
                return false;
            }
            String symbol = str.substring(i, i + 1);
            if (symbol.equals("(") || symbol.equals("{") || symbol.equals("[")) {
                check++;
                continue;
            }
            if (symbol.equals(")") || symbol.equals("}") || symbol.equals("]"))
                check--;
        }
        if (check == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String s = "((()))(){}}}{{{{[[[";
        System.out.println(parsing(s));
    }
}
