package Основы.HomeWork1;

import java.util.Scanner;

public class Task2_FirstPartOfVector {
	
	/* Пользователь вводит массив с клавиатуры (вначале размер массива, потом элементы).
	 * Вывести на экран первую половину массива.
	 */

	public static void main(String[] args) {

        int sizeMass = 0;
        int vector[] = null;
        int elemOfVector = 0;
        int halfOfVector = 0;
		Scanner scan = new Scanner(System.in);
				
	    System.out.println("Введите размер массива: ");
		
		sizeMass = scan.nextInt();
		vector = new int[sizeMass];
		
		System.out.println("Введите данные в массив размером " + sizeMass + " элементов:" );
		
		for (int i = 0; i < vector.length; i++) {
			elemOfVector = scan.nextInt();
			vector[i] = elemOfVector;
		}

        System.out.println("Числа первой половины введеного вами массива:");
		
		halfOfVector = vector.length / 2;
		
		for (int i = 0; i < halfOfVector; i++) {
			System.out.println(vector[i]);
		}
		scan.close();
	}
}
