package by.jrr.ruslan;

import org.junit.Test;

import static org.junit.Assert.*;

public class NewNumberServiceTest {

    @Test
    public void rangeSumRightOrder() {
        NewNumberService numberService = new NewNumberService();
        int expected = 9;
        int actuale = numberService.rangeSum(2,4);
        assertEquals(expected,actuale);
    }
    @Test
    public void rangeSumWrongOrder() {
        NewNumberService numberService = new NewNumberService();
        int expected = 9;
        int actuale = numberService.rangeSum(4,2);
        assertEquals(expected,actuale);
    }
    @Test
    public void rangeSumWithEqualNumbers() {
        NewNumberService numberService = new NewNumberService();
        int expected = 0;
        int actuale = numberService.rangeSum(4,4);
        assertEquals(expected,actuale);
    }
}
