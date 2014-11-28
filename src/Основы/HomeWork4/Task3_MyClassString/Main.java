package Основы.HomeWork4.Task3_MyClassString;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Введите количество символов в 1 строке:");
		int length = scan.nextInt();
		System.out.println("Введите количество символов в 2 строке:");
		int length1 = scan.nextInt();
		
	
		//Создали массивы символов.
		MyClassString string = new MyClassString();
	
		//Задаем размер новосозданному массиву.
		string.setStringLength1(length);
		
		//Вводим элементы 1 массива.
		for (string.i = 0; string.i < length; string.i++){
			System.out.print("Введите символ для первой строки:");
			
			String str = scan.next();
			char symb = str.charAt(0); // Не работает так как вводим то мы тип чар...
			
			//Записываем элемент в 1 массив.
			string.setNewStringEl1(symb);
		}
		
		System.out.println("Имеем строку 1 из " + length + " символов:");
		//Выводим элементы нашей строки.
		for (string.i = 0; string.i < length; string.i++){
		
			//Выводим элементы на экран.
			System.out.print(" " + string.getStringEl1() + " ");		
		}
		System.out.println();
	
		//Вводим элементы 2 массива.
		for (string.i = 0; string.i < length1; string.i++){
			System.out.print("Введите символ для второй строки:");
			
			String str1 = scan.next();
			char symb1 = str1.charAt(0);
					
			//Записываем элемент в 2 массив.
			string.setNewStringEl2(symb1);
		}
				
		System.out.println("Имеем строку 2 из " + length1 + " символов:");
		//Выводим элементы нашей строки.
		for (string.i = 0; string.i < length1; string.i++){
				
			//Выводим элементы на экран.
			System.out.print(" " + (char)string.getStringEl2() + " ");		
		}
		System.out.println();
		
		System.out.println("Добавляем первую строку к второй:");
		
		string.addString ();
		
		//Выводим элементы нашей новой строки.
		for (string.i = 0; string.i < length+length1; string.i++){
						
			//Выводим элементы на экран.
			System.out.print(" " + (char)string.getStringEl3() + " ");		
		}
		System.out.println();
		
		System.out.println("Все символы маленькие:");
		string.getDownStringSymb();
		//Выводим элементы нашей новой строки.
		for (string.i = 0; string.i < length+length1; string.i++){
								
			//Выводим элементы на экран.
			System.out.print(" " + (char)string.getDownStringSymb() + " ");		
		}
		System.out.println();
		
		
	scan.close(); // Закрываем сканнер.
		
	}

}
