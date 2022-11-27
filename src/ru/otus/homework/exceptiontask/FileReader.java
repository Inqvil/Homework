package ru.otus.homework.exceptiontask;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
    public static void readFile(String filePath){
        try {
            File file = new File(filePath);
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()){
                String str = sc.nextLine();
                System.out.println(str);
            }sc.close();
        }catch (FileNotFoundException fileNotFoundException){
            System.out.println("файл не нйден");
            fileNotFoundException.printStackTrace();
        }
    }
}
