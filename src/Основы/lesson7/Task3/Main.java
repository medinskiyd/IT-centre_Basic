package ������.lesson7.Task3;

import java.util.Scanner;

public class Main {
	
	//��������� �������������� �������� � ��� ����������� ���� Int.

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("������� ����� �1:");
		int value1 = scan.nextInt();
		
		System.out.println("������� ����� �2:");
		int value2 = scan.nextInt();
		
		Int firstInt = new Int(); //������ ���������� ���� Int.
		Int secondInt = new Int(); //������ ���������� ���� Int.		
		
		firstInt.setValue(value1);
		secondInt.setValue(value2);
		
		//����� 2-� ���������� ���� Int.
		Int sum = firstInt.add(secondInt);
		int sum1 = sum.getValue();
		
		System.out.println("����� " + firstInt.getValue() + " + " + secondInt.getValue() + " = " + sum1 + ".");
		
		//��������� 2-� ���������� ���� Int.
		Int multip = firstInt.multip(secondInt);
		int multip1 = multip.getValue();
		System.out.println("��������� " + firstInt.getValue() + " * " + secondInt.getValue() + " = " + multip1 + ".");
		
		//������� 2-� ���������� ���� Int.
		Int div = firstInt.div(secondInt);
		int div1 = div.getValue();
		System.out.println("������� " + firstInt.getValue() + " / " + secondInt.getValue() + " = " + div1 + ".");
	
		scan.close();
	}
}
