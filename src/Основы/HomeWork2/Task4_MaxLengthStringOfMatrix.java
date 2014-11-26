package Основы.HomeWork2;

import java.util.Arrays;
import java.util.Scanner;

/* Найти строку в двухмерном массиве, имеющую самую большую сумму значений элементов.
 * 4 na 4.
 */

public class Task4_MaxLengthStringOfMatrix {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Введите размер массива: ");
		
		int size = scan.nextInt();
		
		int [][] matrix = maxtrix(size);
		numMaxSumMatrixString(matrix, size);
		scan.close();
	}

	public static int[][] maxtrix(int size1) { //Создание двумерной матрицы.
		
		int[][] matrix1 = new int [size1][size1];
		int b = 0;
		
		for (int i = 0; i < matrix1.length; i++){
			
			System.out.print("[ ");
			
			for (int j = 0; j < matrix1.length; j++) {
			b = (int) (Math.random()*(size1+1));
			matrix1 [i][j] = b;
			
			System.out.print(matrix1[i][j]);
			if (j < matrix1.length-1) {
				System.out.print(", "); //Если номер выводимого числа меньше размера цикла то выводим ",".
			} else if (j == matrix1.length-1) {
				System.out.print(""); //Если номер выводимого числа = размеру цикла то выводим " ".
			}
			
			}
			System.out.println(" ]");
		}
		
		System.out.println();

		return matrix1;
	}
	
	public static void numMaxSumMatrixString (int matrix1 [][], int size1) { // Поиск самой большой по сумме элементов строки.
		
		int counter = -1;
		int summ = 0;
		int summBig = 0;
		int vector[] = new int [size1];
		
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1.length; j++){
				 summ = summ + matrix1[i][j];
			}
			if (summ > summBig) {
				summBig = summ;
                counter++;
			}
			summ = 0;
		}
		System.out.println("Строка с самом большой суммой элементов(начиная с 0): "+ counter);
		System.out.println("Сумма элементов в самой большой строке: " + summBig);
		
		for (int i = 0; i <size1; i++) {
			vector[i] = matrix1[counter][i];
		}
		System.out.println(Arrays.toString(vector));
	}
}
