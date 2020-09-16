package by.jrr.ruslan;

import org.junit.Test;

import static org.junit.Assert.*;

public class NewNumberServiceTest {

    @Test
    public void rangeSumTest() {
        NewNumberService numberService = new NewNumberService();
        int expected = 9;
        int actuale = numberService.rangeSum(2,4);
        assertEquals(expected,actuale);
    }
    @Test
    public void rangeEvenCountTest() {
        NewNumberService numberService = new NewNumberService();
        int expected = 9;
        int actuale = numberService.rangeEvenCount(4,2);
        assertEquals(expected,actuale);
    }
    @Test
    public void rangeSumWithEqualNumbersTest() {
        NewNumberService numberService = new NewNumberService();
        int expected = 0;
        int actuale = numberService.rangeSum(4,4);
        assertEquals(expected,actuale);
    }
    @Test
    public void rangeEvenCountWithEqualNumbersTest() {
        NewNumberService numberService = new NewNumberService();
        int expected = 0;
        int actuale = numberService.rangeEvenCount(4,4);
        assertEquals(expected,actuale);
    }
}
