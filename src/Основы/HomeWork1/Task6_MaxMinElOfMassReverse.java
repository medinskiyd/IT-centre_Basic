package Основы.HomeWork1;

public class Task6_MaxMinElOfMassReverse {
	
	/* Создать массив. Заполнить массив случайными значениями, поменять местами значение найбольшего 
	 * и найменьшего элемента в массиве. 
	 */

	public static void main(String[] args) {
		
		double vector[] = new double [5];
        double max = 0;
        double min = 5;
        int maxPosition = 0;
        int minPosition = 0;

        System.out.println("Имеем массив чисел: ");
		
		for (int i = 0; i < vector.length; i++) {
			vector[i] = Math.random() * 5;
			System.out.println(vector[i]);
		}

		for (int i = 0; i < vector.length; i++) {
			if (max < vector [i]) {
				max = vector [i]; maxPosition = i;
			}
			if (min > vector [i]) {
				min = vector [i]; minPosition = i;
			}
		}
		
		System.out.println("");				
		System.out.println("Максимальное число в массиве: " + max);
		System.out.println("Минимальное число в массиве: " + min);
		System.out.println("Номер max числа в массиве: " + maxPosition);
		System.out.println("Номер min числа в массиве: " + minPosition);
		System.out.println("");
		System.out.println("Измененный массив: ");
		
		vector[minPosition] = max;
		vector[maxPosition] = min;
		
		for (int i = 0; i < vector.length; i++) {
			System.out.println(vector[i]);
		}
	}
}
