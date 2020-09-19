package by.jrr.ruslan.mathoperation;

public class DivisionOperation implements MathOperation {
    @Override
    public double compute(double a, double b){
        if (b==0){
            throw new NullPointerException();
        }
        return a / b;
    }
}

