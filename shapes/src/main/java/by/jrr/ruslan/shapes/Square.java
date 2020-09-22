package by.jrr.ruslan.shapes;

public class Square extends AbstractShape{
    public static final String SQUARENAME = "Square";
    private   int sideLength;

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    public int getSideLength() {
        return sideLength;
    }

    @Override
    public String getName() {
        return SQUARENAME;
    }

    @Override
    public double getArea() {
        return sideLength*sideLength;
    }
}
