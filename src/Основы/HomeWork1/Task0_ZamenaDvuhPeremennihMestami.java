package ������.HomeWork1;

public class Task0_ZamenaDvuhPeremennihMestami {
	
	/* �������� 2 ���������� ������ ����, ������������������� ������ ����������,
	 * �������� �������� ���������� ������� � ������� �� �����.
	 */

	public static void main(String[] args) {
		
		int val1 = 1;
		int val2 = 5;
		int val3 = 0;

		System.out.println("���������� �1 = " + val1 + "; " + "���������� �2 = " + val2);
		System.out.println("����� ���������:");
		
		val3 = val1;
		val1 = val2;
		val2 = val3;
		
		System.out.println("���������� �1 = " + val1 + "; " + "���������� �2 = " + val2);
    }
}
