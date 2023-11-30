import homework.Calculator.Calculator;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CalculatorTest {
    public static void main(String[] args) {
        assertThat(Calculator.calculateDiscount(100.0, 20.0)).isEqualTo(80.0);
        assertThat(Calculator.calculateDiscount(1.0, 10.0)).isEqualTo(0.9);
        assertThat(Calculator.calculateDiscount(100.0, 0)).isEqualTo(100.0);
        assertThat(Calculator.calculateDiscount(100.0, 100.0)).isEqualTo(0.0);
        assertThatThrownBy(
                () -> Calculator.calculateDiscount(-100, 10))
                .isInstanceOf(ArithmeticException.class);

        assertThatThrownBy(
                () -> Calculator.calculateDiscount(100, -5))
                .isInstanceOf(ArithmeticException.class);

        assertThatThrownBy(
                () -> Calculator.calculateDiscount(100, 101))
                .isInstanceOf(ArithmeticException.class);
    }
}
