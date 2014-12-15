package ������.lesson9.Task1_DrawFigure;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("������ �����:");
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.print("������� �������� x:");
		int xPoint = scan.nextInt();		

		System.out.print("������� �������� y:");
		int yPoint = scan.nextInt();

		Point p = new Point();
		p.setxPos(xPoint);
		p.setyPos(yPoint);

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("������ �������:");
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		System.out.print("������� �������� x:");
		int xSquare = scan.nextInt();	
		
		System.out.print("������� �������� y:");
		int ySquare = scan.nextInt();

		// ���������� ������������� � ����������� ������� ������.
		Point pS = new Point();
		pS.setxPos(xSquare);
		pS.setyPos(ySquare);
		Square sqr = new Square(pS);
		
		System.out.print("������� ������ ��������:");
		double size = scan.nextInt();
		sqr.setA(size);
		
		sqr.show();
		System.out.println();
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		System.out.println("������ �������������:");
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		System.out.print("������� �������� x:");
		int xRectangle = scan.nextInt();		
		
		System.out.print("������� �������� y:");
		int yRectangle = scan.nextInt();		
		
		Point pR = new Point();
		pR.setxPos(xRectangle);
		pR.setyPos(yRectangle);
		
		Rectangle rectangleKoordinat = new Rectangle (pR);
	
		System.out.print("������� 1 ������� ��������������:");
		double sizeAR = scan.nextInt();
		rectangleKoordinat.setA(sizeAR);
		
		System.out.print("������� 2 ������� ��������������:");
		double sizeBR = scan.nextInt();
		rectangleKoordinat.setB(sizeBR);	
		
		rectangleKoordinat.show();	
		System.out.println();
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("������ �����������:");
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		System.out.print("������� �������� x:");
		int xTriangle = scan.nextInt();		

		System.out.print("������� �������� y:");
		int yTriangle = scan.nextInt();
		
		Point pT = new Point();
		pT.setxPos(xTriangle);
		pT.setyPos(yTriangle);
		
		Triangle triangle = new Triangle (pT);
		
		System.out.print("������� ������ ��������������� ������������:");
		double height = scan.nextInt();
		triangle.setH(height);
		
		System.out.print("������� ������ ��������������� ������������:");
		double sizeCTriangle = scan.nextInt();
		triangle.setC(sizeCTriangle);		
		
		triangle.show();	
		System.out.println();
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("������ ����:");
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		System.out.print("������� �������� x:");
		int xCircle = scan.nextInt();		

		System.out.print("������� �������� y:");
		int yCircle = scan.nextInt();
		
		Point pC = new Point();
		pC.setxPos(xCircle);
		pC.setyPos(yCircle);
		
		Circle circle = new Circle (pC);
		
		System.out.print("������� ������ �����:");
		double radius = scan.nextInt();		
		circle.setRadius(radius);
		 
		circle.show();
		
		scan.close();

	}
}
