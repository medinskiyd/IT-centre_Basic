package Основы.lesson10.Task1_DrawFigure;

public class Circle extends Figure {
	
	//Конструктор для координат.
	public Circle(int xPos, int yPos) {
		super(xPos, yPos);
	}
	
	private double radius;

	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	// Метод выводит труегольник.
	@Override
	public void show() {		
		System.out.println("Имеем круг радиусом " + radius);
		perimetr();
		square();
	}
	// Метод высчитывает периметр треугольника.
	@Override
	public void perimetr (){
		setPerimetr(2*Math.PI*radius);
		System.out.println(" Периметр круга  = " + getPerimetr());
	}
	// Метод высчитывает площадь треугольника.
	@Override
	public void square (){
		setSquare(Math.PI*radius*Math.PI*radius);
		System.out.println(" Площадь круга = " + getSquare());
	}
}
