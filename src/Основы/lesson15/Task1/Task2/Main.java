package ������.lesson15.Task1.Task2;

public class Main {

	public static void main(String[] args) {
		
		MyThread myThread1 = new MyThread("������ �����");
		MyThread myThread2 = new MyThread("������ �����");
		MyThread myThread3 = new MyThread("������ �����");

		// ��������� ����� start(), ��� ���� ��� �� ���������� ����� run().
		myThread1.start();
		myThread2.start();
		myThread3.start();
		
		Thread myThread = new Thread(new MyRun());
		myThread.start();
		
		
	}

}
