package ������.lesson4;

// ������ �� ������.

import java.util.Arrays;

public class Task0_MetodsAndString {

	public static void main(String[] args) {
		int val = 100;
		changeVar(val);
		System.out.println(val);
		
		int vector[] = {1,3,5};
		changeVector(vector);
		System.out.println(Arrays.toString(vector)); //Arrays.toString(vector) - ����� ��������������� ������ � ������
	}
	public static void changeVector(final int [] vector) {
		vector[0]++;
	}
	
	public static void changeVar(final int val) { //��� val - ��� ���� val �� main
		
		//val++;
	}
}
