package ќсновы.lesson9.Task1_DrawFigure;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("–исуем точку:");
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.print("¬ведите значение x:");
		int xPoint = scan.nextInt();		

		System.out.print("¬ведите значение y:");
		int yPoint = scan.nextInt();

		Point p = new Point();
		p.setxPos(xPoint);
		p.setyPos(yPoint);

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("–исуем квадрат:");
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		System.out.print("¬ведите значение x:");
		int xSquare = scan.nextInt();	
		
		System.out.print("¬ведите значение y:");
		int ySquare = scan.nextInt();

		//  оординаты забрасываютс€ в конструктор базовго класса.
		Point pS = new Point();
		pS.setxPos(xSquare);
		pS.setyPos(ySquare);
		Square sqr = new Square(pS);
		
		System.out.print("¬ведите размер квадрата:");
		double size = scan.nextInt();
		sqr.setA(size);
		
		sqr.show();
		System.out.println();
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		System.out.println("–исуем пр€моугольник:");
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		System.out.print("¬ведите значение x:");
		int xRectangle = scan.nextInt();		
		
		System.out.print("¬ведите значение y:");
		int yRectangle = scan.nextInt();		
		
		Point pR = new Point();
		pR.setxPos(xRectangle);
		pR.setyPos(yRectangle);
		
		Rectangle rectangleKoordinat = new Rectangle (pR);
	
		System.out.print("¬ведите 1 сторону пр€моугольника:");
		double sizeAR = scan.nextInt();
		rectangleKoordinat.setA(sizeAR);
		
		System.out.print("¬ведите 2 сторону пр€моугольника:");
		double sizeBR = scan.nextInt();
		rectangleKoordinat.setB(sizeBR);	
		
		rectangleKoordinat.show();	
		System.out.println();
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("–исуем треугольник:");
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		System.out.print("¬ведите значение x:");
		int xTriangle = scan.nextInt();		

		System.out.print("¬ведите значение y:");
		int yTriangle = scan.nextInt();
		
		Point pT = new Point();
		pT.setxPos(xTriangle);
		pT.setyPos(yTriangle);
		
		Triangle triangle = new Triangle (pT);
		
		System.out.print("¬ведите высоту равностороннего треугольника:");
		double height = scan.nextInt();
		triangle.setH(height);
		
		System.out.print("¬ведите основу равностороннего треугольника:");
		double sizeCTriangle = scan.nextInt();
		triangle.setC(sizeCTriangle);		
		
		triangle.show();	
		System.out.println();
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("–исуем круг:");
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		System.out.print("¬ведите значение x:");
		int xCircle = scan.nextInt();		

		System.out.print("¬ведите значение y:");
		int yCircle = scan.nextInt();
		
		Point pC = new Point();
		pC.setxPos(xCircle);
		pC.setyPos(yCircle);
		
		Circle circle = new Circle (pC);
		
		System.out.print("¬ведите радиус круга:");
		double radius = scan.nextInt();		
		circle.setRadius(radius);
		 
		circle.show();
		
		scan.close();

	}
}
