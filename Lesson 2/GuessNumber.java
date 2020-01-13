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
        Player player;

        System.out.println("\nУгадайте число от " + start + " до " + end);
        computerNumber = random.nextInt(end);

        do{
            if (isFirstPlayer) {
                player = player1;
                isFirstPlayer = false;
            } else {
                player = player2;
                isFirstPlayer = true;
            }

            System.out.println(player.getName() + ", введите число");
            player.setNumber(scanner.nextInt());

            if (player.getNumber() >= start && player.getNumber() <= end) {
                if (player.getNumber() > computerNumber) {
                    System.out.println("\nЗагаданное число меньше");
                } else if (player.getNumber() < computerNumber) {
                    System.out.println("\nЗагаданное число больше");
                }
            } else {
                System.out.println("\nВы ввели число не попадающие в интервал от "  + start + " до " + end);
            }
        } while (player.getNumber() != computerNumber);

        System.out.println(player.getName() + ", Вы угадали");
        scanner.nextLine();
    }
}