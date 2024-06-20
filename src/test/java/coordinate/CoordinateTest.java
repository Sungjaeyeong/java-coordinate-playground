package coordinate;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

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
}