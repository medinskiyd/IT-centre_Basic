package Основы.lesson15.Task1.Task2;

public class Main {

	public static void main(String[] args) {
		
		MyThread myThread1 = new MyThread("Первый поток");
		MyThread myThread2 = new MyThread("Второй поток");
		MyThread myThread3 = new MyThread("Третий поток");

		// Запускаем метод start(), для того что бы запустился метод run().
		myThread1.start();
		myThread2.start();
		myThread3.start();
		
		Thread myThread = new Thread(new MyRun());
		myThread.start();
		
		
	}

}
