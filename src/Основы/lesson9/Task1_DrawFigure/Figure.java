package ������.lesson9.Task1_DrawFigure;

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
	
	//����������� �������� ������.	
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
		System.out.println("x= " + point.getxPos() + "y= " + point.getyPos());
	}
	//������������ �������� ������.
	public void perimetr (){
	}
	//������������ ������� ������.
	public void square (){
	}

	
}
