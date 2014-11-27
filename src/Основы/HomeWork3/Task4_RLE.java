package Основы.HomeWork3;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Task4_RLE {

	/* Пользователь вводит имя текстового файла.
	 * Заархивировать файл алгоритмом RLE.
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

		String lineChange = changeRLE (line);		
		writerFile.write(lineChange + '\n');
		while (scanFile.hasNextLine()) {			
				
				line = scanFile.nextLine();			
				String lineChange1 = changeRLE (line);
				writerFile.write(lineChange1 + '\n');
		}
		System.out.println("Файл зашифрован шифром RLE.");
				
		scanFile.close(); //Закрыли сканер.
		writerFile.close(); //Обязательно. Закрыли writer.
		
	}
	
	public static String changeRLE (String lineFromMain) {
		
		final char spase = ' ';
		String LineRLE = "";
		int n = 1;
		for (int i = 0; i < lineFromMain.length()-1; i++){
			
			if (lineFromMain.charAt(i) == lineFromMain.charAt(i+1)) {
				n++;
				
			} else if ((lineFromMain.charAt(i+1) == spase) || (i == lineFromMain.length()-2)) {
				LineRLE = LineRLE + n + lineFromMain.charAt(i);
				n = 1;
				
			} else if ((lineFromMain.charAt(i) != lineFromMain.charAt(i+1)) && ((lineFromMain.charAt(i+1) == spase))) {
				LineRLE = LineRLE + lineFromMain.charAt(i);
			}
		}
		return LineRLE;	
	}
}
