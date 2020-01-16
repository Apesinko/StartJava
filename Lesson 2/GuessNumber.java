import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int computerNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void guess() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int start = 0;
        int end = 100;
        boolean isFirstPlayer = true;
        Player currentPlayer;

        System.out.println("\nУгадайте число от " + start + " до " + end);
        computerNumber = random.nextInt(end + 1);

        do {
            if (isFirstPlayer) {
                currentPlayer = player1;
                isFirstPlayer = false;
            } else {
                currentPlayer = player2;
                isFirstPlayer = true;
            }

            System.out.println(currentPlayer.getName() + ", введите число");
            currentPlayer.setNumber(scanner.nextInt());

            if (currentPlayer.getNumber() >= start && currentPlayer.getNumber() <= end) {
                if (currentPlayer.getNumber() > computerNumber) {
                    System.out.println("\nЗагаданное число меньше");
                } else if (currentPlayer.getNumber() < computerNumber) {
                    System.out.println("\nЗагаданное число больше");
                }
            } else {
                System.out.println("\nВы ввели число не попадающие в интервал от "  + start + " до " + end);
            }
        } while (currentPlayer.getNumber() != computerNumber);

        System.out.println(currentPlayer.getName() + ", Вы угадали");
        scanner.nextLine();
    }
}