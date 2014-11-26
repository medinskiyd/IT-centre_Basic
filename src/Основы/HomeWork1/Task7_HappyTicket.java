package Основы.HomeWork1;

import java.util.Scanner;

public class Task7_HappyTicket {
	
	/* Написать программу для определения счастливого билета (из 6 цифр, сумма левых 3-х должна быть равна 
	 * сумме правых трех).
	 */

	public static void main(String[] args) {
		
		int vector[] = null;
        int sumFirstPart = 0;
        int sumSecondPart = 0;
        String tiketNumber = null;
        int halfOfVector = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите № билета (6 цифр): ");
        tiketNumber = scan.nextLine();
        vector = new int[tiketNumber.length()];

        for(int i = 0; i < tiketNumber.length(); i++){
            vector[i] = tiketNumber.charAt(i) - 48;
        }

        halfOfVector = vector.length / 2;

        // Суммирование первой части.
        for(int i = 0; i < halfOfVector; i++){
            sumFirstPart = sumFirstPart + vector[i];
        }
        // Суммирование второй части.
        for (int i = halfOfVector; i < vector.length; i++) {
            sumSecondPart = sumSecondPart + vector[i];
        }
        // Сравние 2-х частей.
        if (sumFirstPart == sumSecondPart) {
			System.out.println("Поздравляем, у Вас счастливый билет №" + tiketNumber);
		} else {
			System.out.println("Увы, Ваш билет №" + tiketNumber + " не счастливый.");
		}
        scan.close();
	}
}
