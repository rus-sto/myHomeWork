package by.jrr.ruslan.mathoperation;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class OperationExecutor {
    Logger logger = LoggerFactory.getLogger(OperationExecutor.class);
    void execute(MathOperation[] operations, double a, double b){
        for (MathOperation operation: operations){
            logger.info("{} : {}",operation.getClass(),operation.compute(a,b));
        }
    }
}

