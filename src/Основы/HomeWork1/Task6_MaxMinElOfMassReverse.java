package ������.HomeWork1;

public class Task6_MaxMinElOfMassReverse {
	
	/* ������� ������. ��������� ������ ���������� ����������, �������� ������� �������� ����������� 
	 * � ����������� �������� � �������. 
	 */

	public static void main(String[] args) {
		
		double vector[] = new double [5];
        double max = 0;
        double min = 5;
        int maxPosition = 0;
        int minPosition = 0;

        System.out.println("����� ������ �����: ");
		
		for (int i = 0; i < vector.length; i++) {
			vector[i] = Math.random() * 5;
			System.out.println(vector[i]);
		}

		for (int i = 0; i < vector.length; i++) {
			if (max < vector [i]) {
				max = vector [i]; maxPosition = i;
			}
			if (min > vector [i]) {
				min = vector [i]; minPosition = i;
			}
		}
		
		System.out.println("");				
		System.out.println("������������ ����� � �������: " + max);
		System.out.println("����������� ����� � �������: " + min);
		System.out.println("����� max ����� � �������: " + maxPosition);
		System.out.println("����� min ����� � �������: " + minPosition);
		System.out.println("");
		System.out.println("���������� ������: ");
		
		vector[minPosition] = max;
		vector[maxPosition] = min;
		
		for (int i = 0; i < vector.length; i++) {
			System.out.println(vector[i]);
		}
	}
}
