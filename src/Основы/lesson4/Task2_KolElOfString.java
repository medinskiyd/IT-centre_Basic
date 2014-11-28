package Основы.lesson4;

import java.util.Scanner;

public class Task2_KolElOfString {
	
	/* Пользователь вводит строку.
	 * Посчитать сколько символов в строке и вывести на экран.
	*/

	public static void main(String[] args) {

		System.out.println("Введите строку: ");
		Scanner scan = new Scanner (System.in);
		String str = scan.nextLine();
		int len = str.length(); //длинна строки.
		
		int kol = numSymb(len);
		System.out.println(kol);
	}
			
	public static int numSymb(int len1) { //Метод из длинны строки высчитывает количество элементов в строке.

		int kolOfSymb = 0;
		
		for (int i = 0; i < len1; i++) {
			
			kolOfSymb = kolOfSymb + 1;
		}
		return(kolOfSymb);
	}
}
