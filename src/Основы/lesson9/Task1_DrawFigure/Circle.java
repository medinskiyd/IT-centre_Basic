package Основы.lesson9.Task1_DrawFigure;

public class Circle extends Figure {
	
	//Конструктор для координат.
	public Circle(Point point) {
		super(point);
	}
	
	private double radius;

	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	// Метод выводит .
	@Override
	public void show() {		
		System.out.println("Имеем круг радиусом " + radius);
		perimetr();
		square();
	}
	// Метод высчитывает периметр круга.
	@Override
	public void perimetr (){
		setPerimetr(2*Math.PI*radius);
		System.out.println(" Периметр круга  = " + getPerimetr());
	}
	// Метод высчитывает площадь круга.
	@Override
	public void square (){
		setSquare(Math.PI*radius*Math.PI*radius);
		System.out.println(" Площадь круга = " + getSquare());
	}
}
