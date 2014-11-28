package Основы.lesson4;

/* Пользователь вводит 2 строки.
 * Определить содержится ли 2-я строка в первой.
 *  
 */

import java.util.Scanner;

public class Task3_FindSecondStringInFirst {

	public static void main(String[] args) {

		System.out.println("Введите 2 строки через пробел: ");
		Scanner scan = new Scanner (System.in);
		String str1 = scan.nextLine();
		String str2 = scan.nextLine();
			
		int YesOrNo = InOrOutString(str1, str2);
			
		if  (YesOrNo == 0) {
			System.out.println("В первой строке есть вторая строка");
			
		} else {
			System.out.println("В первой строке нет второй строки");
		}	
		
	}
	public static int InOrOutString(String str1a, String str2a) { //Метод определяет наличие строки №2 в строке №1.
				
		int str2InStr1 = str1a.indexOf(str2a);
		String in = "В первой строке есть1 вторая строка";
		int a = 0;
		
		if (str2InStr1 >= 0) { //В первой строке есть вторая строка
			a = 0; 
		} else if (str2InStr1 == -1) { //В первой строке нет второй строки
			a = 1; 
		}	
		
		return (a);
	}
}