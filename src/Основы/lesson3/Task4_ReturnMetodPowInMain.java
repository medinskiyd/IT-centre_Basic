package ������.lesson3;

import java.util.Scanner;

public class Task4_ReturnMetodPowInMain {
	
	/* �������� ����� ������������ ��������� ����� � main.
	 * 
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("������� 2 �����: ");
		
		int value1 = scan.nextInt();
		int value2 = scan.nextInt();
			
		int a = pow(value1, value2);
		
		System.out.println("��������� ����� "+ value1 +" � "+ value2 +" = "+ a +".");
		
	}
	
	public static int pow(int val, int pow1) {
		int kv = val * pow1;
		return kv;
	}
}
