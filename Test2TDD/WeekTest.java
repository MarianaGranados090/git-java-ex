import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WeekTest {
    @Test
    public void mondayShouldBeAWeekday(){
        WeekClass wk = new WeekClass();
        boolean isWeekday = wk.isWeekDay("monday");
        assertTrue(isWeekday);
    }
    @Test
    public void tuesdayShouldBeAWeekday(){
        WeekClass wk = new WeekClass();
        boolean isWeekday = wk.isWeekDay("tuesday");
        assertTrue(isWeekday);
    }
    @Test
    public void saturdayShouldnotBeAWeekday(){
        WeekClass wk = new WeekClass();
        boolean isWeekday = wk.isWeekDay("saturday");
        assertFalse(isWeekday);
    }
    @Test
    public void emptyStringShouldThrowException(){
        WeekClass wk = new WeekClass();
        assertThrows(IllegalArgumentException.class, () -> {
            wk.isWeekDay("");
        });
    }
}
