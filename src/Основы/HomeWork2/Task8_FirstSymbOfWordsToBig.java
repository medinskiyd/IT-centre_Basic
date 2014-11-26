package Основы.HomeWork2;

import java.util.Scanner;

public class Task8_FirstSymbOfWordsToBig {
	
	/* Верхний регистр.

	Напишите программу, которая позволяет пользователю ввести в консоли строку,  
	переводит первый символ слов в верхний регистр и результат выводит в консоль

	Ввод:
	иван васильевич
	
	Вывод:
	Иван Васильевич
 * 
 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		
		
		System.out.println("Введите строку: ");  // Вводим строку.
		String str = scan.nextLine(); 
		String strReverse = strReverse(str); // Возвращаем измененную строку из метода strReverse.	
		System.out.println("Ваша строка: " + strReverse + ".");
		scan.close();
	}

	//Метод меняет регистр с нижного на верхний первых символов слов.
	public static String strReverse (String str1) { 
		
//		Первый символ введенной строки всегда с большой буквы.
//		Если мы имеем символ "пробел" то после него символ меняется с нижного регистра на верхний регистр.
		
		final char spase = ' ';
		String BIGlineFromMain = str1.toUpperCase();
		String a = "";
		
		a = a + BIGlineFromMain.charAt(0);
		
		for (int i = 1; i < str1.length(); i++){
				
			 if (str1.charAt(i) == spase) {
				a = a + " " + BIGlineFromMain.charAt(i+1);
				
			} else  if ((str1.charAt(i) != spase) && (str1.charAt(i-1) != spase)) {
					a = a + str1.charAt(i) ; 
					}	
		}
		return a;
	}
}
