package com.startjava.Lesson_2_3_4.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        inputData();
    }

    public static void inputData() {
        Scanner scanner = new Scanner(System.in);
        String answerContinueGame;

        System.out.println("\nКАЛЬКУЛЯТОР");

        do {
            System.out.println("\nВведите математическое выражение через пробел ");
            String equation = scanner.nextLine();
            String[] array = equation.split(" ");

            double a = Double.parseDouble(array[0]);
            String operation = array[1];
            double b = Double.parseDouble(array[2]);

            System.out.println("\nВычисление равно = " + calculate(a, operation, b));

            do {
                System.out.println("\nХотите сделать ещё одно вычисление? yes/no.");
                answerContinueGame = scanner.nextLine();
            } while (!answerContinueGame.equals("yes") & !answerContinueGame.equals("no"));

        } while (answerContinueGame.equals("yes"));
    }

    public static double calculate(double a, String operation, double b) {
        double result = 0;
        switch (operation) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            case "^":
                result = Math.pow(a, b);
                break;
            case "%":
                result = Math.IEEEremainder(a, b);
                break;
        }
        return result;
    }
}