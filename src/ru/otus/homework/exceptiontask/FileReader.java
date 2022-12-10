package ru.otus.homework.exceptiontask;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
    public static void readFile(String filePath){
        File file = new File(filePath);
        try(Scanner sc = new Scanner(file)) {

            while (sc.hasNextLine()){
                String str = sc.nextLine();
                System.out.println(str);

            }
        }catch (FileNotFoundException fileNotFoundException){
            System.out.println("файл не нйден");
            fileNotFoundException.printStackTrace();
        }
    }
}
