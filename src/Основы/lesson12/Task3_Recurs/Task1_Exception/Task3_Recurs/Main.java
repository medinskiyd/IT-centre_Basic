package ������.lesson12.Task3_Recurs.Task1_Exception.Task3_Recurs;

public class Main {

	public static void main(String[] args) {

		Test t = new Test();
		
		// ������� � ������� �������� �� ������� �� 1 �� 7.
		t.repeat(1,8);
		System.out.println();
		
		// ������� � ������� �������� �� ������� �� 7 �� 1.
		t.repeatReverse(1,8);
		System.out.println();
		
		// ������� � ������� �������� �� ������� �� 1 �� 7 � �� 7 �� 1.
		t.repeatReverseReverse(1,13);
		System.out.println();
		
		// ������� � ������� �������� ���������.
		System.out.println(t.factorRec(5));
		
		// ������� � ������� �������� ��������� ����� ��������.
		System.out.println(t.fib(10));
		
	}

}
