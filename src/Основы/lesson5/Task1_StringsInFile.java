package Основы.lesson5;

import java.io.FileReader;
import java.util.Scanner;

public class Task1_StringsInFile {
	
	/* Пользователь вводит имя файла. 
	 * Посчитать количество строк в файле. 
	 */
	public static void main(String[] args) throws Exception  {
		
		
		System.out.println("Введите имя файла: ");
		
		Scanner scan1 = new Scanner(System.in);
		String FILE_NAME = scan1.nextLine();
	
		
		FileReader reader = new FileReader (FILE_NAME);
		Scanner scan = new Scanner(reader);
		String line = scan.nextLine();	
		
		int counter = 1;
		while (scan.hasNextLine()) {
			
			line = scan.nextLine();
			counter++;
			
		}
		System.out.println("Количество строк в файле = " + counter + ".");
		
		scan.close();
		
		// //Закрытие потока сканера.

	}
		
}