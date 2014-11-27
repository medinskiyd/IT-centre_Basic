package ������.HomeWork3;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class  Task3a_MyCaesarCipher {
		
	/* ������������ ������ ��� ����� �� ��������.
	 * � ���� ��� ����������.
	 * 
	 * ����������� ���� ������ ������ (Caesar cipher).
	 * http://ru.wikipedia.org/wiki/%D0%A8%D0%B8%D1%84%D1%80_%D0%A6%D0%B5%D0%B7%D0%B0%D1%80%D1%8F
	 */
	
	/* ��������� ������, ������ ������ �������� � ���� ���� �� n ������.
	 * �������� �� ������ ���������, ���� ���� �� ����� 3 �������� � ���������� ���������.
	 */
		
	public static void main(String[] args) throws Exception {
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("������� ��� �����: ");
			String fileName = scan.nextLine();
			
			System.out.println("������� ���� ����������: ");
			int key = scan.nextInt();
			
			//������ ����.
			FileReader reader = new FileReader (fileName);
					
			//������ ������ �� ����� � ����������� � � line.
			Scanner scanFile = new Scanner(reader);
			String line = scanFile.nextLine();
		
			//���������� ������ � ����.
			FileWriter writerFile = new FileWriter(fileName);

			String lineChange = changeCaesarCipher (line, key);		
			writerFile.write(lineChange + '\n');
			while (scanFile.hasNextLine()) {			
					
					line = scanFile.nextLine();			
					String lineChange1 = changeCaesarCipher (line, key);
					writerFile.write(lineChange1 + '\n');
			}
			System.out.println("���� ���������� ������ ������ � ������ " + key + ".");
					
			scanFile.close(); //������� ������.
			writerFile.close(); //�����������. ������� writer.
	}

	public static String changeCaesarCipher (String lineFromMain, int key1) {
		
		final char spase = ' ';
		String a = "";
		String LineCaesarCipher = "";
		for (int i = 0; i < lineFromMain.length(); i++){
		
			if ((lineFromMain.charAt(i) != spase) && (lineFromMain.charAt(i) != 'x') && (lineFromMain.charAt(i) != 'y') && (lineFromMain.charAt(i) != 'z') && (lineFromMain.charAt(i) != 'X') && (lineFromMain.charAt(i) != 'Y') && (lineFromMain.charAt(i) != 'Z')) {
			int numSymb = (int)lineFromMain.charAt(i);
			int numSYMB = numSymb + key1;
			
			char symb = (char)numSYMB;
			LineCaesarCipher = LineCaesarCipher + symb;
			
			} else if (lineFromMain.charAt(i) == spase) {
				LineCaesarCipher = LineCaesarCipher + " ";
				
			} else if (lineFromMain.charAt(i) == 'x') {
				int x = 97+key1;
				LineCaesarCipher = LineCaesarCipher + (char)x;
				
			} else if (lineFromMain.charAt(i) == 'y') {
				int y = 98+key1;
				LineCaesarCipher = LineCaesarCipher + (char)y;
				
			} else if (lineFromMain.charAt(i) == 'z') {
				int z = 99+key1;
				LineCaesarCipher = LineCaesarCipher + (char)z;
				
			} else if (lineFromMain.charAt(i) == 'X') {
				int X = 65+key1;
				LineCaesarCipher = LineCaesarCipher + (char)X;
				
			} else if (lineFromMain.charAt(i) == 'Y') {
				int Y = 66+key1;
				LineCaesarCipher = LineCaesarCipher + (char)Y;
				
			} else if (lineFromMain.charAt(i) == 'Z') {
				int Z = 67+key1;
				LineCaesarCipher = LineCaesarCipher + (char)Z;
			}
		}
		return LineCaesarCipher;	
	}
}
