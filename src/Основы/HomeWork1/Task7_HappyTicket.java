package ������.HomeWork1;

import java.util.Scanner;

public class Task7_HappyTicket {
	
	/* �������� ��������� ��� ����������� ����������� ������ (�� 6 ����, ����� ����� 3-� ������ ���� ����� 
	 * ����� ������ ����).
	 */

	public static void main(String[] args) {
		
		int vector[] = null;
        int sumFirstPart = 0;
        int sumSecondPart = 0;
        String tiketNumber = null;
        int halfOfVector = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("������� � ������ (6 ����): ");
        tiketNumber = scan.nextLine();
        vector = new int[tiketNumber.length()];

        for(int i = 0; i < tiketNumber.length(); i++){
            vector[i] = tiketNumber.charAt(i) - 48;
        }

        halfOfVector = vector.length / 2;

        // ������������ ������ �����.
        for(int i = 0; i < halfOfVector; i++){
            sumFirstPart = sumFirstPart + vector[i];
        }
        // ������������ ������ �����.
        for (int i = halfOfVector; i < vector.length; i++) {
            sumSecondPart = sumSecondPart + vector[i];
        }
        // ������� 2-� ������.
        if (sumFirstPart == sumSecondPart) {
			System.out.println("�����������, � ��� ���������� ����� �" + tiketNumber);
		} else {
			System.out.println("���, ��� ����� �" + tiketNumber + " �� ����������.");
		}
        scan.close();
	}
}
