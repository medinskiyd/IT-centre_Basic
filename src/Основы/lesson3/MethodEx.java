package Основы.lesson3;

public class MethodEx {

	public static void main(String[] args) {
		
		int count = 100;
		
		printLine(); // Вызов метода по имени.
		printLine();
		printLine();
		
		printValue(100); // Вызов метода по имени.
		printValue(count);
		
		int res = add (2,2); //значение посчитаное в методе add. 
		System.out.println(res);
	}

	public static void printLine() { //Метод рисует линейку.
		int count = 100;
		System.out.println("* * *");
	}
	
	public static void printValue (int value){ //Метод пишет число.
		System.out.println(value);
	}
	
	public static int add(int first, int second) { // Метод складывает 2 числа и возвращает перем. типа int.
	
		int sum = first + second;
		return sum;
	}
	
	
	
}
