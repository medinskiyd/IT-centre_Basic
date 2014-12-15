package ������.lesson10.Task1_DrawFigure;

public class Rectangle extends Figure {

	//����������� ��� ���������.
	public Rectangle(int xPos, int yPos) {
		super(xPos, yPos);
		
	}
	
	public Rectangle(Point point) {
		super(point);
	}
	
	
	private double a;
	private double b;
	int c,d;

	public double getA() {
		return a;
	}
	public void setA(double sizeAR) {
		this.a = sizeAR;
	}
	public double getB() {
		return b;
	}
	public void setB(double sizeBR) {
		this.b = sizeBR;
	}

	
	//������� �������������.
	@Override
	public void show() {		
		System.out.println("����� ������������� �� ��������� " + a + " � " + b );
		perimetr();
		square();

		for (int i = 0; i < getA(); i++) {
			
			for (int j = 0; j < getB(); j++){
				
				System.out.print("*");
			}
			System.out.println();
		}
	}
	//����� ����������� �������� ��������������.
	@Override
	public void perimetr (){
		setPerimetr(2 * (a + b));
		System.out.println(" �������� ��������������  = " + getPerimetr());
	}
	//����� ����������� ������� ��������������.
	@Override
	public void square (){
		setSquare(a * b);
		System.out.println(" ������� �������������� = " + getSquare());
	}

}
