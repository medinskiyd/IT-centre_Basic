package ������.lesson2;

import java.util.Scanner;

public class Task1_SummOfValue {
	
	/* ������������ ������ 2 �����, ������� �� ����� �� ����� � �������. */

	public static void main(String[] args) {
		
		System.out.println("������� 2 �����:");
		
		Scanner scan = new Scanner(System.in);
		
		int val1 = scan.nextInt();
		int val2 = scan.nextInt();
		
		int sum = val1 + val2;
		int kvad = val1 * val1;
		
		int kvad1 = val2 * val2;
		
		System.out.println("����� = " + sum + "; ������� ������� ����� = " + kvad + "; ������� ������� ����� = " + kvad1 + ".");

	}

}
