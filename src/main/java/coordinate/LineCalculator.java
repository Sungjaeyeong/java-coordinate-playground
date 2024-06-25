package coordinate;

import java.util.List;

public class LineCalculator implements Calculator {
    private final Coordinate point1;
    private final Coordinate point2;

    public LineCalculator(Coordinates coordinates) {
        point1 = coordinates.getPoint(0);
        point2 = coordinates.getPoint(1);
    }

    @Override
    public double calculate() {
        return point1.calculateDistance(point2);
    }
}
