package coordinate;

import java.util.List;

public class LineCalculator implements Calculator {
    private final Coordinate point1;
    private final Coordinate point2;

    public LineCalculator(List<Coordinate> coordinates) {
        point1 = coordinates.get(0);
        point2 = coordinates.get(1);
    }

    @Override
    public double calculate() {
        return Math.sqrt(Math.pow(point1.getX() - point2.getX(), 2)
                + Math.pow(point1.getY() - point2.getY(), 2));
    }
}
