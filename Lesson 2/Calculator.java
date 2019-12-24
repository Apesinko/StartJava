import java.util.Scanner;

public class Calculator {
    public void userInterface() {
        Scanner scanner = new Scanner(System.in);
        String answerContinueGame;

        System.out.println("\nКАЛЬКУЛЯТОР");

        do {
            System.out.println("\nВведите знак математической операции: +, -, *, /, ^, %");
            String operation = scanner.nextLine();

            while (!operation.equals("+") & !operation.equals("-") & !operation.equals("*") & !operation.equals("/") & !operation.equals("^") & !operation.equals("%")) {
                System.out.println("\nВведите другой знак математической операции: +, -, *, /, ^, %");
                operation = scanner.nextLine();
            }

            System.out.println("\nВведите первое число: ");
            double a = scanner.nextInt();
            System.out.println("\nВведите второе число: ");
            double b = scanner.nextInt();
            scanner.nextLine();

            System.out.println("\nВычисление равно = " + calc(a, operation, b));

            do {
                System.out.println("\nХотите сделать ещё одно вычисление? yes/no.");
                answerContinueGame = scanner.nextLine();
            } while (!answerContinueGame.equals("yes") & !answerContinueGame.equals("no"));

        } while (answerContinueGame.equals("yes"));
    }

    public double calc(double a, String operation, double b) {
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
                result = a % b;
                break;
        }
        return result;
    }
}