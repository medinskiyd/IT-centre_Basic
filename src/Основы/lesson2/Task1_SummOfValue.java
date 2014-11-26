package Основы.lesson2;

import java.util.Scanner;

public class Task1_SummOfValue {
	
	/* Пользователь вводит 2 числа, вывести на экран их сумму и квадрат. */

	public static void main(String[] args) {
		
		System.out.println("Введите 2 числа:");
		
		Scanner scan = new Scanner(System.in);
		
		int val1 = scan.nextInt();
		int val2 = scan.nextInt();
		
		int sum = val1 + val2;
		int kvad = val1 * val1;
		
		int kvad1 = val2 * val2;
		
		System.out.println("Сумма = " + sum + "; Квадрат первого числа = " + kvad + "; Квадрат второго числа = " + kvad1 + ".");

	}

}
