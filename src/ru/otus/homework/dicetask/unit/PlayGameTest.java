package ru.otus.homework.dicetask.unit;

import ru.otus.homework.dicetask.assertions.Assertions;
import ru.otus.homework.dicetask.game.*;


import java.util.ArrayList;
import java.util.List;

public class PlayGameTest {
    private Player player;
    private Player player1;

    private int diceResult;
    private int diceResult1;

    public PlayGameTest(Player player, Player player1, int diceResult, int diceResult1){
        this.player = player;
        this.player1 = player1;
        this.diceResult = diceResult;
        this.diceResult1 = diceResult1;
    }

    public void winnerGameTest(Player exceptedWinner) {
        String scenario = "Проверка победителя игры";

        Player winner = (this.diceResult > this.diceResult1) ? this.player : this.player1;
        try {
          Assertions.assertEquals(exceptedWinner.getName(), winner.getName());
            System.out.println(scenario + " пройден");
    }catch (Throwable throwable){
        System.err.println(scenario + throwable.getMessage());}
    }

}