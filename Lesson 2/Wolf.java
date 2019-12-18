public class Wolf {

	private char sex = 'W';
	private String name = "Грей";
	private int weight = 60;
	private String color = "серый";
	private int age = 3;

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if (age >= 8) {
			System.out.println("\nНовый возраст волка некоректный: " + age);	
		} else {
		this.age = age;
		}
	}

	public boolean go() {
		System.out.println("Волк идет");
		return true;
	}

	public boolean sit() {
		System.out.println("Волк сидит");
		return true;		
	}

	public void run() {
		System.out.println("Волк бежит");		
	}

	public void howl() {
		System.out.println("Волк воет: А-у-у-у-у-у");		
	}

	public boolean hunting() {
		System.out.println("Волк выслеживает добычу");
		return true;
	}
}