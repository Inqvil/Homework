package ru.otus.homework.exceptiontask;


import java.io.FileWriter;
import java.io.IOException;

public class FileAddContent {
    public static void addContent(String path, String content){
        try (FileWriter writer = new FileWriter(path, false)){
            //поставил false чтоб можно было по несколько раз запускать и видеть одну копию пола уокера
            writer.write(content);
            System.out.println("контент добавлен");
        }catch (IOException exception){
            System.out.println("ошибка");
            exception.printStackTrace();


        }
    }

}
