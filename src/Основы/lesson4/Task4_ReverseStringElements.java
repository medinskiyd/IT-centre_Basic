package Основы.lesson4;

import java.util.Scanner;

public class Task4_ReverseStringElements {
	
	/* Пользователь вводит строку.
	 * Расположить символы в строке в обратном порядке и вывести на экран.
	 */

	public static void main(String[] args) {

		System.out.println("Введите строку: ");
		Scanner scan = new Scanner (System.in);
		String str = scan.nextLine();
		
		int len = str.length();
		
		String symb1 = obratnString(len, str);
		System.out.print(symb1);
	}
	
		public static String obratnString(int len1, String str1) {
		
			String str3 = "";
			char symb = 'a';
			for (int i = 0; i < len1; i++){
			
				symb = str1.charAt(len1 - 1 - i); // str1.charAt Записывает в переменную символ из строки str1 под номером который в скобках.
				//System.out.println(symb);
				String str2 = "" + symb;
				System.out.print(str2);
			}
		return str3;
		}
}
