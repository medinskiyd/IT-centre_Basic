package Основы.lesson9.Task1_DrawFigure;

public interface FigureInterface {

	// Интерфейс фигура и все методы, которые есть в каждой последующей фигуре.

	Point getPoint();
	
	void setPoint(Point point);

	double getSquare();

	void setSquare(double square);

	double getPerimetr();

	void setPerimetr(double perimetr);
	
	void show();
	
	void perimetr();

	void square();
}
