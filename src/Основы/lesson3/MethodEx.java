package ������.lesson3;

public class MethodEx {

	public static void main(String[] args) {
		
		int count = 100;
		
		printLine(); // ����� ������ �� �����.
		printLine();
		printLine();
		
		printValue(100); // ����� ������ �� �����.
		printValue(count);
		
		int res = add (2,2); //�������� ���������� � ������ add. 
		System.out.println(res);
	}

	public static void printLine() { //����� ������ �������.
		int count = 100;
		System.out.println("* * *");
	}
	
	public static void printValue (int value){ //����� ����� �����.
		System.out.println(value);
	}
	
	public static int add(int first, int second) { // ����� ���������� 2 ����� � ���������� �����. ���� int.
	
		int sum = first + second;
		return sum;
	}
	
	
	
}
