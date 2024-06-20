package coordinate;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RectangleCalculatorTest {
    @Test
    void 사각형_면적_계산() {
        Coordinate coordinate1 = new Coordinate(10, 10);
        Coordinate coordinate2 = new Coordinate(22, 10);
        Coordinate coordinate3 = new Coordinate(22, 18);
        Coordinate coordinate4 = new Coordinate(10, 18);
        RectangleCalculator rectangleCalculator = new RectangleCalculator();
        assertThat(rectangleCalculator.calculate(Arrays.asList(coordinate1, coordinate2, coordinate3 ,coordinate4)))
                .isEqualTo(96);
    }
}