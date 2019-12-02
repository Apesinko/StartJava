import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		//В задание сказано, что калькулятор должен работать с целыми положительными числами. 
		//Для этого необходимо использовать тип данных int. В это случае, при делении меньшего
		//числа на большее результат будет равен 0. Поэтому использовала тип данных double.	
		double result;
		System.out.println("Какую операцию вы хотите выполнить?");
		System.out.println("1. Сложение");
		System.out.println("2. Вычитание");
		System.out.println("3. Умножение");
		System.out.println("4. Деление");
		System.out.println("5. Возведение в степень");
		System.out.println("6. Деление с остатком");
		Scanner scaner = new Scanner(System.in);
		int operation = scaner.nextInt();

		while (operation > 6) {
			System.out.println("Введите другой номер операции от 1 до 6");
			operation = scaner.nextInt();
		} 
		
		System.out.println("Введите первое число");
		double a = scaner.nextInt();
		System.out.println("Введите второе число");
		double b = scaner.nextInt();
		
		if (operation == 1) {
			result = a + b;
			System.out.println("Операция сложения = " + result);
		
		} else if (operation == 2) {
			result = a - b;
			System.out.println("Операция вычитания = " + result);
		
		} else if (operation == 3) {
			result = a * b;
			System.out.println("Операция умножения = " + result);
		
		} else if (operation == 4) {
			result = a / b;
			System.out.println("Операция деления = " + result);
		
		} else if (operation == 5) {
			result = a;
			while (b > 1) {
				result = result * a;
				b--;
			}
			System.out.println("Операция возведения в степень = " + result);		
		
		} else if (operation == 6) {
			result = a % b;
			System.out.println("Операция нахождения остатка от деления = " + result);
		}		
	}
}