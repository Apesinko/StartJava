public class WolfTest {

	public static void main(String[] args){
		Wolf wolfOne = new Wolf();
		System.out.println("\nКличка волка: " + wolfOne.name);
		System.out.println("Возраст волка: " + wolfOne.age);
		System.out.println("Возраст волка: " + wolfOne.color);
		wolfOne.sit();
		wolfOne.howl();
	}
}