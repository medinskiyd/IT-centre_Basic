package ������.lesson7.Task2;


public class Car {
	
	/* ������� ����� ������ (Car), ������:
	 * - ����;
	 * - ��� �������;
	 * - ����;
	 * - ���������� �������.
	 * 
	 * ������� ������:
	 * - ��������� ��������� (start ());
	 * - ������� run();
	 * - ������������ stop();
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
			System.out.println("� ������ " + color + " �����.");
			System.out.println("��������� ���������. �������� ���������.");

		return;
		}
		System.out.println("� ������ " + color + " �����.");
		System.out.println("� ��� ����� ������!");
	}
	public void stop(){
		isStarted = false;

	}
}
