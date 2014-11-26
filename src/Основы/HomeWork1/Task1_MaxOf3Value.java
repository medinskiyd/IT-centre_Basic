package Основы.HomeWork1;

import java.util.Scanner;

public class Task1_MaxOf3Value {

	/* Пользователь вводит 3 числа, определить найбольшее из них, вывести на экран.
	 */
	
	public static void main(String[] args) {

        int val1 = 0;
        int val2 = 0;
        int val3 = 0;
        int max = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите 3 числа:");

		val1 = scan.nextInt();
		val2 = scan.nextInt();
		val3 = scan.nextInt();

        if(val1 > max) {
            max = val1;
        }
        if(val2 > max) {
            max = val2;
        }
        if(val3 > max){
            max = val3;
        }

		System.out.println("Самое большое число: " + max);
		
		scan.close();
	}
}
