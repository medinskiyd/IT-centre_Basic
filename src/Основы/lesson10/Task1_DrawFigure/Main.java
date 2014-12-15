package Основы.lesson10.Task1_DrawFigure;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		
		
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("Рисуем квадрат:");
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Введите значение x:");
		int xSquare = scan.nextInt();	
		
		System.out.print("Введите значение y:");
		int ySquare = scan.nextInt();

		// Координаты забрасываются в конструктор базовго класса.
		Square sqr = new Square(xSquare, ySquare);
		
		System.out.print("Введите размер квадрата:");
		double size = scan.nextInt();
		sqr.setA(size);
		
		sqr.show();
		System.out.println();
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		System.out.println("Рисуем прямоугольник:");
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		System.out.print("Введите значение x:");
		int xRectangle = scan.nextInt();		
		
		System.out.print("Введите значение y:");
		int yRectangle = scan.nextInt();		
				
		Rectangle rectangleKoordinat = new Rectangle (xRectangle, yRectangle);
		
//		System.out.print("Введите точку какой хотите рисовать:");
//		String rectanglePoint = scan.nextLine();	
//		char rectanglePointChar = rectanglePoint.charAt();
//		Point point = new Point ();
//		point.setPoint(rectanglePointChar);
//		
		System.out.print("Введите 1 сторону прямоугольника:");
		double sizeAR = scan.nextInt();
		rectangleKoordinat.setA(sizeAR);
		
		System.out.print("Введите 2 сторону прямоугольника:");
		double sizeBR = scan.nextInt();
		rectangleKoordinat.setB(sizeBR);	
		
		rectangleKoordinat.show();	
		System.out.println();
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("Рисуем треугольник:");
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		System.out.print("Введите значение x:");
		int xTriangle = scan.nextInt();		

		System.out.print("Введите значение y:");
		int yTriangle = scan.nextInt();
		
		Triangle triangle = new Triangle (xTriangle, yTriangle);
		
		System.out.print("Введите высоту равностороннего треугольника:");
		double height = scan.nextInt();
		triangle.setH(height);
		
		System.out.print("Введите основу равностороннего треугольника:");
		double sizeCTriangle = scan.nextInt();
		triangle.setC(sizeCTriangle);		
		
		triangle.show();	
		System.out.println();
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("Рисуем круг:");
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		System.out.print("Введите значение x:");
		int xCircle = scan.nextInt();		

		System.out.print("Введите значение y:");
		int yCircle = scan.nextInt();
		
		Circle circle = new Circle (xCircle, yCircle);
		
		System.out.print("Введите радиус круга:");
		double radius = scan.nextInt();		
		circle.setRadius(radius);
		 
		circle.show();
		
		scan.close();

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("Полиморфизм:");
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		ArrayList <Figure> list = new ArrayList <Figure> ();
		list.add(sqr);
		list.add(rectangleKoordinat);
		list.add(triangle);
		list.add(circle);
	
		sqr.square();
		rectangleKoordinat.square();
		triangle.square();
		circle.square();
	

	}
}
