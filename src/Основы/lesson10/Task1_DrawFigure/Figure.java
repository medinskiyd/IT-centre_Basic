package ������.lesson10.Task1_DrawFigure;

public class Figure {

	private Point point;
	
	private int xPos;
	private int yPos;
	
	private double square;
	private double perimetr;
	
	//����������� �������� ������, ���� �� ����������� �� ������������� �������� ������� �������� ���������.
	public Figure (int xPos, int yPos) {
		this.xPos = xPos;
		this.yPos = yPos;
	}
	
	public Figure (Point point) {
		this.point = point;
	}

	//������ �������� �������.
	public double getSquare() {
		return square;
	}
	//������ �������� �������.
	public void setSquare(double square) {
		this.square = square;
	}
	//������ �������� ��������� ������.
	public double getPerimetr() {
		return perimetr;
	}
	// ������ �������� ��������� ������.
	public void setPerimetr(double perimetr) {
		this.perimetr = perimetr;
	}
	//���������� ������.
	public void show() {
	}
	//������������ �������� ������.
	public void perimetr (){
	}
	//������������ ������� ������.
	public void square (){
	}
	
}
