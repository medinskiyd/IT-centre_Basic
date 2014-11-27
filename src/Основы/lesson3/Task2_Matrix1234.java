package Основы.lesson3;

/*Заполнить массив такими значениями:
 * 1  2  3  4
 * 5  6  7  8
 * 9  10 11 12
 * 13 14 15 16
 */

import java.util.Scanner;

public class Task2_Matrix1234 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Введите размер массива: ");
		
		int a = scan.nextInt(); //Вводим размер массива.
				
		int m [][] = new int [a][a]; //Создаем массив.
		int counter = 1; //Первое значение массива.
			
		for (int i = 0; i < m.length; i++) {
		
			System.out.print("[ ");
			
			for (int j = 0; j < m.length; j++) {
				m[i][j] = counter++; //Записываются значения в строку i и столбец j.
				
				System.out.print(m[i][j]);
				
				if (j < m.length-1) {
					System.out.print(", "); //Если номер выводимого числа меньше размера цикла то выводим ",".
				} else if (j == m.length-1) {
					System.out.print(" "); //Если номер выводимого числа = размеру цикла то выводим " ".
				}
			}
			System.out.println("]");
		}
	}
}
