package Основы.lesson9.Task1_DrawFigure;

	public class Figure extends AbstractFigures{

	private Point point;
	private double square;
	private double perimetr;
	
	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}	
	
	//Конструктор базового класса.	
	public Figure (Point point) {
		this.point = point;
	}

	//Читаем значение площади.
	public double getSquare() {
		return square;
	}
	//Задаем значение площади.
	public void setSquare(double square) {
		this.square = square;
	}
	//Читаем значение периметра фигуры.
	public double getPerimetr() {
		return perimetr;
	}
	// Задаем значение периметра фигуры.
	public void setPerimetr(double perimetr) {
		this.perimetr = perimetr;
	}
	//Показываем фигуру.
	public void show() {
		System.out.println("x= " + point.getxPos() + "y= " + point.getyPos());
	}
	//Розсчитываем периметр фигуры.
	public void perimetr (){
	}
	//Розсчитываем площадь фигуры.
	public void square (){
	}

	
}
