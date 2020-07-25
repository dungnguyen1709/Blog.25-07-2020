package tinh_ngay_tiep_theo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {
    @Test
    void nextDayCalculator112018(){
        int day = 1;
        int month = 1;
        int year = 2018;

        String excepted = "2-1-2018";
        NextDayCalculator nextDayCalculator = new NextDayCalculator(day,month,year);
        String result = nextDayCalculator.nextDayCalculator();
        assertEquals(excepted,result);
    }

    @Test
    void nextDayCalculator3112018(){
        int day = 31;
        int month = 1;
        int year = 2018;

        String excepted = "1-2-2018";
        NextDayCalculator nextDayCalculator = new NextDayCalculator(day,month,year);
        String result = nextDayCalculator.nextDayCalculator();
        assertEquals(excepted,result);
    }

    @Test
    void nextDayCalculator3042018(){
        int day = 30;
        int month = 4;
        int year = 2018;

        String excepted = "1-5-2018";
        NextDayCalculator nextDayCalculator = new NextDayCalculator(day,month,year);
        String result = nextDayCalculator.nextDayCalculator();
        assertEquals(excepted,result);
    }

    @Test
    void nextDayCalculator2822018(){
        int day = 28;
        int month = 2;
        int year = 2018;

        String excepted = "1-3-2018";
        NextDayCalculator nextDayCalculator = new NextDayCalculator(day,month,year);
        String result = nextDayCalculator.nextDayCalculator();
        assertEquals(excepted,result);
    }

    @Test
    void nextDayCalculator2922020(){
        int day = 29;
        int month = 2;
        int year = 2020;

        String excepted = "1-3-2020";
        NextDayCalculator nextDayCalculator = new NextDayCalculator(day,month,year);
        String result = nextDayCalculator.nextDayCalculator();
        assertEquals(excepted,result);
    }

    @Test
    void nextDayCalculator31122018(){
        int day = 31;
        int month = 12;
        int year = 2018;

        String excepted = "1-1-2019";
        NextDayCalculator nextDayCalculator = new NextDayCalculator(day,month,year);
        String result = nextDayCalculator.nextDayCalculator();
        assertEquals(excepted,result);
    }
}