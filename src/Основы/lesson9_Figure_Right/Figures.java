package Основы.lesson9_Figure_Right;

import java.util.ArrayList;

public class Figures {
    private ArrayList<Figure> figures;

    public Figures(final int size) {
        this.figures = new ArrayList<Figure>();
    }

    public void print() {
        for (int i = 0; i < figures.size(); i++) {
            figures.get(i).print();
        }
    }

    public double square() {
        double square = 0;
        for (int i = 0; i < figures.size(); i++) {
            square += figures.get(i).square();
        }
        return square;
    }

    public void fill() {
        for (int i = 0; i < figures.size(); i++) {
            figures.set(i, new Figure(new Point(0,0)));
        }
    }
}