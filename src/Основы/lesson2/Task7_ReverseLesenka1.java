package Основы.lesson2;

import java.util.Scanner;

/* Нарисовать лесенку:
 * 
 *           *
 *          **
 *         ***
 *    
 * */

public class Task7_ReverseLesenka1 {

	public static void main(String[] args) {
		
		System.out.println("Введите число размер треугольника");
		
		Scanner scan = new Scanner(System.in);
		
		int n = 0; 
		if (scan.hasNextInt()) {
			
			n = scan.nextInt(); //Вводим размер треугольника.
		} 	else { 
			
			System.out.println("Ошибка ввода");
			return;
		}	
		
		String a = "*";
		String b = " ";
		
		int m = n; //Присваиваем количество переборов в циклах, так как n много где используется.
		for (int i=0; i < m; i++) {
																	
			for (int j = 0; j < m; j++) { // Цикл до 3-х.
				
				if(j < n-1) {
					System.out.print(b);
					
				} else if (j >= n-1) {
					System.out.print(a);
				}				 
			}
				n = n - 1;		
				System.out.println();
		}		
	}
}
