package Основы.lesson12.Task3_Recurs.Task1_Exception.Task3_Recurs;

public class Main {

	public static void main(String[] args) {

		Test t = new Test();
		
		// Выводим с помощью рекурсии по порядку от 1 до 7.
		t.repeat(1,8);
		System.out.println();
		
		// Выводим с помощью рекурсии по порядку от 7 до 1.
		t.repeatReverse(1,8);
		System.out.println();
		
		// Выводим с помощью рекурсии по порядку от 1 до 7 и от 7 до 1.
		t.repeatReverseReverse(1,13);
		System.out.println();
		
		// Выводим с помощью рекурсии факториал.
		System.out.println(t.factorRec(5));
		
		// Выводим с помощью рекурсии последнее число Фибоначи.
		System.out.println(t.fib(10));
		
	}

}
