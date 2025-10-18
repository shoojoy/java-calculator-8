package calculator;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;

class StringCalculatorEdgeTest {
    private final StringCalculator c = new StringCalculator();

    //테스트 케이스 작성
    @Test
    void empty_returns_zero() {
        assertThat(c.sum("")).isEqualTo(0);
    }

    @Test
    void default_delis() {
        assertThat(c.sum("1,2:3")).isEqualTo(6);
    }

    @Test
    void custom_denim() {
        assertThat(c.sum("//;\n1;2;3")).isEqualTo(6);
    }

    @Test
    void double_comma_iae() {
        assertThatThrownBy(() -> c.sum("1,,2")).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void negative_iae() {
        assertThatThrownBy(() -> c.sum("1,-2")).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void non_numeric_iae() {
        assertThatThrownBy(() -> c.sum("1,a")).isInstanceOf(IllegalArgumentException.class);
    }
}