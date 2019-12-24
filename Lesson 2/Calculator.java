public class Calculator {
	public static void main(String[] args) {

		String answerContinueGame;
		String operation;

		System.out.println("\nКАЛЬКУЛЯТОР");

		do{			
			System.out.println("\nВведите знак математической операции: +, -, *, /, ^, %");
			String operation;

			while (!operation.equals("+") & !operation.equals("-") & !operation.equals("*") & !operation.equals("/") & !operation.equals("^") & !operation.equals("%")) {
				System.out.println("\nВведите другой знак математической операции: +, -, *, /, ^, %");
				operation;
			}

			double result;
			System.out.println("\nВведите первое число: ");
			double a;
			System.out.println("\nВведите второе число: ");
			double b;
			scanner.nextLine();

			switch (operation) {
				case "+":
	                result = a + b;
	                System.out.println("\nОперация сложения = " + result);
	                break;
	            case "-":
	                result = a - b;
	                System.out.println("\nОперация вычитания = " + result);
	                break;
	            case "*":
	                result = a * b;
	                System.out.println("\nОперация умножения = " + result);
	                break;
	            case "/":
	                result = a / b;
	                System.out.println("\nОперация деления = " + result);
	                break;
				case "^":
	                result = Math.pow(a, b);
	                System.out.println("\nОперация возведения в степень = " + result);
	                break;
	            case "%":
	                result = a % b;
	                System.out.println("\nОперация нахождения остатка от деления = " + result);
	                break;
			}
			do {
			System.out.println("\nХотите сделать ещё одно вычисление? yes/no.");
			answerContinueGame;
			} while (!answerContinueGame.equals("yes") & !answerContinueGame.equals("no"));
				

		} while (answerContinueGame.equals("yes"));
	}
}