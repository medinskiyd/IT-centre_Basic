package ������.lesson5;

import java.io.FileReader;
import java.util.Scanner;

public class Task1_StringsInFile {
	
	/* ������������ ������ ��� �����. 
	 * ��������� ���������� ����� � �����. 
	 */
	public static void main(String[] args) throws Exception  {
		
		
		System.out.println("������� ��� �����: ");
		
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
		System.out.println("���������� ����� � ����� = " + counter + ".");
		
		scan.close();
		
		// //�������� ������ �������.

	}
		
}