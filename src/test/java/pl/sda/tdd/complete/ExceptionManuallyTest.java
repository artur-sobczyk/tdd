package pl.sda.tdd.complete;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ExceptionManuallyTest {
    @Test
    public void testException() {
        try {
            throw new IllegalStateException("my message", new UnsupportedOperationException());

        } catch (Exception e) {
            assertTrue(e instanceof IllegalStateException);
            assertTrue(e.getMessage().contains("my"));
            assertTrue(e.getCause() instanceof UnsupportedOperationException);
        }
    }
}
