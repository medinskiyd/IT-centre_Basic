package Основы.HomeWork3;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Task3b_RashifratorCaesarCipher {
		
	/* Пользователь вводит имя файла со строками.
	 * Расшифровать файл зашифрованный шифром Цезаря (Caesar cipher).
	 * http://ru.wikipedia.org/wiki/%D0%A8%D0%B8%D1%84%D1%80_%D0%A6%D0%B5%D0%B7%D0%B0%D1%80%D1%8F
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
			int numSYMB = numSymb - 3;
			
			char symb = (char)numSYMB;
			LineCaesarCipher = LineCaesarCipher + symb;
			
			} else if (lineFromMain.charAt(i) == spase) {
				LineCaesarCipher = LineCaesarCipher + " ";
				
			} else if (lineFromMain.charAt(i) == 'а') {
				LineCaesarCipher = LineCaesarCipher + "э";
				
			} else if (lineFromMain.charAt(i) == 'б') {
				LineCaesarCipher = LineCaesarCipher + "ю";
				
			} else if (lineFromMain.charAt(i) == 'в') {
				LineCaesarCipher = LineCaesarCipher + "я";
				
			} else if (lineFromMain.charAt(i) == 'А') {
				LineCaesarCipher = LineCaesarCipher + "Э";
				
			} else if (lineFromMain.charAt(i) == 'Б') {
				LineCaesarCipher = LineCaesarCipher + "Ю";
				
			} else if (lineFromMain.charAt(i) == 'В') {
				LineCaesarCipher = LineCaesarCipher + "Я";
			}
		}
		return LineCaesarCipher;	
	}
}
