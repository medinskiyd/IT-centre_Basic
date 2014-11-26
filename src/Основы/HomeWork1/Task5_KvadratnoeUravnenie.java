package ������.HomeWork1;

import java.util.Scanner;

public class Task5_KvadratnoeUravnenie {
	
	/* ������� ����������� ���������. ��� �������� ������������� ����� �.
	 * ������������� 3 ��������.
	 */

	public static void main(String[] args) {

        int firstKoef = 0;
        int secondKoef = 0;
        int thirdKoef = 0;
        int diskriminant = 0;
        Scanner scan = new Scanner(System.in);

		System.out.println("������� 3 �������� ������������� ����������� ��������� (������ �������� �� ������ ���� ����� 0):");

		firstKoef = scan.nextInt(); // ���� ������� ������������ �.
		secondKoef = scan.nextInt(); // ���� ������� ������������ b.
		thirdKoef = scan.nextInt(); // ���� �������� ������������ c.

		scan.close();

		if (firstKoef == 0) {
			System.out.println("������ �����."); // �������� �� ������, ���� � = 0.
			return;
		}
		
		diskriminant = secondKoef * secondKoef - 4 * firstKoef * thirdKoef; // ��������� ������������ D = b*b-4ac.
		
		if (diskriminant > 0) {
			double x1 = ((-1 * secondKoef) + Math.sqrt(diskriminant)) / (2 * firstKoef);
			double x2 = ((-1 * secondKoef) - Math.sqrt(diskriminant)) / (2 * firstKoef);
			System.out.println("����� ����������� ��������� x1 = " + x1 + "; x2 = " + x2 + ".");
		} else if (diskriminant < 0) {
			System.out.println("������ �� ��������� �������������� ����� ���.");
		} else if (diskriminant == 0) {
			int x = (-1 * secondKoef) / (2 * firstKoef);
			System.out.println("����� ����������� ��������� x1 = x2 = " + x + ".");
		}
	}
}
