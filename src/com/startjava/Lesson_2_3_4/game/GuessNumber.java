package com.startjava.Lesson_2_3_4.game;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int computerNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void guess() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int start = 0;
        int end = 100;
        boolean isFirstPlayer = true;
        Player currentPlayer;

        System.out.println("\nУгадайте число от " + start + " до " + end);
        computerNumber = random.nextInt(end + 1);

        do {
            // Определяем текущего игрока
            if (isFirstPlayer) {
                currentPlayer = player1;
                isFirstPlayer = false;
            } else {
                currentPlayer = player2;
                isFirstPlayer = true;
            }
            // Если у обоих игроков не осталось попыток, то игра закончена
            if (player1.notHaveAttempts() && player2.notHaveAttempts()) {
                System.out.println(
                        String.format("%s и %s проиграли", player1.getName(), player2.getName())
                );
                break;
            }
            System.out.println(
                    String.format(
                            "%s, введите число. У вас осталось %d попыток",
                            currentPlayer.getName(), currentPlayer.getAttemptsCount()
                    )
            );
            // Считываем ввод с консоли и сохраняем число у пользователя
            currentPlayer.enterNumber(scanner.nextInt());
            // Проверяем попадание в диапазон
            if (currentPlayer.getNumber() >= start && currentPlayer.getNumber() <= end) {
                if (currentPlayer.getNumber() > computerNumber) {
                    System.out.println("\nЗагаданное число меньше");
                } else if (currentPlayer.getNumber() < computerNumber) {
                    System.out.println("\nЗагаданное число больше");
                }
            } else {
                System.out.println(
                        String.format("\nВы ввели число не попадающие в интервал от %d до %d", start, end)
                );
            }
            // Проверяем, что у игрока есть попытки
            if (currentPlayer.notHaveAttempts() && currentPlayer.getNumber() != computerNumber) {
                System.out.println(
                        String.format("У %s закончились попытки", currentPlayer.getName())
                );
            }
        } while (currentPlayer.getNumber() != computerNumber);

        System.out.println(currentPlayer.getName() + ", Вы угадали");
        player1.printEnteredNumbers();
        System.out.println();
        player2.printEnteredNumbers();
    }
}