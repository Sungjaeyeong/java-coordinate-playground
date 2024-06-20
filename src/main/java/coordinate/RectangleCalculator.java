package coordinate;

import java.util.List;

public class RectangleCalculator implements Calculator {
    private final Coordinate point1;
    private final Coordinate point2;
    private final Coordinate point3;
    private final Coordinate point4;

    public RectangleCalculator(List<Coordinate> coordinates) {
        point1 = coordinates.get(0);
        point2 = coordinates.get(1);
        point3 = coordinates.get(2);
        point4 = coordinates.get(3);
    }

    @Override
    public double calculate() {
        double width = point1.calculateDistance(point2);
        double height = point2.calculateDistance(point3);

        return (int)(width * height);
    }
}
