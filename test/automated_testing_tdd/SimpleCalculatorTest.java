package automated_testing_tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {


    @Test
    void plus() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int result = simpleCalculator.plus(2,17);
        assertEquals(19,result);
    }

    @Test
    void plusMaxValue() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        assertThrows(OutOfRangeException.class, ()->{
            int result = simpleCalculator.plus(Integer.MAX_VALUE,1);
        });
    }


    @Test
    void plusMinValue() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        assertThrows(OutOfRangeException.class, ()->{
            int result = simpleCalculator.plus(Integer.MIN_VALUE,-1);
        });
    }

    @Test
    void minus() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int result = simpleCalculator.minus(17,2);
        assertEquals(15,result);
    }

    @Test
    void minusMaxValue() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        assertThrows(OutOfRangeException.class, ()->{
            int result = simpleCalculator.minus(Integer.MAX_VALUE, 1);
        });
    }

    @Test
    void minusMinValue() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        assertThrows(OutOfRangeException.class, () -> {
            int result = simpleCalculator.minus(Integer.MIN_VALUE, -1);
        });
    }
}