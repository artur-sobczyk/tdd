package pl.sda.tdd.complete;

import org.junit.Test;
import pl.sda.tdd.Tokenizer;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class TokenizerTest {

    private Tokenizer tokenizer = new Tokenizer();

    @Test
    public void tokenizerReturnTokens_forCorrectInput(){

        // given
        String expression = "1.0+2-2";

        // when
        List<String> tokens = tokenizer.toTokens(expression);

        // then
        assertThat(tokens).containsExactly("1.0", "+", "2.0", "-", "2.0");
    }
}
