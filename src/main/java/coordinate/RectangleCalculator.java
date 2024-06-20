package coordinate;

import java.util.List;

public class RectangleCalculator implements Calculator {
    @Override
    public double calculate(List<Coordinate> coordinates) {
        Coordinate point1 = coordinates.get(0);
        Coordinate point2 = coordinates.get(1);
        Coordinate point3 = coordinates.get(2);
        Coordinate point4 = coordinates.get(3);

        double width = point1.calculateDistance(point2);
        double height = point2.calculateDistance(point3);

        return (int)(width * height);
    }
}
