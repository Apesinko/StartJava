import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		Scanner scaner = new Scanner(System.in);		
		int start = 0;
		int end = 100;
		int computerNumber = 65;
		int humanNumber;

		System.out.println("\nУгадайте число от " + start + " до " + end);
		
		do{
			System.out.println("\nВведите число");
			// Считываем ввод с консоли
			humanNumber = scaner.nextInt();
			// Проверям диапазон
			if (humanNumber >= start && humanNumber <= end) {
				// Если попали в диапазон, проверяем число пользователя
				if (humanNumber >= computerNumber){
					System.out.println("\nЗагаданное число меньше");
				} else if (humanNumber <= computerNumber) {
					System.out.println("\nЗагаданное число больше");
				}
			} else {
				System.out.println("\nВы ввели число не попадающие в интервал от "  + start + " до " + end);
			}
		} while(humanNumber != computerNumber);
		System.out.println("\nВы угадали");		
	}
}