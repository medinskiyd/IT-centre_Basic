package Основы.lesson9_Figure_Right;

public class Square extends Figure {
    private int size;

    public Square(int size, Point point) {
        super(point);
        this.size = size;
    }

    @Override
    public double square() {
        return size * size;
    }

    @Override
    public double perimetr() {
        return 4 * size;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("size=" + size);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
