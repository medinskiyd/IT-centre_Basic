package ������.lesson7.Task1;

public class Main {

	public static void main(String[] args) {

		//������� 3 ������.
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		
		// �������������� ������ ������.
		car1.color = "Red";
		car1.year = 1990;
		car1.price = 200000;
		car1.benzin = 10;
		
		// �������������� ������ ������.
		car2.color = "White";
		car2.year = 1991;
		car2.price = 200100;
		car2.benzin = 20;
		
		// �������������� ������� ������.
		car3.color = "Black";
		car3.year = 1992;
		car3.price = 200200;
		car3.benzin = 30;
		
		//������ 3 ������.
		String start = "������ ���������.";
		car1.start();
		car2.start();
		car3.start();
		
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
