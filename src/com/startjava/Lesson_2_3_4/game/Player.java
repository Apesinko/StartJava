package com.startjava.Lesson_2_3_4.game;

public class Player {
    private String name;
    private int number;
    private int attemptsCount;
    private int[] enteredNumbers; // массив введенных игроком чисел

    /**
     * Инициализирует поля экземпляра
     *
     * @param name          имя игрока
     * @param attemptsCount количество попыток ввода чисел
     */
    public Player(String name, int attemptsCount) {
        this.name = name;
        this.attemptsCount = attemptsCount;
        enteredNumbers = new int[attemptsCount];
    }

    /**
     * Проверяет, что закончились попытки
     *
     * @return true / false
     */
    public boolean notHaveAttempts() {
        return attemptsCount == 0;
    }

    /**
     * Сохраняет введенное пользователем число и уменьшает количество попыток
     *
     * @param number число введенное пользователем
     */
    public void enterNumber(int number) {
        this.number = number;
        // Записываем введеное пользователем число в массив
        enteredNumbers[enteredNumbers.length - attemptsCount] = number;
        // Минусуем попытки
        attemptsCount--;
    }

    /**
     * Распечатывает в консоль массив чисел, введенных пользователем
     */
    public void printEnteredNumbers() {
        System.out.print(name + ": ");
        for (int i = 0; i < enteredNumbers.length - attemptsCount; i++) {
            System.out.print(enteredNumbers[i] + " ");
        }
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public int getAttemptsCount() {
        return attemptsCount;
    }
}