package by.jrr.ruslan.mathoperation;

import static org.junit.Assert.*;
import org.junit.Test;

public class OperationExecutorTest {

    @Test
    public void execute() {
        OperationExecutor operationExecutor = new OperationExecutor();
        MathOperation[] mathOperation = {new AdditionOperation(), new SubtractionOperation(),
                new MultiplicationOperation(), new DivisionOperation()};
        operationExecutor.execute(mathOperation,10,5);
    }
}
