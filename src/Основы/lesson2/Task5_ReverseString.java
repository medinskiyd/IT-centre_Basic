package Основы.lesson2;

import java.util.Scanner;

/* Пользователь вводит число, вывести на экран обратную последовательность чисел
 * от вводимого числа до единицы.
 **/

public class Task5_ReverseString {

		public static void main(String[] args) {
		
		System.out.println("Введите число");
		
		Scanner scan = new Scanner(System.in);
		
		int val1 = 0;
		if (scan.hasNextInt()) {
			
			val1 = scan.nextInt();
		} 	else { 
			
			System.out.println("Ошибка ввода");
			return;
		}	
		
		System.out.print("Последовательность чисел от " + val1 + " до 0: ");
		
		for (int i = 0; i <= val1; i++) {
			
			int a = val1 - i;
				System.out.print(" "+ a + " ");
		}
	}
}