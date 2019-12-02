public class Cycle {
	public static void main(String[] args) {
		System.out.println("Выведите на консоль с помощью цикла for все числа от [0, 20]");
		int i;
		for (i = 0; i <= 20; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println("\nВыведите на консоль с помощью цикла while все числа от [6, -6] (шаг итерации равен 2)");
		int j = 6;
		while (j >= -6) {
			System.out.print(j + " ");
			j = j - 2;
		}

		System.out.println("\nВыведите на консоль с помощью цикла do-while сумму всех нечетных чисел от [10, 20]");
		int k = 10;	
		int sum = 0;
		do {
			if (k % 2 != 0) {
				sum = sum + k;
			}
			k++;
		} while (k < 20);
		System.out.println("Сумма нечетных чисел от [10, 20] равна = " + sum);
	}
}