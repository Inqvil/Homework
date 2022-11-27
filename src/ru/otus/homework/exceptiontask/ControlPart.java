package ru.otus.homework.exceptiontask;

import java.io.IOException;

public class ControlPart {
    public static void createFile(String name) throws IOException {
        FileCreator.createFile(name);
    }
    public static void addContent(String path, String content){
        FileAddContent.addContent(path, content);
    }
    public static void readFile(String filePath){
        FileReader.readFile(filePath);
    }
}

