package Основы.lesson3;

/* Написать метод заполняющий двумерный массив случайными значениями. 
 * В метод передаются 3 значения: массив, 1-я граница диапазона случ. знач, 
 * 2-я граница диапазона случайных значений. Для целых чисел.
 */

import java.util.Scanner;

public class Task6_MetodCreateMatrixRandomValue {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Введите границы диапазона массива случайных чисел: ");
		
		int firstGran = scan.nextInt();
		int secondGran = scan.nextInt();
		int vector = (int)Math.random();
		
		int a[][] = randomMassive(vector, firstGran, secondGran);
		
		}
	
	public static int[][] randomMassive(int vector1, int firstGran, int secondGran) {
		
		int vector [][] = new int [5][5];
		
		for (int i = 0; i < vector.length; i++){
						
			System.out.print("[ ");
			
			for (int j = 0; j < vector.length; j++) {
			
				int size = Math.abs(secondGran - firstGran);
				int leftSide = Math.min(secondGran, firstGran);
				vector [i][j] = leftSide + (int)(Math.random() * size);
			
			System.out.print(vector [i][j]);
			
			
				if (j < vector.length-1) {
					System.out.print(", "); //Если номер выводимого числа меньше размера цикла то выводим ",".
				
				} else if (j == vector.length-1) {
					System.out.print(" "); //Если номер выводимого числа = размеру цикла то выводим " ".
				}
			}
			System.out.println(" ]");
			
		}	
		
		return vector;
	}
}

