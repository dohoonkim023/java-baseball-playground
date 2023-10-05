package Calculator.Domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class CalculatorTest {

    @Test
    @DisplayName("계산 테스트")
    void calculate() {
        //given
        Calculator calculator = new Calculator(new Expression("1 + 1"));

        //when
        int actual = calculator.calculate();

        //then
        assertThat(actual).isEqualTo(2);
    }

}
