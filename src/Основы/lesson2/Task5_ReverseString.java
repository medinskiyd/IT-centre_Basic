package ������.lesson2;

import java.util.Scanner;

/* ������������ ������ �����, ������� �� ����� �������� ������������������ �����
 * �� ��������� ����� �� �������.
 **/

public class Task5_ReverseString {

		public static void main(String[] args) {
		
		System.out.println("������� �����");
		
		Scanner scan = new Scanner(System.in);
		
		int val1 = 0;
		if (scan.hasNextInt()) {
			
			val1 = scan.nextInt();
		} 	else { 
			
			System.out.println("������ �����");
			return;
		}	
		
		System.out.print("������������������ ����� �� " + val1 + " �� 0: ");
		
		for (int i = 0; i <= val1; i++) {
			
			int a = val1 - i;
				System.out.print(" "+ a + " ");
		}
	}
}