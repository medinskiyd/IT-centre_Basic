package Основы.lesson9_Figure_Right;

public class Main {

	public static void main(String[] args) {
			
			Square square1 = new Square(10, new Point(4, 1));
	        Square square2 = new Square(10, new Point(2, 4));


	        Figure[] figures = new Figure[4];
	        figures[0] = square1;
	        figures[1] = square2;

	        for (int i = 0; i < figures.length; i++) {
	            figures[i].print();
	            double perim = figures[i].perimetr();
	        }

	        Main main = new Main();
	        main.fix(square1);
	        main.fix(new Figure(new Point(4, 4)));
	    }

	    public void fix(Figure figure) {

	    }
	}