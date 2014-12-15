package Основы.lesson15.Task1.Task2;

public class MyThread extends Thread {

	private int id = 0;
	private String name;
	
	public MyThread(String name){
		this.name = name;
	}
	
	// Переопределяем метод run() наследуемого класса Thread.
	@Override
	public void run() {
		
		for(int i = 0; i <1000; i++){
			id = i;
			System.out.println(id+ " " + name);
		}
	}	
}
