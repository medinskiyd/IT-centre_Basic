package ������.lesson2;

import java.util.Scanner;

/* ������������ ������ ������ �����, ���������� ��� ����� ����������� " * ",
 * ��������� �� ����������� �����.
 */

public class Task4_DrawLine {

	public static void main(String[] args) {
		
		System.out.println("������� ������ �����:");
		
		Scanner scan = new Scanner(System.in);
		
		int lenght = 0;
		if (scan.hasNextInt()) {
			lenght = scan.nextInt();
		} 	else { 
			
			System.out.println("������ �����");
			return;
		}
			
			System.out.print("���� ����� - ");
		
		for (int i = 0; i < lenght; i++) { // ���������� ���� ��� ��������� ����� �� ���������.
			
			System.out.print("*");
		
		}
	}	
}
