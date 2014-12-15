package Основы.lesson9.Task1_DrawFigure;

public class Square extends Rectangle {

	//Конструктор для координат.
	public Square(Point point) {
		super(point);

	}
	//Вывод квадрата.
	@Override
	public void show() {		
		System.out.println("Имеем квадрат со стороной " + getA());
		perimetr();
		square();	
		
		for (int i = 0; i < getA(); i++) {
			
			for (int j = 0; j < getA(); j++){
				
				System.out.print("*");
			}
			System.out.println();
		}
	}
	//Метод высчитывает периметр квадрата.
	@Override
	public void perimetr (){
		setPerimetr(4 * getA());
		System.out.println(" Периметр квадрата = " + getPerimetr());
	}
	//Метод высчитывает площадь квадрата.
	@Override
	public void square (){
		setSquare(getA() * getA());
		System.out.println(" Площадь квадрата = " + getSquare());
	}
	
}
