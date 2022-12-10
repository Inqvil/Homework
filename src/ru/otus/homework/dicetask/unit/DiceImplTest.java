package ru.otus.homework.dicetask.unit;

import ru.otus.homework.dicetask.assertions.Assertions;
import ru.otus.homework.dicetask.game.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public class DiceImplTest {

    private Dice dice = new DiceImpl();

    public void diceValueRange() {
        String scenario = "Проверка на выход за пределы диапазона кубика (от 1 до 6) ";

        try {
            for (int i = 0; i < 100; i++) {
                int rollValue = dice.roll();
                boolean pass = (rollValue > 0 && rollValue < 7);
                if (pass) {
                    System.out.println("тест пройден");
                } else {
                    throw new RuntimeException("выход за границы диапазона: " + rollValue);
                }
            }
        } catch (Throwable throwable) {
            System.err.println(scenario + "провален: " + throwable.getMessage());
        }
    }

    public void drawValueTest(){
        String scenario = "Проверка на ничью";
        int drawCount = 0;
        try {
            for (int i = 0; i < 100; i++){
                Assertions.assertEquals(dice.roll(), dice.roll());
                ++drawCount;
            }
            System.out.println(scenario + "пройден, ничейных позиций при 100 бросках: " + drawCount);
        }catch (Throwable throwable){
            System.err.println(scenario+ " не пройдена, при 100 попытках броска кубика было: " + drawCount + " ничейный позиций " + throwable.getMessage());
        }
    }

}
