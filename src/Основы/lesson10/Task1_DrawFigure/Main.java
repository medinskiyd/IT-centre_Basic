package ������.lesson10.Task1_DrawFigure;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		
		
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("������ �������:");
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		Scanner scan = new Scanner(System.in);
		
		System.out.print("������� �������� x:");
		int xSquare = scan.nextInt();	
		
		System.out.print("������� �������� y:");
		int ySquare = scan.nextInt();

		// ���������� ������������� � ����������� ������� ������.
		Square sqr = new Square(xSquare, ySquare);
		
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
				
		Rectangle rectangleKoordinat = new Rectangle (xRectangle, yRectangle);
		
//		System.out.print("������� ����� ����� ������ ��������:");
//		String rectanglePoint = scan.nextLine();	
//		char rectanglePointChar = rectanglePoint.charAt();
//		Point point = new Point ();
//		point.setPoint(rectanglePointChar);
//		
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
		
		Triangle triangle = new Triangle (xTriangle, yTriangle);
		
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
		
		Circle circle = new Circle (xCircle, yCircle);
		
		System.out.print("������� ������ �����:");
		double radius = scan.nextInt();		
		circle.setRadius(radius);
		 
		circle.show();
		
		scan.close();

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("�����������:");
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
