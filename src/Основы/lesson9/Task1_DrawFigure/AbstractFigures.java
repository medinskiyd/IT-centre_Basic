package Основы.lesson9.Task1_DrawFigure;

abstract class AbstractFigures implements FigureInterface {

	// Абстрактный класс фигура
	
	abstract public void setPoint(Point point);
	
	abstract public double getSquare();

	abstract public void setSquare(double square);

	abstract public double getPerimetr();

	abstract public void setPerimetr(double perimetr);
	
	abstract public void show();

	abstract public void perimetr();

	abstract public void square();
	
}
