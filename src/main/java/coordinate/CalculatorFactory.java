package coordinate;

import java.util.List;

public class CalculatorFactory {
    public static Calculator getCalculator(Coordinates coordinates) {
        if (coordinates.isLine()) {
            return new LineCalculator(coordinates);
        }
        if (coordinates.isRectangle()) {
            return new RectangleCalculator(coordinates);
        }
        if (coordinates.isTrangle()) {
            return new TriangleCalculator(coordinates);
        }
        throw new IllegalArgumentException("적용할 수 있는 계산기가 없습니다.");
    }
}
