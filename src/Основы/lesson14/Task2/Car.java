package Основы.lesson14.Task2;

public class Car implements Comparable <Car>{
	
	private String name;
	private String model;
	private int year;
	
	
	public String getName() {
		return name;
	}
	
	public Car(String name, String model, int year) {
		super();
		this.name = name;
		this.model = model;
		this.year = year;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override // переопределили compareTo на сравнение по убыванию (самый большой год на первом месте).
	public int compareTo(Car arg0) { 

		if (this.year > arg0.year) {
			return -1;
		} 
		if (this.year == arg0.year) {
			return 0;
		} 
		if (this.year < arg0.year) {
			return 1;
		} 
		
		return 0;
	}
	
	
}
