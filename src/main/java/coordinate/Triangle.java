package coordinate;

public class Triangle extends Figure implements Calculator, FigureCreator {
    private Coordinate point1;
    private Coordinate point2;
    private Coordinate point3;

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

    @Override
    public Figure create(Coordinates coordinates) {
        point1 = coordinates.getPoint(0);
        point2 = coordinates.getPoint(1);
        point3 = coordinates.getPoint(2);
        return this;
    }

    @Override
    public Boolean isCreate(Coordinates coordinates) {
        return coordinates.equalsSize(3);
    }

}
