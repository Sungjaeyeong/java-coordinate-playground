package coordinate;

public class TriangleCalculator implements Calculator {
    private final Coordinate point1;
    private final Coordinate point2;
    private final Coordinate point3;

    public TriangleCalculator(Coordinates coordinates) {
        this.point1 = coordinates.getPoint(0);
        this.point2 = coordinates.getPoint(1);
        this.point3 = coordinates.getPoint(2);
    }

    @Override
    public double calculate() {
        double side1 = point1.calculateDistance(point2);
        double side2 = point1.calculateDistance(point3);
        double side3 = point2.calculateDistance(point3);
        double semiPerimeter = (side1 + side2 + side3) / 2;
        return Math.sqrt(semiPerimeter *
                (semiPerimeter - side1) *
                (semiPerimeter - side2) *
                (semiPerimeter - side3));
    }
}
