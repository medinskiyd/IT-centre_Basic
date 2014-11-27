package ������.lesson3;

/*��������� ������ ������ ����������:
 * 1  2  3  4
 * 5  6  7  8
 * 9  10 11 12
 * 13 14 15 16
 */

import java.util.Scanner;

public class Task2_Matrix1234 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("������� ������ �������: ");
		
		int a = scan.nextInt(); //������ ������ �������.
				
		int m [][] = new int [a][a]; //������� ������.
		int counter = 1; //������ �������� �������.
			
		for (int i = 0; i < m.length; i++) {
		
			System.out.print("[ ");
			
			for (int j = 0; j < m.length; j++) {
				m[i][j] = counter++; //������������ �������� � ������ i � ������� j.
				
				System.out.print(m[i][j]);
				
				if (j < m.length-1) {
					System.out.print(", "); //���� ����� ���������� ����� ������ ������� ����� �� ������� ",".
				} else if (j == m.length-1) {
					System.out.print(" "); //���� ����� ���������� ����� = ������� ����� �� ������� " ".
				}
			}
			System.out.println("]");
		}
	}
}
