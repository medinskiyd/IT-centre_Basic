package ������.lesson10.Task1_DrawFigure;

public class Triangle extends Figure {

	//����������� ��� ���������.
	public Triangle(int xPos, int yPos) {
		super(xPos, yPos);
	}
	
	private double h; //������.
	private double c; //������.
	private double a; //�������.

	public double getH() {
		return h;
	}
	public void setH(double height) {
		h = height;
	}
	public double getC() {
		return c;
	}
	public void setC(double sizeCTriangle) {
		c = sizeCTriangle;
	}	
	public double getA() {
		return a;
	}
	public void setA(double b) {
		this.a = a;
	}
	
	// ����� ������� �����������.
	@Override
	public void show() {		
		System.out.println("����� ����������� � ������� " + c +" � ������� " + h );
		perimetr();
		square();

		double d = c - h;
		for (int i = 0; i < h; i++) {
			
			for (int j = 0; j < c; j++){
				
				if (j == i + d){
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			d--;
			System.out.println();
		}
			System.out.println();
	}
	// ����� ����������� �������� ������������.
	@Override
	public void perimetr (){
		a = Math.sqrt(h*h + (c/2)*(c/2));
		setPerimetr(a + a + c);
		System.out.println(" �������� ������������  = " + getPerimetr());
	}
	// ����� ����������� ������� ������������.
	@Override
	public void square (){
		setSquare(c * h / 2);
		System.out.println(" ������� ������������ = " + getSquare());
	}
}
