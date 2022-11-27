package ru.otus.homework.exceptiontask;


import java.io.File;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        String separator = File.separator;

        String filePath = "D:" + separator + "copythat" + separator + "anek.txt";

        ControlPart.readFile(filePath);

        ControlPart.createFile("anotherAnek.txt");
        String anotherAnekPath = separator +"IdeaProjects" + separator + "Homework" + separator + "anotherAnek.txt";
        ControlPart.addContent(anotherAnekPath, "После страшной аварии спасатели достали из машины пол уокера, а потом ещё пол уокера");
        ControlPart.readFile(anotherAnekPath);







    }
}
