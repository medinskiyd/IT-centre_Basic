package Основы.lesson10.Task1_DrawFigure;

public class Figure {

	private Point point;
	
	private int xPos;
	private int yPos;
	
	private double square;
	private double perimetr;
	
	//Конструктор базового класса, сюда мы забрасываем из конструкторов дочерних классов значения координат.
	public Figure (int xPos, int yPos) {
		this.xPos = xPos;
		this.yPos = yPos;
	}
	
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
	}
	//Розсчитываем периметр фигуры.
	public void perimetr (){
	}
	//Розсчитываем площадь фигуры.
	public void square (){
	}
	
}
