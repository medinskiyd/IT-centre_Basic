package ������.HomeWork1;

import java.util.Scanner;

public class Task2_FirstPartOfVector {
	
	/* ������������ ������ ������ � ���������� (������� ������ �������, ����� ��������).
	 * ������� �� ����� ������ �������� �������.
	 */

	public static void main(String[] args) {

        int sizeMass = 0;
        int vector[] = null;
        int elemOfVector = 0;
        int halfOfVector = 0;
		Scanner scan = new Scanner(System.in);
				
	    System.out.println("������� ������ �������: ");
		
		sizeMass = scan.nextInt();
		vector = new int[sizeMass];
		
		System.out.println("������� ������ � ������ �������� " + sizeMass + " ���������:" );
		
		for (int i = 0; i < vector.length; i++) {
			elemOfVector = scan.nextInt();
			vector[i] = elemOfVector;
		}

        System.out.println("����� ������ �������� ��������� ���� �������:");
		
		halfOfVector = vector.length / 2;
		
		for (int i = 0; i < halfOfVector; i++) {
			System.out.println(vector[i]);
		}
		scan.close();
	}
}
