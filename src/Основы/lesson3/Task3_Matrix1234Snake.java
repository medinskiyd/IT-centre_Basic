package Основы.lesson3;

/* Заполнить матрицу змейкой.
 * 
 * 1 2 3 4 
 * 8 7 6 5 
 * 9 10 11 12
 * 16 15 14 13
 * 
 */

import java.util.Scanner;

public class Task3_Matrix1234Snake {

	public static void main(String[] args) {
		
		System.out.println("Введите размер массива: ");
		
		final int SIZE;
		Scanner scan = new Scanner(System.in);
		
		if(scan.hasNextInt()) {
			SIZE = scan.nextInt(); 
		} else {
			System.out.println("Размер должен быть числом");
			return;
		}
				
		if (SIZE < 0) {
			System.out.println("Размер должен быть положительным числом");
			return;
		}
			
		int m [][] = new int [SIZE][SIZE];
		int counter = 1;
		
		for (int i = 0; i < m.length; i++) {
						
			for (int j = 0; j < m.length; j++) {
											
				if (i % 2 == 0){
					m[i][j] = counter++;
					
				} else if (i / 2 != 0) {
					m[i][j] = 1;
				} 
				
			System.out.print(m[i][j] + " ");
			}
			System.out.println(" ");
		}
	}
} // доделать
