package by.jrr.ruslan.shapes;

public class Triangle extends  AbstractShape{
    public static final String TRIANGLENAME = "Triangle";
    protected   int width;
    protected int length;

    public Triangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String getName() {
        return TRIANGLENAME;
    }

    @Override
    public double getArea() {
        return 0.5*width*length;
    }

}
