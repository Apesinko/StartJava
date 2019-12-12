public class ConditionalStatement {
	public static void main(String[] args) {
		int age = 21;
		char sex = 'W';
		int height = 2;
		char firstLetterName = 'O';

		if (age > 20) {
			System.out.println("Вы старше 20 лет");
		}

		if (sex == 'M') {
			System.out.println("Вы мужчина");
		}

		if (sex != 'M') {
			System.out.println("Вы женщина");
		}

		if (height < 1.80) {
			System.out.println("Вы меньше 180 сантиметров");
		} else {
			System.out.println("Вы больше 180 сантиметров");
		}

		if (firstLetterName == 'M') {
			System.out.println("Ваше имя начинается с буквы M");
		} else if (firstLetterName == 'I'){
			System.out.println("Ваше имя начинается с буквы I");
		} else { 
			System.out.println("Я не знаю, с какой буквы начинается Ваше имя");
		}		
	}
}