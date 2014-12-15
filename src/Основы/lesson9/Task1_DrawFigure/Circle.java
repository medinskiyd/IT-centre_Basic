package ������.lesson9.Task1_DrawFigure;

public class Circle extends Figure {
	
	//����������� ��� ���������.
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
	
	// ����� ������� .
	@Override
	public void show() {		
		System.out.println("����� ���� �������� " + radius);
		perimetr();
		square();
	}
	// ����� ����������� �������� �����.
	@Override
	public void perimetr (){
		setPerimetr(2*Math.PI*radius);
		System.out.println(" �������� �����  = " + getPerimetr());
	}
	// ����� ����������� ������� �����.
	@Override
	public void square (){
		setSquare(Math.PI*radius*Math.PI*radius);
		System.out.println(" ������� ����� = " + getSquare());
	}
}
