package coordinate;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;

class CoordinateTest {
    @Test
    void X좌표_최대_24까지만_입력할_수_있다() {
        assertThatThrownBy(() -> new Coordinate(25, 24))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void Y좌표_최대_24까지만_입력할_수_있다() {
        assertThatThrownBy(() -> new Coordinate(24, 25))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 두_좌표_사이_거리_계산() {
        Coordinate coordinate1 = new Coordinate(10, 10);
        Coordinate coordinate2 = new Coordinate(14, 15);
        assertThat(coordinate1.calculateDistance(coordinate2))
                .isEqualTo(6.403124, offset(0.00009));
    }

    @Test
    void 네_좌표_넓이_계산() {
        Coordinate coordinate1 = new Coordinate(10, 10);
        Coordinate coordinate2 = new Coordinate(22, 10);
        Coordinate coordinate3 = new Coordinate(22, 18);
        Coordinate coordinate4 = new Coordinate(10, 18);
        assertThat(coordinate1.calculateArea(Arrays.asList(coordinate1, coordinate2, coordinate3 ,coordinate4)))
                .isEqualTo(96);
    }
}