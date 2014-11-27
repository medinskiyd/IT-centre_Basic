package Основы.lesson3;

/* Написать метод - выводящий на экран квадрат из звездочек, 
 * размер стороны квадрата передается в метод в качестве аргумента.
 * 
 */

import java.util.Scanner;

public class Task5_MetodKvadratOfStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Введите размер квадрата: ");
		
		Scanner scan = new Scanner(System.in);
		
		int inputValue = 0;
		inputValue = scan.nextInt();
		
		System.out.println("Квадрат размером " + inputValue + " на " + inputValue + ":");
		
		int f = kvad(inputValue);
	}
	
	public static int kvad(int d) {
			
		String c = "*";
			
		for (int i = 0; i < d; i++) { // Цикл до 3-х.
			
			for (int j = 0; j < d; j++)
			
				System.out.print(c);
				System.out.println(" ");
		}
		return d;
		}		
	}


