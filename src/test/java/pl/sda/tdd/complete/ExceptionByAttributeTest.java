package pl.sda.tdd.complete;

import org.junit.Test;

public class ExceptionByAttributeTest {

    @Test(expected = IllegalStateException.class)
    public void testException() {
        throw new IllegalStateException("message");
    }
}
