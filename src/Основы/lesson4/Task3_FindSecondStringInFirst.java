package ������.lesson4;

/* ������������ ������ 2 ������.
 * ���������� ���������� �� 2-� ������ � ������.
 *  
 */

import java.util.Scanner;

public class Task3_FindSecondStringInFirst {

	public static void main(String[] args) {

		System.out.println("������� 2 ������ ����� ������: ");
		Scanner scan = new Scanner (System.in);
		String str1 = scan.nextLine();
		String str2 = scan.nextLine();
			
		int YesOrNo = InOrOutString(str1, str2);
			
		if  (YesOrNo == 0) {
			System.out.println("� ������ ������ ���� ������ ������");
			
		} else {
			System.out.println("� ������ ������ ��� ������ ������");
		}	
		
	}
	public static int InOrOutString(String str1a, String str2a) { //����� ���������� ������� ������ �2 � ������ �1.
				
		int str2InStr1 = str1a.indexOf(str2a);
		String in = "� ������ ������ ����1 ������ ������";
		int a = 0;
		
		if (str2InStr1 >= 0) { //� ������ ������ ���� ������ ������
			a = 0; 
		} else if (str2InStr1 == -1) { //� ������ ������ ��� ������ ������
			a = 1; 
		}	
		
		return (a);
	}
}