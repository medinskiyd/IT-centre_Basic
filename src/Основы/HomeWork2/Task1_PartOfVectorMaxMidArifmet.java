package ������.HomeWork2;

import java.util.Scanner;

/* ������� � ������� �������� ��� �������� ����������� ������� � ������� 
������� �������������� ������������.
(��������� ��cc�������� ����� �������� ����.�����.,
������ ��� �������� ������� ������� �����. ����. ����� ���� ���������� ����������).
(������� �����. ���������� � ��������� ������).
 */

public class Task1_PartOfVectorMaxMidArifmet {

	public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int razmer = 0;
        int vector[] = null;

		System.out.println("������� ������ �������: ");
        razmer = scan.nextInt();
        vector = new int [razmer];

		System.out.println("������� " + razmer + " ��������� �������: ");
		for (int i = 0; i < razmer; i++) {
			vector[i] = scan.nextInt();
		}
		
		for (int i = 0; i < razmer; i++) {
			System.out.print(vector[i] + " ");
		}
		
		System.out.println(" - ��� ������.");
		
		int numFirstElOfPartVector = 0;
		int numLastElOfPartVector = razmer/2;
		
		int sredArifFirst = summOfElPartOfVector(vector, numFirstElOfPartVector, numLastElOfPartVector);
		System.out.println("������� �������������� 1-� ����� ���c��� = " + sredArifFirst + ".");
		
		int numFirstElOfSecondPartVector = razmer/2;
		int numLastElOfSecondPartVector = razmer;
		
		int sredArifSecond = summOfElPartOfVector(vector, numFirstElOfSecondPartVector, numLastElOfSecondPartVector);
		System.out.println("������� �������������� 2-� ����� ������� = " + sredArifSecond + ".");

		if (sredArifFirst > sredArifSecond) {
			System.out.println("������� �������������� 1-� �������� ������� ������ ����. ����. 2-� ��������, "
					+ "������ ��������� �������� 2-� �������� �������");
			for (int i = numFirstElOfPartVector; i < numLastElOfPartVector; i++) {
				System.out.print(vector [i] + " "); 
			}
		} else if (sredArifFirst < sredArifSecond) {
			System.out.println("������� �������������� 2-� �������� ������� ������ ����. ����. 1-� ��������, "
					+ "������ ��������� �������� 2-� �������� �������:");
		
					for (int i = numFirstElOfSecondPartVector; i < numLastElOfSecondPartVector; i++) {
						System.out.print(vector [i] + " "); 
					}
				} else if (sredArifFirst == sredArifSecond) {
						System.out.println("������� �������������� 2-� �������� ������� = ����. ����. 1-� ��������, "
						+ "������ ������ �� �������.");
						}
		scan.close();
	}			
		//����� ���������� �����. �����. ����� ��������� �������.
		public static int summOfElPartOfVector (int vector1[], int numFirstElOfPartVector1, int numLastElOfPartVector1){
			
			int sum = 0;
			int sredArif1 = 0;

			for (int i = numFirstElOfPartVector1; i < numLastElOfPartVector1; i++) {
				sum = vector1[i] + sum;
			}
			sredArif1 = sum / (numLastElOfPartVector1 - numFirstElOfPartVector1); //������� ��������������.
					
			return sredArif1;
		}
}

