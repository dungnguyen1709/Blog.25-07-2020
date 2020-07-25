package fizz_buzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void fizzBuzz3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.fizzBuzz(3);
        assertEquals(fizzBuzz.FIZZ,result);
    }

    @Test
    void fizzBuzz5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.fizzBuzz(5);
        assertEquals(fizzBuzz.BUZZ  ,result);
    }

    @Test
    void fizzBuzz15() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.fizzBuzz(15);
        assertEquals(fizzBuzz.FIZZ_BUZZ,result);
    }

    @Test
    void fizzBuzz22(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.fizzBuzz(22);
        assertEquals(fizzBuzz.STRING,result);
    }


}