package ������.HomeWork2;

import java.util.Scanner;

public class Task8_FirstSymbOfWordsToBig {
	
	/* ������� �������.

	�������� ���������, ������� ��������� ������������ ������ � ������� ������,  
	��������� ������ ������ ���� � ������� ������� � ��������� ������� � �������

	����:
	���� ����������
	
	�����:
	���� ����������
 * 
 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		
		
		System.out.println("������� ������: ");  // ������ ������.
		String str = scan.nextLine(); 
		String strReverse = strReverse(str); // ���������� ���������� ������ �� ������ strReverse.	
		System.out.println("���� ������: " + strReverse + ".");
		scan.close();
	}

	//����� ������ ������� � ������� �� ������� ������ �������� ����.
	public static String strReverse (String str1) { 
		
//		������ ������ ��������� ������ ������ � ������� �����.
//		���� �� ����� ������ "������" �� ����� ���� ������ �������� � ������� �������� �� ������� �������.
		
		final char spase = ' ';
		String BIGlineFromMain = str1.toUpperCase();
		String a = "";
		
		a = a + BIGlineFromMain.charAt(0);
		
		for (int i = 1; i < str1.length(); i++){
				
			 if (str1.charAt(i) == spase) {
				a = a + " " + BIGlineFromMain.charAt(i+1);
				
			} else  if ((str1.charAt(i) != spase) && (str1.charAt(i-1) != spase)) {
					a = a + str1.charAt(i) ; 
					}	
		}
		return a;
	}
}
