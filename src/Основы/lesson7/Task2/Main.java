package ������.lesson7.Task2;

public class Main {
	
	/* ������� 3 ������ ��������� ����� Car.
	 * ������� ��� ������. ������� ���� �������. ������������ ���� �������.
	 * ��������� ������� 2 ������ �� ������, ������ ��������� �������������� "������ �� ��������, ��������".
	 * 
	 */
	
	public static void main(String[] args) {

		//������� 3 ������.
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();

		//������ 3 ������.
		car1.start();
		car2.start();
		car3.start();
		
		// ������ ����� �������.
		car1.setColor("red");
		car2.setColor("blue");
		car3.setColor("green");
		
		//������ 3 ������.
		car1.run();
		car2.run();
		car3.run();
		
		// ���������� 3 ������.
		car1.stop();
		car2.stop();
		car3.stop();
		
		System.out.println();
		
		//������ 2 ������ �������. ��� ������ ��������� ��� �������.
		car1.run();
		car2.run();
		
	}

}
