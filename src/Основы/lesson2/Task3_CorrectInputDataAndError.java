package Основы.lesson2;

import java.util.Scanner;

/* Пользователь вводит на экран 2 числа, вывести на экран большее из них.
 * Сделать проверку коректности данных.
 * Если не правильный ввод, вывести на экран - "Ошибка ввода". */

public class Task3_CorrectInputDataAndError  {

	public static void main(String[] args) {
		
		System.out.println("Введите 2 числа:");
		
		Scanner scan = new Scanner(System.in);
						
		int val1 = 0;
		if (scan.hasNextInt()) { 
/* Условие проверки на правильность (введено ли именно число),
* если scan.hasNextInt() = true, то вводим число, если scan.hasNextInt() = false, то выводится "Ошибка ввода" */
			
			val1 = scan.nextInt();   
		} else { 
			
			System.out.println("Ошибка ввода");
			return;
		}
		
		int val2 = 0;
		if (scan.hasNextInt()) {
			val2 = scan.nextInt();
		} else { 
			
			System.out.println("Ошибка ввода");
			return;
		}
		
		if (val1 > val2) { // Условие "Первое число больше второго".
			
			System.out.println("Первое число больше второго и равно " + val1 + ".");
			
		} 
			
		if (val2 > val1) { // Условие "Второе число больше первого".
					
			System.out.println("Второе число больше первого и равно " + val2 + ".");
			
		} 
		}
	}


