public class Variable {
	public static void main(String[] args) {
		byte processorCore = 6; 
		short ram = 16; 
		int windowVersion = 10; 
		long hdd= 953344L;
		float ramFrequency = 3.2F;
		double cpuFrequency = 3.19D; 
		char cpuProducer1 = 'I'; 
		char cpuProducer2 = 'n';
		char cpuProducer3 = 't';
		char cpuProducer4 = 'e';
		char cpuProducer5 = 'l';
		boolean isPro = true; 

		System.out.println(
			"Количество ядер процессора: " + processorCore + "\n" +
			"Оперативная память: " + ram + "\n" +
			"Версия Windows: " + windowVersion + "\n" +
			"Объём жесткого диска в мегабайтах: " + hdd  + "\n" +
			"Тактовая частота RAM: " + ramFrequency + "\n" +
			"Тактовая частота CPU: " + cpuFrequency + "\n" +
			"Производитель процессора: " + cpuProducer1 + cpuProducer2 + cpuProducer3 + cpuProducer4 + cpuProducer5 + "\n" +
			"Является ли Windows версией Pro? " + isPro
		);
		
	}
}