package pl.sda.tdd.complete;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import pl.sda.tdd.Calculator;
import pl.sda.tdd.Mathematician;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MathematicianTest {

    @Mock
    private Calculator calculator;

    @InjectMocks
    private Mathematician mathematician;

    @Test
    public void addLargeNumbers_returnsSum(){
        // given
        when(calculator.add(101, 102)).thenReturn(203);

        // when
        Integer result = mathematician.addNumbers(101, 102);

        // then
        assertThat(result).isEqualTo(203);
    }
}
