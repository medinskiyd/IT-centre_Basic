package ������.lesson3;

//���������� 2-� ������ ������ 5 * 5 ���������� ����������.

public class MatrixEx {

	public static void main(String[] args) {
		
		//int matrix [][] = new int [5][5]; //��������� ������ 5 * 5 ���������� ������.
		int matrix [][] = {
				{1,2,3,4,5},
				{1,2,3,4,5},
				{1,2,3,4,5},
				{1,2,3,4,5},
				{1,2,3,4,5}
		}; // ������� ������ 5 * 5 � ���������� ����������.
		
		for (int i = 0; i < matrix.length; i++) {
			
			System.out.print("["); //������� �������� ���������� ����� ������.
			
			for (int j = 0; j < matrix.length; j++){
				
				System.out.print(matrix[i][j]); //������� ������ �������.
				
				if (j < matrix.length-1) { //������� ��� ���� ���-�� ������ ������� � ����� ������ ������.
				System.out.print(",");
				}
			}
	 		System.out.println("]"); //������� ������ ���������� ����� ������.
		}
	}
}
