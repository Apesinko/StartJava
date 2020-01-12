import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	

		System.out.println("Введите имя первого игрока");
		Player playerOne = new Player(scanner.nextLine());

		System.out.println("Введите имя второго игрока");
		Player playerTwo = new Player(scanner.nextLine());

		GuessNumber guessNumber = new GuessNumber(playerOne, playerTwo);
		guessNumber.guess();

	}
}