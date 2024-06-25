package coordinate;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

class LineTest {
    @Test
    void 선_길이_계산() {
        Coordinate coordinate1 = new Coordinate(10, 10);
        Coordinate coordinate2 = new Coordinate(14, 15);
        Line line = new Line(new Coordinates(Arrays.asList(coordinate1, coordinate2)));
        assertThat(line.calculate())
                .isEqualTo(6.403124, offset(0.00009));
    }
}