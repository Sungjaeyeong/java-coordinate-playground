package coordinate;

import java.util.List;

public class CalculatorFactory {
    public static Calculator getCalculator(List<Coordinate> coordinates) {
        if (coordinates.size() == 2) {
            return new LineCalculator(coordinates);
        }
        if (coordinates.size() == 4) {
            return new RectangleCalculator(coordinates);
        }
        return null;
    }
}
