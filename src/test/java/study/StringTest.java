package study;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

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

//    @Test
//    void split2_2() {
//        String actual = "(1,2)".substring(1, "(1,2)".length() -1);
//        as
//    }
}
