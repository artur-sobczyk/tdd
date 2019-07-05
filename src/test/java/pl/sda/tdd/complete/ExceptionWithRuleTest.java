package pl.sda.tdd.complete;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.core.Is.is;

public class ExceptionWithRuleTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void testException() {
        Throwable cause = new UnsupportedOperationException();
        expectedException.expect(IllegalStateException.class);
        expectedException.expectMessage("my");
        expectedException.expectCause(is(cause));

        throw new IllegalStateException("my message", cause);
    }
}
