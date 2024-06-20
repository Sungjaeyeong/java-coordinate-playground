package coordinate;

import java.util.List;

public class LineCalculator implements Calculator {
    @Override
    public double calculate(List<Coordinate> coordinates) {
        return Math.sqrt(Math.pow(coordinates.get(0).x - coordinates.get(1).x, 2)
                + Math.pow(coordinates.get(0).y - coordinates.get(1).y, 2));
    }
}
