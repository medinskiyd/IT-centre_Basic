package ������.HomeWork4.Task2_MyCalcConsoleMenu;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		System.out.println("�������� ���� ��������: 1. ��������; 2. ���������. 3.���������. 4. �������.");
		int action = scan.nextInt();
		
		System.out.println("������� 2 �����:");
		int first = scan.nextInt();
		int second = scan.nextInt();
		
		MyCalcConsoleMenu values = new MyCalcConsoleMenu();
		
		values.setValue(first, second);

		// ����������� ��������.
		if (action == 1) {
			System.out.println("����������� ��������:");
			System.out.println(first + " + " + second + " = " + values.add() + ".");
		}
		
		// ����������� ���������.
		if (action == 2) {
			System.out.println("����������� ���������:");
			System.out.println(first + " - " + second + " = " + values.sub() + ".");
		}
		
		// ����������� ���������.
		if (action == 3) {
			System.out.println("����������� ���������:");
			System.out.println(first + " * " + second + " = " + values.multip() + ".");				
		}

		// ����������� �������.
		if (action == 4) {
			System.out.println("����������� �������:");
			System.out.println(first + " / " + second + " = " + values.div() + ".");				
		}
		scan.close();
	}
}
