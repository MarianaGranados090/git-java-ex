import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SimpleCalculatorTest {
    @Test
    public void TwoPlusTwoShouldEqualFour()
    {
        SimpleCalculator calc = new SimpleCalculator();
        int res = calc.add(2,2);
        //assertEquals(4, res);
        //or:
        assertTrue(res == 4);
    }
    @Test
    public void threePlusSevenShouldEqualTen()
    {
        SimpleCalculator calc1 = new SimpleCalculator();
        assertEquals(10, calc1.add(7,3));
    }

}
