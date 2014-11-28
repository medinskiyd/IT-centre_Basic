package ������.HomeWork4.Task4_MyArrayList;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		System.out.println("������� ���������� ��������� ������:");
		int length = scan.nextInt();
	
		//������� ������� ��������.
		MyArrayList string = new MyArrayList();
	
		//������ ������ �������������� �������.
		string.setStringLength(length);
		
		//������ �������� �������.
		for (string.i = 0; string.i < length; string.i++){
			System.out.print("������� ������� ������:");
			
			int el = scan.nextInt(); 
			
			//���������� ������� � ������.
			string.setEl(el);
		}
		
		System.out.println("����� ������ �� " + length + " ���������:");
		
		//������� �������� ����� ������.
		for (string.i = 0; string.i < length; string.i++){
		
			//������� �������� �� �����.
			System.out.print(" " + string.getEl() + " ");		
		}
		System.out.println();
	
		// ��������� ������� � ����� ������.
		System.out.println("������� ����� ������� ������:");
		int newEl = scan.nextInt();
		string.addEl(newEl);
		
		System.out.println("����� ������:");
		//������� �������� ����� ����� ������.
		for (string.i = 0; string.i < length+1; string.i++){
						
			//������� �������� �� �����.
			System.out.print(" " + string.getEl2() + " ");		
		}
		System.out.println();
		
		System.out.println("������� ������� ������ ������ �������� ����� �����:");
		int el = scan.nextInt();
		int index = string.indexOf(el);
		
		System.out.println("������� " +  el + " ����� ������ " + index);
		System.out.println();
		
		// ������� ������� ����� ������.
		System.out.println("������� ����� �������� ������ ������� ����� �������:");
		int numDelEl = scan.nextInt();
		string.delEl(numDelEl);
				
		System.out.println("����� ������:");
		//������� �������� ����� ����� ������.
		for (string.i = 0; string.i < length; string.i++){
								
			//������� �������� �� �����.
			System.out.print(" " + string.getAfterDel() + " ");		
		}
		
	scan.close(); // ��������� �������.
		
	}

}