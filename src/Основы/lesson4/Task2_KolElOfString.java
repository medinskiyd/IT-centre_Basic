package ������.lesson4;

import java.util.Scanner;

public class Task2_KolElOfString {
	
	/* ������������ ������ ������.
	 * ��������� ������� �������� � ������ � ������� �� �����.
	*/

	public static void main(String[] args) {

		System.out.println("������� ������: ");
		Scanner scan = new Scanner (System.in);
		String str = scan.nextLine();
		int len = str.length(); //������ ������.
		
		int kol = numSymb(len);
		System.out.println(kol);
	}
			
	public static int numSymb(int len1) { //����� �� ������ ������ ����������� ���������� ��������� � ������.

		int kolOfSymb = 0;
		
		for (int i = 0; i < len1; i++) {
			
			kolOfSymb = kolOfSymb + 1;
		}
		return(kolOfSymb);
	}
}
