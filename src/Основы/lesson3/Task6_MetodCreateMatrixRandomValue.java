package ������.lesson3;

/* �������� ����� ����������� ��������� ������ ���������� ����������. 
 * � ����� ���������� 3 ��������: ������, 1-� ������� ��������� ����. ����, 
 * 2-� ������� ��������� ��������� ��������. ��� ����� �����.
 */

import java.util.Scanner;

public class Task6_MetodCreateMatrixRandomValue {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("������� ������� ��������� ������� ��������� �����: ");
		
		int firstGran = scan.nextInt();
		int secondGran = scan.nextInt();
		int vector = (int)Math.random();
		
		int a[][] = randomMassive(vector, firstGran, secondGran);
		
		}
	
	public static int[][] randomMassive(int vector1, int firstGran, int secondGran) {
		
		int vector [][] = new int [5][5];
		
		for (int i = 0; i < vector.length; i++){
						
			System.out.print("[ ");
			
			for (int j = 0; j < vector.length; j++) {
			
				int size = Math.abs(secondGran - firstGran);
				int leftSide = Math.min(secondGran, firstGran);
				vector [i][j] = leftSide + (int)(Math.random() * size);
			
			System.out.print(vector [i][j]);
			
			
				if (j < vector.length-1) {
					System.out.print(", "); //���� ����� ���������� ����� ������ ������� ����� �� ������� ",".
				
				} else if (j == vector.length-1) {
					System.out.print(" "); //���� ����� ���������� ����� = ������� ����� �� ������� " ".
				}
			}
			System.out.println(" ]");
			
		}	
		
		return vector;
	}
}

