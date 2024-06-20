package coordinate;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

class LineCalculatorTest {
    @Test
    void 선_길이_계산() {
        Coordinate coordinate1 = new Coordinate(10, 10);
        Coordinate coordinate2 = new Coordinate(14, 15);
        LineCalculator lineCalculator = new LineCalculator(Arrays.asList(coordinate1, coordinate2));
        assertThat(lineCalculator.calculate())
                .isEqualTo(6.403124, offset(0.00009));
    }
}