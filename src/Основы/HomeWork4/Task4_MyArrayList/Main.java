package Основы.HomeWork4.Task4_MyArrayList;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Введите количество элементов строки:");
		int length = scan.nextInt();
	
		//Создали массивы символов.
		MyArrayList string = new MyArrayList();
	
		//Задаем размер новосозданному массиву.
		string.setStringLength(length);
		
		//Вводим элементы массива.
		for (string.i = 0; string.i < length; string.i++){
			System.out.print("Введите элемент строки:");
			
			int el = scan.nextInt(); 
			
			//Записываем элемент в массив.
			string.setEl(el);
		}
		
		System.out.println("Имеем строку из " + length + " элементов:");
		
		//Выводим элементы нашей строки.
		for (string.i = 0; string.i < length; string.i++){
		
			//Выводим элементы на экран.
			System.out.print(" " + string.getEl() + " ");		
		}
		System.out.println();
	
		// Добавляем елемент к нашей строке.
		System.out.println("Введите новый элемент строки:");
		int newEl = scan.nextInt();
		string.addEl(newEl);
		
		System.out.println("Имеем строку:");
		//Выводим элементы нашей новой строки.
		for (string.i = 0; string.i < length+1; string.i++){
						
			//Выводим элементы на экран.
			System.out.print(" " + string.getEl2() + " ");		
		}
		System.out.println();
		
		System.out.println("Введите элемент строки индекс которого стоит найти:");
		int el = scan.nextInt();
		int index = string.indexOf(el);
		
		System.out.println("Элемент " +  el + " имеет индекс " + index);
		System.out.println();
		
		// Удаляем елемент нашей строке.
		System.out.println("Введите номер элемента строки который нужно удалить:");
		int numDelEl = scan.nextInt();
		string.delEl(numDelEl);
				
		System.out.println("Имеем строку:");
		//Выводим элементы нашей новой строки.
		for (string.i = 0; string.i < length; string.i++){
								
			//Выводим элементы на экран.
			System.out.print(" " + string.getAfterDel() + " ");		
		}
		
	scan.close(); // Закрываем сканнер.
		
	}

}