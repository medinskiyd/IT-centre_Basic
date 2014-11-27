package ������.lesson3;

/* �������� ����� ����������� ��������� ������ ���������� ����������. 
 * � ����� ���������� 3 ��������: ������, 1-� ������� ��������� ����. ����, 
 * 2-� ������� ��������� ��������� ��������. ��� ������� �����.
 */

import java.util.Scanner;

public class Task7_MetodCreateMatrixRandomDoubleValue {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("??????? ??????? ????????? ??????? ????????? ?????: ");

		int firstGran = scan.nextInt();
		int secondGran = scan.nextInt();
		double vector = Math.random();

		System.out.println("????? ??????? ?? ?????? RandomMassive:");
		double a[][] = randomMassive(vector, firstGran, secondGran);

		System.out.println("????? ??????? ?? ?????? main:");

		for (int i = 0; i < a.length; i++) {

			System.out.print("[ ");

			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j]);

				if (j < a.length-1) {
					System.out.print(", "); //???? ????? ?????????? ????? ?????? ??????? ????? ?? ??????? ",".

				} else if (j == a.length-1) {
					System.out.print(""); //???? ?? ??? ?????????? ????? = ??????? ????? ?? ??????? " ".
				}

			}
			System.out.println("]");
		}
	}

	public static double[][] randomMassive(double vector1, int firstGran, int secondGran) {

		double vector [][] = new double [5][5];

		int size = Math.abs(secondGran - firstGran);
		int leftSide = Math.min(secondGran, firstGran);

		for (int i = 0; i < vector.length; i++){

			System.out.print("[ ");

			for (int j = 0; j < vector.length; j++) {

				vector [i][j] = leftSide + Math.random() * size;

			System.out.print(vector [i][j]);

				if (j < vector.length-1) {
					System.out.print(", "); //???? ????? ?????????? ????? ?????? ??????? ????? ?? ??????? ",".

				} else if (j == vector.length-1) {
					System.out.print(""); //???? ?? ??? ?????????? ????? = ??????? ????? ?? ??????? " ".
				}
			}
			System.out.println("]");
		}	
		return vector;
	}
}

