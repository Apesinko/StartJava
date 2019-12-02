public class Unicode {
	public static void main(String[] args) {
		System.out.println("Выведите в цикле символы кодировки Unicode в диапазоне [9398, 10178]. Если выводятся кракозябры, то [33, 126]");
		char i;
		for (i = 33; i <= 126; i++) {
			System.out.print(i + " ");
		}
	}
}