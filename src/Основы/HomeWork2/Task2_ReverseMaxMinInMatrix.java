package ќсновы.HomeWork2;

/* Ќайти максимальное и минимальное значение в двумерном массиве и 
 * помен€ть их местами.
 */

public class Task2_ReverseMaxMinInMatrix {

	public static void main(String[] args) {

		System.out.println("»меем двумерный массив");
		
		int matrix [][] = new int [4][4]; //—оздали двумерный массив 4 на 4.
		
		int counter = 1;
		
		for (int i = 0; i < 4; i++) {
			
			System.out.print("[ ");
			
			for (int j = 0; j < 4; j++) {
				
				matrix [i][j] = counter++;
				System.out.print(matrix[i][j] + " ");
			
				if (j < matrix.length-1) {
					System.out.print(", "); //≈сли номер выводимого числа меньше размера цикла то выводим ",".
				} else if (j == matrix.length-1) {
					System.out.print(""); //≈сли номер выводимого числа = размеру цикла то выводим " ".
				}
			}
			System.out.println("]");
		}
		
		System.out.println();
		
		int [][] matrixmax = findMaxMin(matrix); //¬озвращаетс€ матрица с измененным максимальным числом массива.
	
		System.out.println("Ќова€ матрица: ");
		int [][] matrixZamena = zamena(matrixmax); //ћетод рисует массив с измененными значени€ми.
	}

	//ѕоиск максимального числа в массиве и минимального + замена их местами.
	public static int[][] findMaxMin (int [][] matrix1) {
		
		int max1 = 0;
		int n = 0;
		int m = 0;
		
		int min1=10;
		int n1 = 0;
		int m1 = 0;
		
		for (int i = 0; i < 4; i++) {
				
			for (int j = 0; j < 4; j++) {
				
				if (max1 < matrix1[i][j]) {
					
					max1 = matrix1[i][j]; 
					n = i; m = j;
				} 
				
				if (min1 > matrix1[i][j]) {
					
					min1 = matrix1[i][j]; 
					n1 = i; m1 = j;
				} 
			}
		}
		
		matrix1[n][m] = min1;
		matrix1[n1][m1] = max1;
		
		return matrix1;
	}
	
	//ћетод выводит новый измененный массив.
	public static int [][] zamena(int [][] matrix1) { 
	
		for (int i = 0; i < 4; i++) {
			
			System.out.print("[ ");
			
			for (int j = 0; j < 4; j++) {
				
				System.out.print(matrix1[i][j] + " ");
			
				if (j < matrix1.length-1) {
					System.out.print(", "); //≈сли номер выводимого числа меньше размера цикла то выводим ",".
				} else if (j == matrix1.length-1) {
					System.out.print(""); //≈сли номер выводимого числа = размеру цикла то выводим " ".
				}
			}
			System.out.println("]");
		}
		return matrix1;
	}	
}

