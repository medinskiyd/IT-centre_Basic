package ������.lesson2;

import java.util.Scanner;

/* 1. ������������ ������ ���� ���, ���������������� ������������ �� ��� �����.
 * 2. ������������ ������ ���� �������, ������� �� ����� ���������� ��� �����. */

public class Task2_NameAndAge {

	public static void main(String[] args) {
		
		System.out.println("������� ���� ���:");
		
		Scanner scan = new Scanner(System.in); 
		
		String name = scan.nextLine(); // ���� �����.
		
		System.out.println("��� �����: " + name); // ����� �����.
		System.out.println("������� ���� �������:"); 
		
		int age = scan.nextInt(); // ���� ��������.
			
		System.out.println("������� ������� � ������� �� ������: ");
		
		int ageToDie = scan.nextInt(); // ���� �������� ������.
		int oldToDie = ageToDie - age; // �� �������� ������ ���������� ������� �������.
		
		System.out.println("��� �������� ����: " + oldToDie);

	}

}
