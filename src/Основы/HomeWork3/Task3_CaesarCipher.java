package ������.HomeWork3;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Task3_CaesarCipher {
		
	/* ������������ ������ ��� ����� �� ��������.
	 * ����������� ���� ������ ������ (Caesar cipher).
	 * http://ru.wikipedia.org/wiki/%D0%A8%D0%B8%D1%84%D1%80_%D0%A6%D0%B5%D0%B7%D0%B0%D1%80%D1%8F
	 */
	
	/* ��������� ������, ������ ������ �������� � ���� ���� �� 3 �������.
	 * 
	 */
		
	public static void main(String[] args) throws Exception {
			
			Scanner scanfileName = new Scanner(System.in);
			
			System.out.println("������� ��� �����: ");
			
			String fileName = scanfileName.nextLine();
			
			//������ ����.
			FileReader reader = new FileReader (fileName);
					
			//������ ������ �� ����� � ����������� � � line.
			Scanner scanFile = new Scanner(reader);
			String line = scanFile.nextLine();
		
			//���������� ������ � ����.
			FileWriter writerFile = new FileWriter(fileName);

			String lineChange = changeCaesarCipher (line);		
			writerFile.write(lineChange + '\n');
			while (scanFile.hasNextLine()) {			
					
					line = scanFile.nextLine();			
					String lineChange1 = changeCaesarCipher (line);
					writerFile.write(lineChange1 + '\n');
			}
			System.out.println("���� ���������� ������ ������.");
					
			scanFile.close(); //������� ������.
			writerFile.close(); //�����������. ������� writer.
	}

	public static String changeCaesarCipher (String lineFromMain) {
		
		final char spase = ' ';
		String a = "";
		String LineCaesarCipher = "";
		for (int i = 0; i < lineFromMain.length(); i++){
		
			if ((lineFromMain.charAt(i) != spase) && (lineFromMain.charAt(i) != '�') && (lineFromMain.charAt(i) != '�') && (lineFromMain.charAt(i) != '�')&& (lineFromMain.charAt(i) != '�') && (lineFromMain.charAt(i) != '�') && (lineFromMain.charAt(i) != '�')) {
			int numSymb = (int)lineFromMain.charAt(i);
			int numSYMB = numSymb + 3;
			
			char symb = (char)numSYMB;
			LineCaesarCipher = LineCaesarCipher + symb;
			
			} else if (lineFromMain.charAt(i) == spase) {
				LineCaesarCipher = LineCaesarCipher + " ";
				
			} else if (lineFromMain.charAt(i) == '�') {
				LineCaesarCipher = LineCaesarCipher + "a";
				
			} else if (lineFromMain.charAt(i) == '�') {
				LineCaesarCipher = LineCaesarCipher + "�";
				
			} else if (lineFromMain.charAt(i) == '�') {
				LineCaesarCipher = LineCaesarCipher + "�";
				
			} else if (lineFromMain.charAt(i) == '�') {
				LineCaesarCipher = LineCaesarCipher + "�";
				
			} else if (lineFromMain.charAt(i) == '�') {
				LineCaesarCipher = LineCaesarCipher + "�";
				
			} else if (lineFromMain.charAt(i) == '�') {
				LineCaesarCipher = LineCaesarCipher + "�";
			}
		}
		return LineCaesarCipher;	
	}
}
