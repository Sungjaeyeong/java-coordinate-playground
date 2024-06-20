package coordinate;

public class Coordinate {
    int x;
    int y;

    public Coordinate(int x, int y) {
        if (x > 24 || y > 24)
            throw new IllegalArgumentException("24까지 입력");
        this.x = x;
        this.y = y;
    }

    public double calculateDistance(Coordinate coordinate) {
        return Math.sqrt(Math.pow(coordinate.x - this.x, 2) + Math.pow(coordinate.y - this.y, 2));
    }
}
