package ������.HomeWork4.Task3_MyClassString;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner (System.in);
		
		System.out.println("������� ���������� �������� � 1 ������:");
		int length = scan.nextInt();
		System.out.println("������� ���������� �������� � 2 ������:");
		int length1 = scan.nextInt();
		
	
		//������� ������� ��������.
		MyClassString string = new MyClassString();
	
		//������ ������ �������������� �������.
		string.setStringLength1(length);
		
		//������ �������� 1 �������.
		for (string.i = 0; string.i < length; string.i++){
			System.out.print("������� ������ ��� ������ ������:");
			
			String str = scan.next();
			char symb = str.charAt(0); // �� �������� ��� ��� ������ �� �� ��� ���...
			
			//���������� ������� � 1 ������.
			string.setNewStringEl1(symb);
		}
		
		System.out.println("����� ������ 1 �� " + length + " ��������:");
		//������� �������� ����� ������.
		for (string.i = 0; string.i < length; string.i++){
		
			//������� �������� �� �����.
			System.out.print(" " + string.getStringEl1() + " ");		
		}
		System.out.println();
	
		//������ �������� 2 �������.
		for (string.i = 0; string.i < length1; string.i++){
			System.out.print("������� ������ ��� ������ ������:");
			
			String str1 = scan.next();
			char symb1 = str1.charAt(0);
					
			//���������� ������� � 2 ������.
			string.setNewStringEl2(symb1);
		}
				
		System.out.println("����� ������ 2 �� " + length1 + " ��������:");
		//������� �������� ����� ������.
		for (string.i = 0; string.i < length1; string.i++){
				
			//������� �������� �� �����.
			System.out.print(" " + (char)string.getStringEl2() + " ");		
		}
		System.out.println();
		
		System.out.println("��������� ������ ������ � ������:");
		
		string.addString ();
		
		//������� �������� ����� ����� ������.
		for (string.i = 0; string.i < length+length1; string.i++){
						
			//������� �������� �� �����.
			System.out.print(" " + (char)string.getStringEl3() + " ");		
		}
		System.out.println();
		
		System.out.println("��� ������� ���������:");
		string.getDownStringSymb();
		//������� �������� ����� ����� ������.
		for (string.i = 0; string.i < length+length1; string.i++){
								
			//������� �������� �� �����.
			System.out.print(" " + (char)string.getDownStringSymb() + " ");		
		}
		System.out.println();
		
		
	scan.close(); // ��������� �������.
		
	}

}
