package ������.lesson3;

/* �������� ����� - ��������� �� ����� ������� �� ���������, 
 * ������ ������� �������� ���������� � ����� � �������� ���������.
 * 
 */

import java.util.Scanner;

public class Task5_MetodKvadratOfStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("������� ������ ��������: ");
		
		Scanner scan = new Scanner(System.in);
		
		int inputValue = 0;
		inputValue = scan.nextInt();
		
		System.out.println("������� �������� " + inputValue + " �� " + inputValue + ":");
		
		int f = kvad(inputValue);
	}
	
	public static int kvad(int d) {
			
		String c = "*";
			
		for (int i = 0; i < d; i++) { // ���� �� 3-�.
			
			for (int j = 0; j < d; j++)
			
				System.out.print(c);
				System.out.println(" ");
		}
		return d;
		}		
	}


