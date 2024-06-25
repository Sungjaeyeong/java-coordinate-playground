package coordinate;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

class TriangleTest {
    @Test
    void 삼각형_면적_계산() {
        Coordinate coordinate1 = new Coordinate(10, 10);
        Coordinate coordinate2 = new Coordinate(14, 15);
        Coordinate coordinate3 = new Coordinate(20, 8);
        Triangle triangle = new Triangle(new Coordinates(Arrays.asList(coordinate1, coordinate2, coordinate3)));
        assertThat(triangle.calculate()).isEqualTo(29, offset(0.0009));
    }
}