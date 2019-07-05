package pl.sda.tdd.complete;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AssertJExaptionTest {

    @Test
    public void testsException() {
        // when
        IllegalAccessException exception = Assertions.catchThrowableOfType(() -> {
            throw new IllegalAccessException("Some text");
        }, IllegalAccessException.class);

        // then
        assertThat(exception).hasMessage("Some text");
    }
}
