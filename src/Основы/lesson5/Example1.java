package ������.lesson5;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) throws Exception  {
		
		
		final String FILE_NAME = "text.txt";
		FileReader reader = new FileReader (FILE_NAME);
		Scanner scan = new Scanner(reader);
		String line = scan.nextLine();
		System.out.println(line);
		
		
		System.out.println("Read file");
		while (scan.hasNextLine()) {
			line = scan.nextLine();
			System.out.println(line);
			
		}
		
		scan.close(); //�������� ������.

		FileWriter writer = new FileWriter(FILE_NAME);
		writer.write("To file"); 
		writer.write("To file"); // ����� �������� � ������ �� ������ "To file"
		writer.write("To file" + '\n'); //����� �� ������ �� ����� ������.
		
		writer.close(); //�����������.
	}

}
