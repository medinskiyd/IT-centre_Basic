package Основы.lesson3;

//Нарисовать 2-х мерный массив 5 * 5 заполненый значениями.

public class MatrixEx {

	public static void main(String[] args) {
		
		//int matrix [][] = new int [5][5]; //Двумерный массив 5 * 5 заполненый нулями.
		int matrix [][] = {
				{1,2,3,4,5},
				{1,2,3,4,5},
				{1,2,3,4,5},
				{1,2,3,4,5},
				{1,2,3,4,5}
		}; // Создаем массив 5 * 5 с введенными значениями.
		
		for (int i = 0; i < matrix.length; i++) {
			
			System.out.print("["); //Выводим передние квадратные дужки строки.
			
			for (int j = 0; j < matrix.length; j++){
				
				System.out.print(matrix[i][j]); //Выводим строку массива.
				
				if (j < matrix.length-1) { //Условие для того что-бы убрать запятую в конце каждой строки.
				System.out.print(",");
				}
			}
	 		System.out.println("]"); //Выводим задние квадратные дужки строки.
		}
	}
}
