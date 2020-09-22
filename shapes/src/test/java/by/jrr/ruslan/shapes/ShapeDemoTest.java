package by.jrr.ruslan.shapes;

import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.*;

public class ShapeDemoTest {
    Logger logger = LoggerFactory.getLogger(ShapeDemo.class);
    @Test
            public void shapeDemoTest(){
    Shape[] shapes= new Shape[3];

        shapes[0] = new Circle(10);
        shapes[1] =new Square(10);
                shapes[2] =new Triangle(10,20);

  for (Shape shape: shapes){
        logger.info("This shape name is {} ",shape.getName());
        logger.info("This shape area is {} ",shape.getArea());
    }
    assertEquals(314.159,shapes[0].getArea(),0.001);
        assertEquals(100,shapes[1].getArea(),0.001);
        assertEquals(100,shapes[2].getArea(),0.001);

}


}