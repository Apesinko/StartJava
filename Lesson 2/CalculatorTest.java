public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		double a = 4D;
		double b = 2D;
		double result; 
	
		// Проверям сложение
		result = 6D;
		System.out.println("\nТест суммирования пройден: " + (calculator.calculate(a, "+", b) == result));
		// Проверям вычитание
		result = 2D;
		System.out.println("\nТест вычитания пройден: " + (calculator.calculate(a, "-", b) == result));
		// Проверям умножение
		result = 8D;
		System.out.println("\nТест умножения пройден: " + (calculator.calculate(a, "*", b) == result));
		// Проверям деление
		result = 2D;
		System.out.println("\nТест деления пройден: " + (calculator.calculate(a, "/", b) == result));
		// Проверям возведение в степень
		result = 16D;
		System.out.println("\nТест вовзведения в степень пройден: " + (calculator.calculate(a, "^", b) == result));
		// Проверям деление с остатком
		result = 0D;
		System.out.println("\nТест деления с остатком пройден: " + (calculator.calculate(a, "%", b) == result));

		System.out.println("\n------------------------------------------------------------------------------");

		// Проверяем общение с пользователем
		calculator.inputData();
	}
}