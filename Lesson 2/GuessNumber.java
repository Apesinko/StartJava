import java.util.Scanner;
import java.util.Random;

public class GuessNumber {

	public void guess(Player player1, Player player2) { 
		Scanner scaner = new Scanner(System.in);	
		Random random = new Random();		
		int start = 0;
		int end = 100;
		int i = 0;
		int computerNumber = random.nextInt(end);
		int humanNumber;
		Player player;

		System.out.println("\nУгадайте число от " + start + " до " + end);
		do{			
			i++;
			if (i % 2 != 0) {
				player = player1;
			} else {
				player = player2;
			}
			
			System.out.println(player.getName() + ", введите число");
			humanNumber = scaner.nextInt();
			if (humanNumber >= start && humanNumber <= end) {
				if (humanNumber >= computerNumber){
					System.out.println("\nЗагаданное число меньше");
				} else if (humanNumber <= computerNumber) {
					System.out.println("\nЗагаданное число больше");
				}
			} else {
				System.out.println("\nВы ввели число не попадающие в интервал от "  + start + " до " + end);
			}
		} while(humanNumber != computerNumber);
		System.out.println(player.getName() + ", Вы угадали");		
	} 
}