package ������.lesson5;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Task2_CopyInfFromFile1ToFile2 {
	
	/* ������������ ������ ����� 2-� ������. 
	 * ����������� ���������� � ������� ����� �� ������. 
	 */
	
	public static void main(String[] args) throws Exception  {
	
		Scanner scanName = new Scanner(System.in);
		
		System.out.println("������� ��� ����� �1: ");
		String FILE_NAME = scanName.nextLine(); //����� ��� ����� ���������.
		
		System.out.println("������� ��� ����� �2: ");
		String FILE_NAME2 = scanName.nextLine(); //����� ��� ����� ���������.
		
		// ������ ���������� � ������� �����.
		FileReader reader = new FileReader (FILE_NAME);
		Scanner scanReaderFirstFile = new Scanner(reader);
		String line = scanReaderFirstFile.nextLine();
		
		//���������� ������ � ������� ����� �� ������ ����.
		FileWriter writerInSecondFile = new FileWriter(FILE_NAME2);
		
		writerInSecondFile.write(line + '\n');
		while (scanReaderFirstFile.hasNextLine()) {			
			 line = scanReaderFirstFile.nextLine();			
			 writerInSecondFile.write(line + '\n');
		}
		
		scanReaderFirstFile.close(); //������� ������.

		writerInSecondFile.close(); //�����������. ������� writer.
		
		System.out.println("���������� � ������� ����� �������� �� ������.");
	}
}