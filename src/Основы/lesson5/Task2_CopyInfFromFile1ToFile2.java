package Основы.lesson5;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Task2_CopyInfFromFile1ToFile2 {
	
	/* Пользователь вводит имена 2-х файлов. 
	 * Скопировать информацию с первого файла во второй. 
	 */
	
	public static void main(String[] args) throws Exception  {
	
		Scanner scanName = new Scanner(System.in);
		
		System.out.println("Введите имя файла №1: ");
		String FILE_NAME = scanName.nextLine(); //Пишем имя файла источника.
		
		System.out.println("Введите имя файла №2: ");
		String FILE_NAME2 = scanName.nextLine(); //Пишем имя файла приемника.
		
		// Читаем информацию с первого файла.
		FileReader reader = new FileReader (FILE_NAME);
		Scanner scanReaderFirstFile = new Scanner(reader);
		String line = scanReaderFirstFile.nextLine();
		
		//Записываем строки с первого файла во второй файл.
		FileWriter writerInSecondFile = new FileWriter(FILE_NAME2);
		
		writerInSecondFile.write(line + '\n');
		while (scanReaderFirstFile.hasNextLine()) {			
			 line = scanReaderFirstFile.nextLine();			
			 writerInSecondFile.write(line + '\n');
		}
		
		scanReaderFirstFile.close(); //Закрыли сканер.

		writerInSecondFile.close(); //Обязательно. Закрыли writer.
		
		System.out.println("Информация с первого файла записана во второй.");
	}
}