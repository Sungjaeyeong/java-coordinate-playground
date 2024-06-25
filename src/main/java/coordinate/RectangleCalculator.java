package coordinate;

import java.util.List;

public class RectangleCalculator implements Calculator {
    private final Coordinate point1;
    private final Coordinate point2;
    private final Coordinate point3;
    private final Coordinate point4;

    public RectangleCalculator(Coordinates coordinates) {
        point1 = coordinates.getPoint(0);
        point2 = coordinates.getPoint(1);
        point3 = coordinates.getPoint(2);
        point4 = coordinates.getPoint(3);
    }

    @Override
    public double calculate() {
        double width = point1.calculateDistance(point2);
        double height = point2.calculateDistance(point3);

        return (int)(width * height);
    }
}
