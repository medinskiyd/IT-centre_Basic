package Основы.lesson5;

import java.util.Scanner;

public class Task0_Factorial {
	
	/* Пользователь вводит число.
	 * Написать метод который выводит факториал числа.
	 * 
	 */

	public static void main(String[] args) {

		System.out.println("Введите число: ");
		
		Scanner scan = new Scanner(System.in);
		int value = scan.nextInt(); //Введенное число.
		
		int factorial = Factorial(value); 
		System.out.println("Факториал числа "+ value + " = " + factorial + ".");
		
	}
	
	//Метод расчитывает факториал числа.
	public static int Factorial(int value1) {
		
		int factorial1 = 1;
		
		for(int i = 1; i <= value1; i++) {
			
			factorial1 = factorial1 * i; // n! = (n-1)!n  Example: 5! = 1*2*3*4*5.
			
		}
		
		return factorial1;
	}
	
}
