package Основы.HomeWork1;

public class Task4_CopyFirstVectorToSecondVector {
	
	/* Заданы 2 массива одинаковой длинны (любые значения), скопировать данные с первого массива во второй.
	 * Вывести на экран.
	 */

	public static void main(String[] args) {
		
		int [] vector1 = new int [4];
        int [] vector2;

        vector1 [0] = 33;
		vector1 [1] = 2;
		vector1 [2] = 3;
		vector1 [3] = 4;
		
		vector2 = vector1; //Копирование значений из первого массива во второй.
		
	    System.out.println("Массив №1 ");
		
		for (int i = 0; i < vector1.length; i++) {
			System.out.println(vector1 [i]);
		}

		System.out.println();
		System.out.println("Массив №2 ");
		
		for (int i = 0; i < vector1.length; i++) {
			System.out.println(vector2 [i]);
		}
	}
}
