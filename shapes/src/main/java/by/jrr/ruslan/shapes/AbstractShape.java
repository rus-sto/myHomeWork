package by.jrr.ruslan.shapes;

public abstract class AbstractShape implements Shape{
     String name;
    double area;

    @Override
    public String getName() {
        return name;
    }
    @Override
    public double getArea() {
        return area;
    }
}
