package tim_gia_tri_tuyet_doi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNumberCalculatorTest {

    @Test
    void findAbsolute() {
        AbsoluteNumberCalculator absoluteNumberCalculator = new AbsoluteNumberCalculator();
        int result = absoluteNumberCalculator.findAbsolute(-1);
        assertEquals(1,result);
    }
    @Test
    void findAbsolute1 () {
        AbsoluteNumberCalculator absoluteNumberCalculator = new AbsoluteNumberCalculator();
        int result = absoluteNumberCalculator.findAbsolute(1);
        assertEquals(1,result);
    }
    @Test
    void findAbsolute2() {
        AbsoluteNumberCalculator absoluteNumberCalculator = new AbsoluteNumberCalculator();
        int result = absoluteNumberCalculator.findAbsolute(0);
        assertEquals(0,result);
    }
}