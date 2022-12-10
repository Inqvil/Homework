package ru.otus.homework.dicetask;

import ru.otus.homework.dicetask.game.Dice;
import ru.otus.homework.dicetask.game.DiceImpl;
import ru.otus.homework.dicetask.game.Player;
import ru.otus.homework.dicetask.unit.DiceImplTest;
import ru.otus.homework.dicetask.unit.PlayGameTest;

public class HomeWork {

    /*
        Заготовка для ДЗ представляет собой игру в кости.
        При вызове game.playGame(), два игрока кидают кости.
        Выигрывает игрок, у кого результат (1-6) больше
        Написать тесты (минимум 4) на классы DiceImpl и Game.
        Тесты должны найти не менее двух ошибок.
        Информацию о пройденном тесте предлагается выводить в System.out, а об упавшем в System.err
     */

    public static void main(String[] args) {
        new DiceImplTest().drawValueTest();
        new DiceImplTest().diceValueRange();
        new PlayGameTest(new Player("Вася"), new Player("Игорь"), 3,3).winnerGameTest(new Player("Вася"));
    }

}