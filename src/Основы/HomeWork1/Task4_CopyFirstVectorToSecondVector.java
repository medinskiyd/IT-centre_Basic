package ������.HomeWork1;

public class Task4_CopyFirstVectorToSecondVector {
	
	/* ������ 2 ������� ���������� ������ (����� ��������), ����������� ������ � ������� ������� �� ������.
	 * ������� �� �����.
	 */

	public static void main(String[] args) {
		
		int [] vector1 = new int [4];
        int [] vector2;

        vector1 [0] = 33;
		vector1 [1] = 2;
		vector1 [2] = 3;
		vector1 [3] = 4;
		
		vector2 = vector1; //����������� �������� �� ������� ������� �� ������.
		
	    System.out.println("������ �1 ");
		
		for (int i = 0; i < vector1.length; i++) {
			System.out.println(vector1 [i]);
		}

		System.out.println();
		System.out.println("������ �2 ");
		
		for (int i = 0; i < vector1.length; i++) {
			System.out.println(vector2 [i]);
		}
	}
}
