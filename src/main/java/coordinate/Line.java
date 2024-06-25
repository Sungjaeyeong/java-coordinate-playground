package coordinate;

public class Line extends Figure implements Calculator, FigureCreator {
    private Coordinate point1;
    private Coordinate point2;

    @Override
    public double calculate() {
        return point1.calculateDistance(point2);
    }

    @Override
    public Figure create(Coordinates coordinates) {
        point1 = coordinates.getPoint(0);
        point2 = coordinates.getPoint(1);
        return this;
    }

    @Override
    public Boolean isCreate(Coordinates coordinates) {
        return coordinates.equalsSize(2);
    }
}
