package Основы.lesson7.Task1;

public class Car {
	
	String color;
	int year;
	double price;
	int benzin;
	boolean isStarted;
	
	public void start(){
		isStarted = true;
		
	}
	public void run(){
		if(isStarted != true) {
			System.out.println("Зажигание выключено. Включите зажигание.");

		return;
		}
		System.out.println("I am a car with " + color + " color.");
		System.out.println("I run realy fast!");
	}
	public void stop(){
		if(isStarted = false){
		}
	}
}
