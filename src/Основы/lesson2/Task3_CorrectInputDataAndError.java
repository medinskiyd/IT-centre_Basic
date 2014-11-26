package ������.lesson2;

import java.util.Scanner;

/* ������������ ������ �� ����� 2 �����, ������� �� ����� ������� �� ���.
 * ������� �������� ����������� ������.
 * ���� �� ���������� ����, ������� �� ����� - "������ �����". */

public class Task3_CorrectInputDataAndError  {

	public static void main(String[] args) {
		
		System.out.println("������� 2 �����:");
		
		Scanner scan = new Scanner(System.in);
						
		int val1 = 0;
		if (scan.hasNextInt()) { 
/* ������� �������� �� ������������ (������� �� ������ �����),
* ���� scan.hasNextInt() = true, �� ������ �����, ���� scan.hasNextInt() = false, �� ��������� "������ �����" */
			
			val1 = scan.nextInt();   
		} else { 
			
			System.out.println("������ �����");
			return;
		}
		
		int val2 = 0;
		if (scan.hasNextInt()) {
			val2 = scan.nextInt();
		} else { 
			
			System.out.println("������ �����");
			return;
		}
		
		if (val1 > val2) { // ������� "������ ����� ������ �������".
			
			System.out.println("������ ����� ������ ������� � ����� " + val1 + ".");
			
		} 
			
		if (val2 > val1) { // ������� "������ ����� ������ �������".
					
			System.out.println("������ ����� ������ ������� � ����� " + val2 + ".");
			
		} 
		}
	}


