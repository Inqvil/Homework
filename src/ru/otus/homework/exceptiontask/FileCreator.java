package ru.otus.homework.exceptiontask;

import java.io.File;
import java.io.IOException;

public class FileCreator {
    public static void createFile(String name) throws IOException {
        try {
            File file = new File(name);
            if (file.createNewFile()) {
                System.out.println("файл создан");
            } else {
                System.out.println("по этому пути уже есть файл");
            }
        }
        catch (IOException exception){
            System.out.println("случилась ошибка");
            throw new IOException();
        }
    }
}
