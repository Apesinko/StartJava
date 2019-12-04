public class GuessTheNumber {
	public static void main(String[] args) {
		System.out.println("Угадайте число от 0 до 100");
		int computerNumbler = 65;
		int humanNumber = -5;
		System.out.println("\n" + humanNumber);

		if (humanNumber == computerNumbler){
			System.out.println("\nВы угадали");
		} else if (humanNumber >= computerNumbler && humanNumber < 100){
			System.out.println("\nЗагаданное число меньше");
		} else if (humanNumber <= computerNumbler && humanNumber > 0){
			System.out.println("\nЗагаданное число больше");
		}
	if (humanNumber > 0) {
		System.out.println("\nВы ввели число не попадающее в интервал от 0 до 100");					
		System.out.println("\nУгадайте число от 0 до 100");
	} else if (humanNumber < 100) {
		System.out.println("\nВы ввели число не попадающие в интервал от 0 до 100");					
		System.out.println("\nУгадайте число от 0 до 100");
		}
	}
}
