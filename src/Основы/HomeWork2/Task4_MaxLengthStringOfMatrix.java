package ������.HomeWork2;

import java.util.Arrays;
import java.util.Scanner;

/* ����� ������ � ���������� �������, ������� ����� ������� ����� �������� ���������.
 * 4 na 4.
 */

public class Task4_MaxLengthStringOfMatrix {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������� ������ �������: ");
		
		int size = scan.nextInt();
		
		int [][] matrix = maxtrix(size);
		numMaxSumMatrixString(matrix, size);
		scan.close();
	}

	public static int[][] maxtrix(int size1) { //�������� ��������� �������.
		
		int[][] matrix1 = new int [size1][size1];
		int b = 0;
		
		for (int i = 0; i < matrix1.length; i++){
			
			System.out.print("[ ");
			
			for (int j = 0; j < matrix1.length; j++) {
			b = (int) (Math.random()*(size1+1));
			matrix1 [i][j] = b;
			
			System.out.print(matrix1[i][j]);
			if (j < matrix1.length-1) {
				System.out.print(", "); //���� ����� ���������� ����� ������ ������� ����� �� ������� ",".
			} else if (j == matrix1.length-1) {
				System.out.print(""); //���� ����� ���������� ����� = ������� ����� �� ������� " ".
			}
			
			}
			System.out.println(" ]");
		}
		
		System.out.println();

		return matrix1;
	}
	
	public static void numMaxSumMatrixString (int matrix1 [][], int size1) { // ����� ����� ������� �� ����� ��������� ������.
		
		int counter = -1;
		int summ = 0;
		int summBig = 0;
		int vector[] = new int [size1];
		
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1.length; j++){
				 summ = summ + matrix1[i][j];
			}
			if (summ > summBig) {
				summBig = summ;
                counter++;
			}
			summ = 0;
		}
		System.out.println("������ � ����� ������� ������ ���������(������� � 0): "+ counter);
		System.out.println("����� ��������� � ����� ������� ������: " + summBig);
		
		for (int i = 0; i <size1; i++) {
			vector[i] = matrix1[counter][i];
		}
		System.out.println(Arrays.toString(vector));
	}
}
