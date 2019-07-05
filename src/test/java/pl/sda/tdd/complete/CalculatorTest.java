package pl.sda.tdd.complete;

import org.junit.Test;
import pl.sda.tdd.Calculator;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void addOperation_returnsSumOfArguments() {
        // given
        int i1 = 1;
        int i2 = 2;

        // when
        int result = calculator.add(1, 2);

        // then
        assertEquals("1+2=3", 3, result);
    }
}
