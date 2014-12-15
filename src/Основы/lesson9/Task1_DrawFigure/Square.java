package ������.lesson9.Task1_DrawFigure;

public class Square extends Rectangle {

	//����������� ��� ���������.
	public Square(Point point) {
		super(point);

	}
	//����� ��������.
	@Override
	public void show() {		
		System.out.println("����� ������� �� �������� " + getA());
		perimetr();
		square();	
		
		for (int i = 0; i < getA(); i++) {
			
			for (int j = 0; j < getA(); j++){
				
				System.out.print("*");
			}
			System.out.println();
		}
	}
	//����� ����������� �������� ��������.
	@Override
	public void perimetr (){
		setPerimetr(4 * getA());
		System.out.println(" �������� �������� = " + getPerimetr());
	}
	//����� ����������� ������� ��������.
	@Override
	public void square (){
		setSquare(getA() * getA());
		System.out.println(" ������� �������� = " + getSquare());
	}
	
}
