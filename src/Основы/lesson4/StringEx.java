package Основы.lesson4;

import java.util.Scanner;

public class StringEx { 
	
	//Строка.

	public static void main(String[] args) {

		System.out.println("Введите строку: ");
		Scanner scan = new Scanner (System.in);
		String str = scan.nextLine();
						
		int len = str.length(); //длинна строки.
		int kolOfSymb = 0;
		
		for (int i = 0; i < str.length(); i++) {
			
			kolOfSymb = kolOfSymb + 1;
		
		}
		System.out.println(kolOfSymb);
	}

}
