package ������.HomeWork4.Task0_IntMath;

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
			
			//������� 2-� ���������� ���� Int.
			Int diff = firstInt.diff(secondInt);
			int diff1 = diff.getValue();
					
			System.out.println("������� " + firstInt.getValue() + " - " + secondInt.getValue() + " = " + diff1 + ".");
			
			//��������� 2-� ���������� ���� Int.
			Int multip = firstInt.multip(secondInt);
			int multip1 = multip.getValue();
			System.out.println("��������� " + firstInt.getValue() + " * " + secondInt.getValue() + " = " + multip1 + ".");
			
			//������� 2-� ���������� ���� Int.
			Int div = firstInt.div(secondInt);
			int div1 = div.getValue();
			System.out.println("������� " + firstInt.getValue() + " / " + secondInt.getValue() + " = " + div1 + ".");
		
			//���������� ������� ����� ���� Int � ������� ������ ������� ���� Int.
			Int pow = firstInt.pow(secondInt);
			int pow1 = pow.getValue();
			System.out.println("���������� ����� " + firstInt.getValue() + " � ������� " + secondInt.getValue() + " = " + pow1 + ".");
			
			//��������� ������� ����� ���� Int.
			Int fact = firstInt.fact(secondInt);
			int fact1 = fact.getValue();
			System.out.println("��������� " + firstInt.getValue() + " = " + fact1 + ".");
			
			//��������� ������� ����� ���� Int.
			Int modulo = firstInt.modulo(secondInt);
			int modulo1 = modulo.getValue();
			System.out.println("������� ��� " + firstInt.getValue() +" / " + secondInt.getValue() + " = " + modulo1 + ".");
			
			scan.close();
		}
}
