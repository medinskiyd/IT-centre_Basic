package ������.HomeWork2;

/* ����� ������������ � ����������� �������� � ��������� ������� � 
 * �������� �� �������.
 */

public class Task2_ReverseMaxMinInMatrix {

	public static void main(String[] args) {

		System.out.println("����� ��������� ������");
		
		int matrix [][] = new int [4][4]; //������� ��������� ������ 4 �� 4.
		
		int counter = 1;
		
		for (int i = 0; i < 4; i++) {
			
			System.out.print("[ ");
			
			for (int j = 0; j < 4; j++) {
				
				matrix [i][j] = counter++;
				System.out.print(matrix[i][j] + " ");
			
				if (j < matrix.length-1) {
					System.out.print(", "); //���� ����� ���������� ����� ������ ������� ����� �� ������� ",".
				} else if (j == matrix.length-1) {
					System.out.print(""); //���� ����� ���������� ����� = ������� ����� �� ������� " ".
				}
			}
			System.out.println("]");
		}
		
		System.out.println();
		
		int [][] matrixmax = findMaxMin(matrix); //������������ ������� � ���������� ������������ ������ �������.
	
		System.out.println("����� �������: ");
		int [][] matrixZamena = zamena(matrixmax); //����� ������ ������ � ����������� ����������.
	}

	//����� ������������� ����� � ������� � ������������ + ������ �� �������.
	public static int[][] findMaxMin (int [][] matrix1) {
		
		int max1 = 0;
		int n = 0;
		int m = 0;
		
		int min1=10;
		int n1 = 0;
		int m1 = 0;
		
		for (int i = 0; i < 4; i++) {
				
			for (int j = 0; j < 4; j++) {
				
				if (max1 < matrix1[i][j]) {
					
					max1 = matrix1[i][j]; 
					n = i; m = j;
				} 
				
				if (min1 > matrix1[i][j]) {
					
					min1 = matrix1[i][j]; 
					n1 = i; m1 = j;
				} 
			}
		}
		
		matrix1[n][m] = min1;
		matrix1[n1][m1] = max1;
		
		return matrix1;
	}
	
	//����� ������� ����� ���������� ������.
	public static int [][] zamena(int [][] matrix1) { 
	
		for (int i = 0; i < 4; i++) {
			
			System.out.print("[ ");
			
			for (int j = 0; j < 4; j++) {
				
				System.out.print(matrix1[i][j] + " ");
			
				if (j < matrix1.length-1) {
					System.out.print(", "); //���� ����� ���������� ����� ������ ������� ����� �� ������� ",".
				} else if (j == matrix1.length-1) {
					System.out.print(""); //���� ����� ���������� ����� = ������� ����� �� ������� " ".
				}
			}
			System.out.println("]");
		}
		return matrix1;
	}	
}

