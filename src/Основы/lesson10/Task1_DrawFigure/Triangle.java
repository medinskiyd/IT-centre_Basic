package Основы.lesson10.Task1_DrawFigure;

public class Triangle extends Figure {

	//Конструктор для координат.
	public Triangle(int xPos, int yPos) {
		super(xPos, yPos);
	}
	
	private double h; //Высота.
	private double c; //Основа.
	private double a; //Сторона.

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
	
	// Метод выводит труегольник.
	@Override
	public void show() {		
		System.out.println("Имеем треугольник с основой " + c +" и высотой " + h );
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
	// Метод высчитывает периметр треугольника.
	@Override
	public void perimetr (){
		a = Math.sqrt(h*h + (c/2)*(c/2));
		setPerimetr(a + a + c);
		System.out.println(" Периметр треугольника  = " + getPerimetr());
	}
	// Метод высчитывает площадь треугольника.
	@Override
	public void square (){
		setSquare(c * h / 2);
		System.out.println(" Площадь треугольника = " + getSquare());
	}
}
