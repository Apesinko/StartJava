package com.startjava.Lesson_2_3_4.game;

public class Player {
    private String name;
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
     * Возвращает индекс текущего пустого элемента массива
     *
     * @return индекс массива
     */
    public int getCurrentIndex() {
        return enteredNumbers.length - attemptsCount;
    }

    /**
     * Сохраняет введенное пользователем число и уменьшает количество попыток
     *
     * @param number число введенное пользователем
     */
    public void addNumber(int number) {
        enteredNumbers[getCurrentIndex()] = number;
        attemptsCount--;
    }

    /**
     * Находит последнее введенное число
     * 
     * @return число
     */
    public int getLastNumber() {
        return enteredNumbers[getCurrentIndex() - 1];
    }

    public String getName() {
        return name;
    }

    public int getAttemptsCount() {
        return attemptsCount;
    }

    public int[] getEnteredNumbers() {
        return enteredNumbers;
    }

}