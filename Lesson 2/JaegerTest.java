public class JaegerTest {
	public static void main(String[] args) {
		Jaeger jaegerOne = new Jaeger();
		Jaeger jaegerTwo = new Jaeger();

		jaegerOne.setModelName("Tacit Ronin");
		System.out.println("\nНазвание егеря: " + jaegerOne.getModelName());

		jaegerOne.setMark("Mark-1");
		System.out.println("Марка егеря: " + jaegerOne.getMark());

		jaegerOne.setOrigin("Japan");
		System.out.println("Страна производителя: " + jaegerOne.getOrigin());

		jaegerOne.setHeight(74.37);
		System.out.println("Высота егеря в метрах: " + jaegerOne.getHeight());

		jaegerOne.setWeight(7.45);
		System.out.println("Высота егеря в тоннах: " + jaegerOne.getWeight());

		jaegerOne.setSpeed(8);
		System.out.println("Скорость егеря: " + jaegerOne.getSpeed());

		jaegerOne.setStrenght(7);
		System.out.println("Прочность егеря: " + jaegerOne.getStrenght());

		jaegerOne.setArmor(3);
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