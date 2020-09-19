package by.jrr.ruslan.mathoperation;

public class App {
    public static void main(String[] args) {
        OperationExecutor operationExecutor = new OperationExecutor();
        MathOperation []mathOperation = {new AdditionOperation(), new SubtractionOperation(),
                new MultiplicationOperation(), new DivisionOperation()};
        operationExecutor.execute(mathOperation,5, 5);
    }

}
