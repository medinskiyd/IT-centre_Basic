package ������.lesson2;

import java.util.Scanner;

/* ���������� �������:
 * 
 *           *
 *          **
 *         ***
 *    
 * */

public class Task7_ReverseLesenka1 {

	public static void main(String[] args) {
		
		System.out.println("������� ����� ������ ������������");
		
		Scanner scan = new Scanner(System.in);
		
		int n = 0; 
		if (scan.hasNextInt()) {
			
			n = scan.nextInt(); //������ ������ ������������.
		} 	else { 
			
			System.out.println("������ �����");
			return;
		}	
		
		String a = "*";
		String b = " ";
		
		int m = n; //����������� ���������� ��������� � ������, ��� ��� n ����� ��� ������������.
		for (int i=0; i < m; i++) {
																	
			for (int j = 0; j < m; j++) { // ���� �� 3-�.
				
				if(j < n-1) {
					System.out.print(b);
					
				} else if (j >= n-1) {
					System.out.print(a);
				}				 
			}
				n = n - 1;		
				System.out.println();
		}		
	}
}
