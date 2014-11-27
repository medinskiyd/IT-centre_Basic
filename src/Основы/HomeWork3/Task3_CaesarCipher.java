package Основы.HomeWork3;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Task3_CaesarCipher {
		
	/* Пользователь вводит имя файла со строками.
	 * Зашифровать файл шифром Цезаря (Caesar cipher).
	 * http://ru.wikipedia.org/wiki/%D0%A8%D0%B8%D1%84%D1%80_%D0%A6%D0%B5%D0%B7%D0%B0%D1%80%D1%8F
	 */
	
	/* Прочитать строку, каждый символ изменить в аски коде на 3 единицы.
	 * 
	 */
		
	public static void main(String[] args) throws Exception {
			
			Scanner scanfileName = new Scanner(System.in);
			
			System.out.println("Введите имя файла: ");
			
			String fileName = scanfileName.nextLine();
			
			//Читаем файл.
			FileReader reader = new FileReader (fileName);
					
			//Читаем строку из файла и присваиваем её к line.
			Scanner scanFile = new Scanner(reader);
			String line = scanFile.nextLine();
		
			//Записываем строки в файл.
			FileWriter writerFile = new FileWriter(fileName);

			String lineChange = changeCaesarCipher (line);		
			writerFile.write(lineChange + '\n');
			while (scanFile.hasNextLine()) {			
					
					line = scanFile.nextLine();			
					String lineChange1 = changeCaesarCipher (line);
					writerFile.write(lineChange1 + '\n');
			}
			System.out.println("Файл зашифрован шифром Цезаря.");
					
			scanFile.close(); //Закрыли сканер.
			writerFile.close(); //Обязательно. Закрыли writer.
	}

	public static String changeCaesarCipher (String lineFromMain) {
		
		final char spase = ' ';
		String a = "";
		String LineCaesarCipher = "";
		for (int i = 0; i < lineFromMain.length(); i++){
		
			if ((lineFromMain.charAt(i) != spase) && (lineFromMain.charAt(i) != 'э') && (lineFromMain.charAt(i) != 'ю') && (lineFromMain.charAt(i) != 'я')&& (lineFromMain.charAt(i) != 'Э') && (lineFromMain.charAt(i) != 'Ю') && (lineFromMain.charAt(i) != 'Я')) {
			int numSymb = (int)lineFromMain.charAt(i);
			int numSYMB = numSymb + 3;
			
			char symb = (char)numSYMB;
			LineCaesarCipher = LineCaesarCipher + symb;
			
			} else if (lineFromMain.charAt(i) == spase) {
				LineCaesarCipher = LineCaesarCipher + " ";
				
			} else if (lineFromMain.charAt(i) == 'э') {
				LineCaesarCipher = LineCaesarCipher + "a";
				
			} else if (lineFromMain.charAt(i) == 'ю') {
				LineCaesarCipher = LineCaesarCipher + "б";
				
			} else if (lineFromMain.charAt(i) == 'я') {
				LineCaesarCipher = LineCaesarCipher + "в";
				
			} else if (lineFromMain.charAt(i) == 'Э') {
				LineCaesarCipher = LineCaesarCipher + "А";
				
			} else if (lineFromMain.charAt(i) == 'Ю') {
				LineCaesarCipher = LineCaesarCipher + "Б";
				
			} else if (lineFromMain.charAt(i) == 'Я') {
				LineCaesarCipher = LineCaesarCipher + "В";
			}
		}
		return LineCaesarCipher;	
	}
}
