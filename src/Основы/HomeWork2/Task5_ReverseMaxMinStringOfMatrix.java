package Основы.HomeWork2;

import java.util.Scanner;

/*Поменять местами самую большую и самую маленькою строку в двумерном массиве.
 * 4 na 4
 */

public class Task5_ReverseMaxMinStringOfMatrix {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Введите размер массива: "); //Вводим размер массива.
		
		int size = scan.nextInt();
		
		int [][] matrix = new int [size][size];
		
		int b = 0;
		
		System.out.println("Имеем двумерный массив " + size + " на " + size + ":");
		
		for (int i = 0; i < matrix.length; i++){ //Заполнение массива случайными числами.
			
			System.out.print("[ ");
			for (int j = 0; j < matrix.length; j++) {
			
				b = (int) (Math.random()*(size+1));
				matrix [i][j] = b;
				System.out.print(matrix[i][j] + " "); 
				
				if (j < matrix.length-1) {
					System.out.print(", "); //Если номер выводимого числа меньше размера массива то выводим ", ".
				
				} else if (j == matrix.length-1) {
					System.out.println("]"); //Если номер выводимого числа = размеру массива то выводим "]".
				}
			}	
		}
		
		int mSum0 = 0;
		int mSum1 = 0;
		int mSum2 = 0;
		int mSum3 = 0;		
		
		for (int i = 0; i < matrix.length; i++){ //Сравниваем сумму строк в массиве.
			
			for (int j = 0; j < matrix.length; j++) {
		
				if (i == 0) {
					
					mSum0 = mSum0 + matrix[i][j];
				}
				
				if (i == 1) {
					
					mSum1 = mSum1 + matrix[i][j];
				}
				
				if (i == 2) {
					
					mSum2 = mSum2 + matrix[i][j];
				}
				
				if (i == 3) {
					
					mSum3 = mSum3 + matrix[i][j];
				}	
			}
		}
		
		System.out.println("Сумма элементов 0-й строки = " + mSum0);
		System.out.println("Сумма элементов 1-й строки = " + mSum1);
		System.out.println("Сумма элементов 2-й строки = " + mSum2);
		System.out.println("Сумма элементов 3-й строки = " + mSum3);
		
		
		if (mSum0 > mSum1) {
			mSum1 = mSum0;
			System.out.println("0-я строка с самой большой суммой элементов");
		} else
		if (mSum1 > mSum2) {
			mSum2 = mSum1;
			System.out.println("1-я строка с самой большой суммой элементов");
		} else
		if (mSum2 > mSum3) {
			mSum3 = mSum2;
			System.out.println("2-я строка с самой большой суммой элементов");
		} else

		if (mSum3 > mSum0) {
			mSum0 = mSum3;
			System.out.println("3-я строка с самой большой суммой элементов");
		}
	}	
}

