package coordinate;

public class Rectangle extends Figure implements Calculator, FigureCreator {
    private Coordinate point1;
    private Coordinate point2;
    private Coordinate point3;
    private Coordinate point4;

    @Override
    public double calculate() {
        double width = point1.calculateDistance(point2);
        double height = point2.calculateDistance(point3);

        return (int)(width * height);
    }

    @Override
    public Figure create(Coordinates coordinates) {
        point1 = coordinates.getPoint(0);
        point2 = coordinates.getPoint(1);
        point3 = coordinates.getPoint(2);
        point4 = coordinates.getPoint(3);
        return this;
    }

    @Override
    public Boolean isCreate(Coordinates coordinates) {
        return coordinates.equalsSize(4);
    }
}
