package ������.HomeWork2;

import java.util.Scanner;

/*�������� ������� ����� ������� � ����� ��������� ������ � ��������� �������.
 * 4 na 4
 */

public class Task5_ReverseMaxMinStringOfMatrix {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("������� ������ �������: "); //������ ������ �������.
		
		int size = scan.nextInt();
		
		int [][] matrix = new int [size][size];
		
		int b = 0;
		
		System.out.println("����� ��������� ������ " + size + " �� " + size + ":");
		
		for (int i = 0; i < matrix.length; i++){ //���������� ������� ���������� �������.
			
			System.out.print("[ ");
			for (int j = 0; j < matrix.length; j++) {
			
				b = (int) (Math.random()*(size+1));
				matrix [i][j] = b;
				System.out.print(matrix[i][j] + " "); 
				
				if (j < matrix.length-1) {
					System.out.print(", "); //���� ����� ���������� ����� ������ ������� ������� �� ������� ", ".
				
				} else if (j == matrix.length-1) {
					System.out.println("]"); //���� ����� ���������� ����� = ������� ������� �� ������� "]".
				}
			}	
		}
		
		int mSum0 = 0;
		int mSum1 = 0;
		int mSum2 = 0;
		int mSum3 = 0;		
		
		for (int i = 0; i < matrix.length; i++){ //���������� ����� ����� � �������.
			
			for (int j = 0; j < matrix.length; j++) {
		
				if (i == 0) {
					
					mSum0 = mSum0 + matrix[i][j];
				}
				
				if (i == 1) {
					
					mSum1 = mSum1 + matrix[i][j];
				}
				
				if (i == 2) {
					
					mSum2 = mSum2 + matrix[i][j];
				}
				
				if (i == 3) {
					
					mSum3 = mSum3 + matrix[i][j];
				}	
			}
		}
		
		System.out.println("����� ��������� 0-� ������ = " + mSum0);
		System.out.println("����� ��������� 1-� ������ = " + mSum1);
		System.out.println("����� ��������� 2-� ������ = " + mSum2);
		System.out.println("����� ��������� 3-� ������ = " + mSum3);
		
		
		if (mSum0 > mSum1) {
			mSum1 = mSum0;
			System.out.println("0-� ������ � ����� ������� ������ ���������");
		} else
		if (mSum1 > mSum2) {
			mSum2 = mSum1;
			System.out.println("1-� ������ � ����� ������� ������ ���������");
		} else
		if (mSum2 > mSum3) {
			mSum3 = mSum2;
			System.out.println("2-� ������ � ����� ������� ������ ���������");
		} else

		if (mSum3 > mSum0) {
			mSum0 = mSum3;
			System.out.println("3-� ������ � ����� ������� ������ ���������");
		}
	}	
}

