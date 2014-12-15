package Основы.lesson9_Figure_Right;

public class Figure {
	 private Point point;

	    public Figure(Point point) {
	        this.point = point;
	    }

	    public double perimetr() {
	        return 0;
	    }

	    public double square() {
	        return 0;
	    }

	    public void print() {
	        System.out.println("x=" + point.getxPos() + ", y=" + point.getyPos());
	    }

	    public Point getPoint() {
	        return point;
	    }

	    public void setPoint(Point point) {
	        this.point = point;
	    }
}
