package Основы.lesson7.Task2;


public class Car {
	
	/* Создать класс Машина (Car), задать:
	 * - цвет;
	 * - год выпуска;
	 * - цена;
	 * - количество бензина.
	 * 
	 * создать методы:
	 * - включение зажигания (start ());
	 * - поехать run();
	 * - остановиться stop();
	 */
	
	
	private String color;
	private int year;
	private double price;
	private int benzin;
	private boolean isStarted;
	
	public Car() {
		color = "white";
		year = 2000;
		price = 1000000;
		benzin = 20;
	}
	
	public Car(String color, double price) {
		this.color = color;
		this.price = price;
	}
	
	public void setColor(String color){
		this.color = color;
	}
	public void setYear(int year){
		this.year = year;
	}
	public void setPrice(double price){
		this.price = price;
	}
	public void setBenzin(int benzin){
		this.benzin = benzin;
	}
	
	public String getColor(){
		return this.color;
	}
	public int getYear(){
		return this.year;
	}
	public double getPrice(){
		return this.price;
	}
	public int getBenzin(){
		return this.benzin;
	}
	
	public void start(){
		isStarted = true;
		
	}
	public void run(){
		if(isStarted != true) {
			System.out.println("Я машина " + color + " цвета.");
			System.out.println("Зажигание выключено. Включите зажигание.");

		return;
		}
		System.out.println("Я машина " + color + " цвета.");
		System.out.println("Я еду очень быстро!");
	}
	public void stop(){
		isStarted = false;

	}
}
