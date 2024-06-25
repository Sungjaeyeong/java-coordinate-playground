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
        return null;
    }
}
