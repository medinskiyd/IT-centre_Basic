package ������.lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class Task4_HellRaseFunctions {

	/* ������ �����.
	 * ���� ������, ��� �� �������, 7 ��.
	 * ������� � ���� �� ����� ����� ����� ������� � �������� ��� ������� �� �������.
	 */
	
	/* ������ ���������� ����� (������� ������).
	 * ������� 6 �������, ������� ���������� �������.
	 * ������� ����� ��������� ���� �������� �������.
	 * ���������� � ���� �������� ���� ������� �� 7-�� �������, � �������� ���������� �� ������ ���������.
	 * ���������� � ���� ���������� ������� � ������� �����.
	 * (����� ��� ����������� ��������� ��������� ��������� � ������� ����).
	 */
	
	public static void main (String[] args) {
		
		System.out.println("������� ���������� �����: ");
		
		Scanner scanSteps = new Scanner(System.in);
		int step = scanSteps.nextInt(); //����������� �����.
		 
		int vinner [] = new int [7];
		
		int ranner1Rastoyanie = ranner1(step); //��������� ������� ������ 1 �����.
		int ranner2Rastoyanie = ranner2(step); //��������� ������� ������ 2 �����.
		int ranner3Rastoyanie = ranner3(step); //��������� ������� ������ 3 �����.
		int ranner4Rastoyanie = ranner4(step); //��������� ������� ������ 4 �����.
		int ranner5Rastoyanie = ranner5(step); //��������� ������� ������ 5 �����.
		int ranner6Rastoyanie = ranner6(step); //��������� ������� ������ 6 �����.
		int ranner7Rastoyanie = ranner7(step); //��������� ������� ������ 7 �����.
		vinner = vinner(ranner1Rastoyanie, ranner2Rastoyanie, ranner3Rastoyanie, ranner4Rastoyanie, ranner5Rastoyanie, ranner6Rastoyanie, ranner7Rastoyanie);
		
		for (int i = 0; i < 7; i++) {
			
			System.out.println(vinner[i]);
		}
	}
	
	public static int ranner1 (int steps) { //������ ��������� ��� 1 ������ y = x.
		
		int rastoyznie1 = 0;
		
		rastoyznie1 = steps;
		
		return rastoyznie1;
	}
	
	public static int ranner2 (int steps) { //������ ��������� ��� 2 ������ y = x!.
		
		int rastoyznie2 = 1;
		
		for(int i = 1; i <= steps; i++) {
			
			rastoyznie2 = rastoyznie2 * i; // n! = (n-1)!n  Example: 5! = 1*2*3*4*5.
			
		}
		
		return rastoyznie2;
	}
	
	public static int ranner3 (int steps) { //������ ��������� ��� 3 ������ y = ln x.
		
		int rastoyznie3 = 0;
		
		rastoyznie3 = (int)(Math.log(steps));
		
		return rastoyznie3;
	}

	public static int ranner4 (int steps) { //������ ��������� ��� 4 ������ y = x*x.
		
		int rastoyznie4 = 0;
		
		rastoyznie4 = steps*steps;
		
		return rastoyznie4;
	}

	public static int ranner5 (int steps) { //������ ��������� ��� 5 ������ y = x*x*x.
		
		int rastoyznie5 = 0;
		
		rastoyznie5 = steps*steps*steps;
		
		return rastoyznie5;
	}

	public static int ranner6 (int steps) { //������ ��������� ��� 6 ������ y = pow(3, x).
		
		int rastoyznie6 = 0;
		
		rastoyznie6 = (int)(Math.pow(3, steps));
		
		return rastoyznie6;
	}

	public static int ranner7 (int steps) { //������ ��������� ��� 7 ������ y = sqrt(x).
		
		int rastoyznie7 = 0;
		
		rastoyznie7 = (int)(Math.sqrt(steps));
		
		return rastoyznie7;
	}

	//������ ����������.
	public static int[] vinner (int ranner1Rastoyanie1, int ranner2Rastoyanie2, int ranner3Rastoyanie3, int ranner4Rastoyanie4, int ranner5Rastoyanie5, int ranner6Rastoyanie6,  int ranner7Rastoyanie7) { 
		
		int vinner = 0;
		
		int [] vector = new int [7];
		vector [0] = ranner1Rastoyanie1;
		vector [1] = ranner2Rastoyanie2;
		vector [2] = ranner3Rastoyanie3;
		vector [3] = ranner4Rastoyanie4;
		vector [4] = ranner5Rastoyanie5;
		vector [5] = ranner6Rastoyanie6;
		vector [6] = ranner7Rastoyanie7;
		
		int c = 0;
		int v = 0;
		for (int i=0;i < vector.length-1;i++)
			for (int j=0; j < vector.length-1; j++) {
				if (vector[i] > vector[i+1]) { //��������������� �������� ���������� �� �����������
					v = vector[i];
					vector[i] = vector[i+1];
					vector[i+1] = v;
					c=c+1;
				}
			}
		System.out.println(Arrays.toString(vector));
		return vector;
	}

} // ��������
