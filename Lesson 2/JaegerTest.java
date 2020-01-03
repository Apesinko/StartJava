public class JaegerTest {
	public static void main(String[] args) {
		Jaeger jaegerOne = new Jaeger("Tacit Ronin", "Mark-1", "Japan", 74.37D, 7.45D, 8, 7, 3);
		Jaeger jaegerTwo = new Jaeger();

		System.out.println("\nНазвание егеря: " + jaegerOne.getModelName());
		System.out.println("Марка егеря: " + jaegerOne.getMark());
		System.out.println("Страна производителя: " + jaegerOne.getOrigin());
		System.out.println("Высота егеря в метрах: " + jaegerOne.getHeight());
		System.out.println("Высота егеря в тоннах: " + jaegerOne.getWeight());
		System.out.println("Скорость егеря: " + jaegerOne.getSpeed());
		System.out.println("Прочность егеря: " + jaegerOne.getStrenght());
		System.out.println("Броня егеря: " + jaegerOne.getArmor());

		jaegerOne.drift();
		jaegerOne.scanKaijy();

		jaegerTwo.setModelName("Hydra Corinthian");
		System.out.println("\nНазвание егеря: " + jaegerTwo.getModelName());

		jaegerTwo.setMark("Mark-4");
		System.out.println("Марка егеря: " + jaegerTwo.getMark());

		jaegerTwo.setOrigin("United States of America");
		System.out.println("Страна производителя: " + jaegerTwo.getOrigin());

		jaegerTwo.useVortexCannon();
		jaegerTwo.move();
	}
}