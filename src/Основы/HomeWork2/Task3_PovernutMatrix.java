package ������.HomeWork2;

import java.util.Scanner;

/*��������� �������(���������� ������). ������� ����������. 
������������ ������ ���� ������� 90.
 */

public class Task3_PovernutMatrix {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("������� ���� 90 ��� 180 ��� 270:");
		int angle = scan.nextInt();

		int [][] matrix = new int [3][3];
		
		System.out.println("����� ��������� ������ " + 3 + " �� " + 3 + ":");
		
		int b = 0;
		for (int i = 0; i < matrix.length; i++){ 
			System.out.print("[ ");
			
			for (int j = 0; j < matrix.length; j++) {
				b = b+1;
				matrix [i][j] = b;
				System.out.print(matrix[i][j] + " "); 
				
				if (j < matrix.length-1) {
					System.out.print(", "); //���� ����� ���������� ����� ������ ������� ������� �� ������� ", ".
				
				} else if (j == matrix.length-1) {
					System.out.println("]"); //���� ����� ���������� ����� = ������� ������� �� ������� "]".
				}
			}	
		}
		System.out.println();
		
		int [][] matrix90 = new int [3][3];
		if (angle == 90){
			System.out.println("������ ���������� �� 90 ��������" + 3 + " �� " + 3 + ":");
		for (int i = 0; i < matrix90.length; i++){ 			
			System.out.print("[ ");
			
			for (int j = 0; j < matrix90.length; j++) {
				matrix90 [i][j] = matrix [matrix.length-j-1][i];
				System.out.print(matrix90[i][j] + " "); 
				
				if (j < matrix90.length-1) {
					System.out.print(", "); //���� ����� ���������� ����� ������ ������� ������� �� ������� ", ".
				
				} else if (j == matrix90.length-1) {
					System.out.println("]"); //���� ����� ���������� ����� = ������� ������� �� ������� "]".
				}
			}	
		}
		}
		
		int [][] matrix180 = new int [3][3];
		if (angle == 180){
			System.out.println("������ ���������� �� 180 ��������" + 3 + " �� " + 3 + ":");
			
			for (int i = 0; i < matrix90.length; i++){
				
				for (int j = 0; j < matrix90.length; j++) {
					matrix90 [i][j] = matrix [matrix.length-j-1][i];
				}
			}
		for (int i = 0; i < matrix180.length; i++){ 
			
			System.out.print("[ ");
			
			for (int j = 0; j < matrix180.length; j++) {
				
				matrix180 [i][j] = matrix90 [matrix.length-j-1][i];
				System.out.print(matrix180[i][j] + " "); 
				
				if (j < matrix180.length-1) {
					System.out.print(", "); //���� ����� ���������� ����� ������ ������� ������� �� ������� ", ".
				
				} else if (j == matrix180.length-1) {
					System.out.println("]"); //���� ����� ���������� ����� = ������� ������� �� ������� "]".
				}
			}	
		}
		}
		
		int [][] matrix270 = new int [3][3];
		if (angle == 270){
			System.out.println("������ ���������� �� 270 ��������" + 3 + " �� " + 3 + ":");
			
			for (int i = 0; i < matrix90.length; i++){ 
				
				for (int j = 0; j < matrix90.length; j++) {
					matrix90 [i][j] = matrix [matrix.length-j-1][i];
				}
			}
		for (int i = 0; i < matrix180.length; i++){ 
			
			for (int j = 0; j < matrix180.length; j++) {
				
				matrix180 [i][j] = matrix90 [matrix.length-j-1][i];
		
			}	
		}
		for (int i = 0; i < matrix270.length; i++){ 
			
			System.out.print("[ ");
			
			for (int j = 0; j < matrix270.length; j++) {
				
				matrix270 [i][j] = matrix180 [matrix.length-j-1][i];
				System.out.print(matrix270[i][j] + " "); 
				
				if (j < matrix270.length-1) {
					System.out.print(", "); //���� ����� ���������� ����� ������ ������� ������� �� ������� ", ".
				
				} else if (j == matrix270.length-1) {
					System.out.println("]"); //���� ����� ���������� ����� = ������� ������� �� ������� "]".
				}
			}	
		}
		}
		scan.close();
	}
}