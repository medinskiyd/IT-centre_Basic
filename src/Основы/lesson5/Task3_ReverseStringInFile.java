package ������.lesson5;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Task3_ReverseStringInFile  {
	
	/* ������������ ������ ��� ����� � ������� 1 ������.
	 * ����������� ������ ����� �������. ������: qwerty - ytrewq.
	 * � �������� � ����.
	 * 
	 */
		
	public static void main(String[] args) throws Exception  {
				
			System.out.println("������� ��� �����: ");
				
			//������ ��� �����.
			Scanner scanFileName = new Scanner(System.in);
			String FILE_NAME = scanFileName.nextLine();
			
			//������ ������ �� �����.
			FileReader reader = new FileReader (FILE_NAME);
			
			//������ ������ �� ����� � ����������� � � line.
			Scanner scanFile = new Scanner(reader);
			String line = scanFile.nextLine();	

			String reverseStr = obratnString(line); //���� ������� ���������� ������.
			
			//���������� � ���� ���������� ������ reverseStr.
			FileWriter writerFile = new FileWriter(FILE_NAME);
			writerFile.write(reverseStr + '\n');
			
			//������� ���������.
			System.out.println("���������� ������ ������������ � ���� "+ FILE_NAME + ": " + reverseStr + ".");
			
			writerFile.close();
			scanFile.close();
	}		
	 	//����� ���������� ���������� ������.
		public static String obratnString(String line1) {
				
			String reverseStr1 = "";
			char symb = 'a';
			for (int i = 0; i < line1.length(); i++){
				
				symb = line1.charAt(line1.length() - 1 - i); // str1.charAt ���������� � ���������� ������  
															 // �� ������ ��� ������� ������� � �������.
				reverseStr1 = reverseStr1 + symb;
			}
			System.out.println();
				
		return reverseStr1;
		}
}
