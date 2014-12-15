package ������.lesson10.Task1_DrawFigure;

public class Circle extends Figure {
	
	//����������� ��� ���������.
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
	
	// ����� ������� �����������.
	@Override
	public void show() {		
		System.out.println("����� ���� �������� " + radius);
		perimetr();
		square();
	}
	// ����� ����������� �������� ������������.
	@Override
	public void perimetr (){
		setPerimetr(2*Math.PI*radius);
		System.out.println(" �������� �����  = " + getPerimetr());
	}
	// ����� ����������� ������� ������������.
	@Override
	public void square (){
		setSquare(Math.PI*radius*Math.PI*radius);
		System.out.println(" ������� ����� = " + getSquare());
	}
}
