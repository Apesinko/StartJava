package com.startjava.Lesson_2_3_4.game;

import java.util.Scanner;


public class GuessNumberTest {
    public static void main(String[] args) {
        String answerContinueGame;
        int attemptsCount = 10;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя первого игрока");
        Player playerOne = new Player(scanner.nextLine(), attemptsCount);

        System.out.println("Введите имя второго игрока");
        Player playerTwo = new Player(scanner.nextLine(), attemptsCount);

        GuessNumber guessNumber = new GuessNumber(playerOne, playerTwo);
        do{
            guessNumber.guess();
            do {
                System.out.println("\nХотите ещё раз сыграть? yes/no.");
                answerContinueGame = scanner.nextLine();
            } while (!answerContinueGame.equals("yes") && !answerContinueGame.equals("no"));
        } while (answerContinueGame.equals("yes"));
    }
}