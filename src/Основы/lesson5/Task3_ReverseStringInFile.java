package Основы.lesson5;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Task3_ReverseStringInFile  {
	
	/* Пользователь вводит имя файла в котором 1 строка.
	 * Перевернуть строку задом наперед. Пример: qwerty - ytrewq.
	 * И запивать в файл.
	 * 
	 */
		
	public static void main(String[] args) throws Exception  {
				
			System.out.println("Введите имя файла: ");
				
			//Вводим имя файла.
			Scanner scanFileName = new Scanner(System.in);
			String FILE_NAME = scanFileName.nextLine();
			
			//Читаем строку из файла.
			FileReader reader = new FileReader (FILE_NAME);
			
			//Читаем строку из файла и присваиваем её к line.
			Scanner scanFile = new Scanner(reader);
			String line = scanFile.nextLine();	

			String reverseStr = obratnString(line); //Суда попадет измененная строка.
			
			//Записываем в файл измененную строку reverseStr.
			FileWriter writerFile = new FileWriter(FILE_NAME);
			writerFile.write(reverseStr + '\n');
			
			//Выводим результат.
			System.out.println("Измененная строка перезаписана в файл "+ FILE_NAME + ": " + reverseStr + ".");
			
			writerFile.close();
			scanFile.close();
	}		
	 	//Метод возвращает измененную строку.
		public static String obratnString(String line1) {
				
			String reverseStr1 = "";
			char symb = 'a';
			for (int i = 0; i < line1.length(); i++){
				
				symb = line1.charAt(line1.length() - 1 - i); // str1.charAt Записывает в переменную символ  
															 // из строки под номером который в скобках.
				reverseStr1 = reverseStr1 + symb;
			}
			System.out.println();
				
		return reverseStr1;
		}
}
