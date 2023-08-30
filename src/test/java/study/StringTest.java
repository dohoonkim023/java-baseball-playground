package study;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split1_1() {
        String[] actual = "1,2".split(",");
        assertThat(actual).contains("1", "2");
    }

    @Test
    void split1_2() {
        String[] actual = "1".split(",");
        assertThat(actual).containsExactly("1");
    }

    @Test
    void split2_2() {
        String actual = "(1,2)".substring(1, "(1,2)".length() -1);
        assertThat(actual).contains("1,2");
    }

    @Test
    void chatAt() {
        assertThatThrownBy(() -> {
            "a,b,c".charAt(10);
        }).isInstanceOf(StringIndexOutOfBoundsException.class)
                .hasMessage("String index out of range: 10");
//        char actual = "a,b,c".charAt(10);

    }
}
