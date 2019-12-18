public class Wolf {

	char sex = 'W';
	String name = "Грей";
	int weight = 60;
	String color = "серый";
	int age = 3;

	boolean go(){
		System.out.println("Волк идет");
		return true;
	}

	boolean sit(){
		System.out.println("Волк сидит");
		return true;		
	}

	void run(){
		System.out.println("Волк бежит");		
	}

	void howl(){
		System.out.println("Волк воет: А-у-у-у-у-у");		
	}

	boolean hunting(){
		System.out.println("Волк выслеживает добычу");
		return true;
	}
}