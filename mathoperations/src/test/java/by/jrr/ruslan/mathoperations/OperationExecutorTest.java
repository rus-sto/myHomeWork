package by.jrr.ruslan.mathoperations;

import org.junit.Test;

import static org.junit.Assert.*;

public class OperationExecutorTest {

    @Test
    public void execute() {
        OperationExecutor operationExecutor = new OperationExecutor();
        MathOperation[] mathOperation = {new AdditionOperation(), new SubtractionOperation(),
                new MultiplicationOperation(), new DivisionOperation()};
             operationExecutor.execute(mathOperation,10,5);
    }
}