package ������.lesson4;

import java.util.Scanner;

public class Task4_ReverseStringElements {
	
	/* ������������ ������ ������.
	 * ����������� ������� � ������ � �������� ������� � ������� �� �����.
	 */

	public static void main(String[] args) {

		System.out.println("������� ������: ");
		Scanner scan = new Scanner (System.in);
		String str = scan.nextLine();
		
		int len = str.length();
		
		String symb1 = obratnString(len, str);
		System.out.print(symb1);
	}
	
		public static String obratnString(int len1, String str1) {
		
			String str3 = "";
			char symb = 'a';
			for (int i = 0; i < len1; i++){
			
				symb = str1.charAt(len1 - 1 - i); // str1.charAt ���������� � ���������� ������ �� ������ str1 ��� ������� ������� � �������.
				//System.out.println(symb);
				String str2 = "" + symb;
				System.out.print(str2);
			}
		return str3;
		}
}
