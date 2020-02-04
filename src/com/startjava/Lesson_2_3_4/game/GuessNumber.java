package com.startjava.Lesson_2_3_4.game;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int start;
    private int end;
    private int computerNumber;

    public GuessNumber(Player player1, Player player2, int start, int end) {
        this.player1 = player1;
        this.player2 = player2;
        this.start = start;
        this.end = end;
        computerNumber = new Random().nextInt(end + 1);
    }

    /**
     * Проверяет, что закончились попытки
     *
     * @return true / false
     */
    public boolean notHaveAttempts(Player player) {
        return player.getAttemptsCount() == 0;
    }

    /**
     * Распечатывает в консоль массив чисел, введенных пользователем
     */
    public void printEnteredNumbers(Player player) {
        System.out.print(player.getName() + ": ");
        for (int i = 0; i < player.getCurrentIndex(); i++) {
            System.out.print(player.getArrayEnteredNumbers()[i] + " ");
        }
    }

    /**
     * Проверяем, что у игрока есть попытки
     */
    public void checkAttempt(Player player) {
        if (notHaveAttempts(player) && player.getLastEnteredNumber() != computerNumber) {
            System.out.println(
                    String.format("У %s закончились попытки", player.getName())
            );
        }
    }

    /**
     * Проверяет попадание в диапазон
     *
     * @param number число
     * @return true / false
     */
    public boolean isInRange(int number) {
        return number >= start && number <= end;
    }

    public void guess() {
        Scanner scanner = new Scanner(System.in);
        Player currentPlayer;
        boolean isFirstPlayer = true;
        System.out.println("\nУгадайте число от " + start + " до " + end);

        do {
            currentPlayer = isFirstPlayer ? player1 : player2;
            isFirstPlayer = !isFirstPlayer;
            // Если у обоих игроков не осталось попыток, то игра закончена
            if (notHaveAttempts(player1) && notHaveAttempts(player2)) {
                System.out.println(String.format("%s и %s проиграли", player1.getName(), player2.getName()));
                break;
            }
            System.out.println(
                    String.format(
                            "%s, введите число. У вас осталось %d попыток",
                            currentPlayer.getName(), currentPlayer.getAttemptsCount()
                    )
            );
            // Считываем ввод с консоли и сохраняем число у пользователя
            currentPlayer.addNumber(scanner.nextInt());
            if (isInRange(currentPlayer.getLastEnteredNumber())) {
                if (currentPlayer.getLastEnteredNumber() > computerNumber) {
                    System.out.println("\nЗагаданное число меньше");
                } else if (currentPlayer.getLastEnteredNumber() < computerNumber) {
                    System.out.println("\nЗагаданное число больше");
                }
            } else {
                System.out.println(String.format("\nВы ввели число не попадающие в интервал от %d до %d", start, end));
            }
            // Проверяем, что у игрока есть попытки
            checkAttempt(currentPlayer);
        } while (currentPlayer.getLastEnteredNumber() != computerNumber);

        System.out.println(currentPlayer.getName() + ", Вы угадали");
        printEnteredNumbers(player1);
        System.out.println();
        printEnteredNumbers(player2);
    }
}