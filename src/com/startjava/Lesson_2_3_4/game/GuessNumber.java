package com.startjava.Lesson_2_3_4.game;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int start;
    private int end;
    private int computerNumber;
    private Random random;

    public GuessNumber(Player player1, Player player2, int start, int end) {
        this.player1 = player1;
        this.player2 = player2;
        this.start = start;
        this.end = end;
        random = new Random();
    }

    public void guess() {
        Scanner scanner = new Scanner(System.in);
        Player currentPlayer;
        boolean isFirstPlayer = true;
        computerMakesNumber();
        player1.resetAttemptsCount();
        player2.resetAttemptsCount();
        System.out.println("\nУгадайте число от " + start + " до " + end);

        do {
            currentPlayer = isFirstPlayer ? player1 : player2;
            isFirstPlayer = !isFirstPlayer;
            if (notHaveAttempts(player1) && notHaveAttempts(player2)) {
                System.out.printf("%s и %s проиграли", player1.getName(), player2.getName());
                break;
            }
            System.out.printf("%s, введите число. У вас осталось %d попыток\n", currentPlayer.getName(), currentPlayer.getAttemptsCount());
            currentPlayer.addNumber(scanner.nextInt());
            if (isInRange(currentPlayer.getLastNumber())) {
                if (currentPlayer.getLastNumber() > computerNumber) {
                    System.out.println("\nЗагаданное число меньше");
                } else if (currentPlayer.getLastNumber() < computerNumber) {
                    System.out.println("\nЗагаданное число больше");
                }
            } else {
                System.out.printf("\nВы ввели число не попадающие в интервал от %d до %d\n\n", start, end);
            }
            checkAttempt(currentPlayer);
        } while (currentPlayer.getLastNumber() != computerNumber);

        System.out.println(currentPlayer.getName() + ", Вы угадали");
        printEnteredNumbers(player1);
        System.out.println();
        printEnteredNumbers(player2);
    }

    private void computerMakesNumber() {
        computerNumber = random.nextInt(end + 1);
    }

    /**
     * Проверяет, что закончились попытки
     *
     * @return true / false
     */
    private boolean notHaveAttempts(Player player) {
        return player.getAttemptsCount() == 0;
    }

    /**
     * Проверяет попадание в диапазон
     *
     * @param number число
     * @return true / false
     */
    private boolean isInRange(int number) {
        return number >= start && number <= end;
    }

    /**
     * Проверяем, что у игрока есть попытки
     */
    private void checkAttempt(Player player) {
        if (notHaveAttempts(player) && player.getLastNumber() != computerNumber) {
            System.out.printf("У %s закончились попытки", player.getName());
        }
    }

    /**
     * Распечатывает в консоль массив чисел, введенных пользователем
     */
    private void printEnteredNumbers(Player player) {
        System.out.print(player.getName() + ": ");
        int[] enteredNumbers = player.getEnteredNumbers();
        for (int enteredNumber : enteredNumbers) {
            System.out.print(enteredNumber + " ");
        }
    }
}