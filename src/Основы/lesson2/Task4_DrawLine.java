package Основы.lesson2;

import java.util.Scanner;

/* Пользователь вводит длинну линии, нарисовать эту линию звездочками " * ",
 * проверить на коректность ввода.
 */

public class Task4_DrawLine {

	public static void main(String[] args) {
		
		System.out.println("Введите длинну линии:");
		
		Scanner scan = new Scanner(System.in);
		
		int lenght = 0;
		if (scan.hasNextInt()) {
			lenght = scan.nextInt();
		} 	else { 
			
			System.out.println("Ошибка ввода");
			return;
		}
			
			System.out.print("Ваша линия - ");
		
		for (int i = 0; i < lenght; i++) { // Используем цикл для рисования линии из звездочек.
			
			System.out.print("*");
		
		}
	}	
}
