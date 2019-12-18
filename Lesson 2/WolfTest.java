public class WolfTest {

	public static void main(String[] args) {
		Wolf wolfOne = new Wolf();
		System.out.println("\nКличка волка: " + wolfOne.getName());
		System.out.println("Возраст волка: " + wolfOne.getAge());
		System.out.println("Цвет шерсти волка: " + wolfOne.getColor());
		wolfOne.sit();
		wolfOne.howl();

		wolfOne.setAge(10);
		System.out.println("\nНовый возраст волка: " + wolfOne.getAge());

		wolfOne.setColor("черный");
		System.out.println("Новый цвет волка: " + wolfOne.getColor());

		wolfOne.setName("Черняш");
		System.out.println("Новая количка волка: " + wolfOne.getName());
	}
}