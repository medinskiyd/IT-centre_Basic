package ������.HomeWork3;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Task4_RLE {

	/* ������������ ������ ��� ���������� �����.
	 * �������������� ���� ���������� RLE.
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

		String lineChange = changeRLE (line);		
		writerFile.write(lineChange + '\n');
		while (scanFile.hasNextLine()) {			
				
				line = scanFile.nextLine();			
				String lineChange1 = changeRLE (line);
				writerFile.write(lineChange1 + '\n');
		}
		System.out.println("���� ���������� ������ RLE.");
				
		scanFile.close(); //������� ������.
		writerFile.close(); //�����������. ������� writer.
		
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
