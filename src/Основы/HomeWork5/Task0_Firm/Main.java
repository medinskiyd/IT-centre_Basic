package ������.HomeWork5.Task0_Firm;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException{
		
	Scanner scan = new Scanner(System.in);
		
	// ������� ���� �����.
	Firm firm = new Firm();
	firm.createEmployees();
	
	System.out.println("������� ������ ����� �����:");
	firm.setAccount(scan.nextDouble());
		
	System.out.println("������� ����� �������� ������� ��� ����� ���������:");
	System.out.println("0. ������� ���� ����������� �� �����.");
	System.out.println("1. ������� ���� ����������� �� ����� ��������������� �� ��.");
	System.out.println("2. ������� ���� �����������, ��������������� �� �������.");
	System.out.println("3. ��������� ������� �� ����� 10000.");
	System.out.println("4. ������ ���� �������� (���� �� �������, ������ ������� ����).");
	System.out.println("5. ����������� ���� ������� (����� 6 ���, �� 2 ��� � �����).");
	System.out.println("6. ������� ��������� �� 10% ���� ����������� �� ������ > 5 ���.");
	System.out.println("7. ������ ����������� ����� 20% (���� ������� 8 ����� - ��������, ���� 23 ������� ��������).");
	System.out.println("8. ������� ���� �� ������ < 6 ��� � �������� ����� ��������, �������� ������������ ��������� ����� ����� ��������� �� ������.");
	System.out.println();

	int numAction = scan.nextInt();
		
	// ������� ���� ����������� �� �����.
	if (numAction == 0) {
		firm.outAllEmployees();	
	}
	
	// ������� ���� �����������, ��������������� �� ��.
	if (numAction == 1) {
		firm.outAllWorkersSortSalary();
	}
	
	// ������� ���� �����������, ��������������� �� �������.
	if (numAction == 2) {	
		firm.outAllWorkersSortSurname();
	}
	
	// ��������� ������� �� ����� 10000.
	if (numAction == 3) {	
		firm.sellerSell10000();
	}
	
	// ������ ���� �������� (���� �� �������, ������ ������� ����).
	if (numAction == 4) {	
		firm.salaryForEvery();
	}
	
	// ����������� ���� ������� (����� 6 ���, �� 2 ��� � �����).
	if (numAction == 5) {
		firm.countHoliday();	
	}
	
	// ������� ��������� �� 10% ���� ����������� �� ������ > 5 ���.
	if (numAction == 6) {
		firm.raiseSalary5YearsExperience();	
	}
	
	// ������ ����������� ����� 20% (���� ������� 8 ����� - ��������, ���� 23 ������� ��������).
	if (numAction == 7) {
		firm.bonusMarch8February23();
	}
	 
	// ������� ���� �� ������ < 6 ��� � �������� ����� ��������, �������� ������������
	// ��������� ����� ����� ��������� �� ������.
	if (numAction == 8) {
		firm.accordingDismissSelection();	
	}

	// ������ ����������, � �������  � �������� ����������� ������ �������� �������.
	if (numAction == 9) {
		firm.hireEmployee();
	}

	// ������������ ������ ������������ � ����.
	firm.writeFile();
	
		scan.close();
	}
}
