package coordinate;

public class Coordinate {
    private final int MAX = 24;

    private final int x;
    private final int y;

    public Coordinate(int x, int y) {
        if (x > MAX || y > MAX) throw new IllegalArgumentException("24까지 입력");
        this.x = x;
        this.y = y;
    }

    public double calculateDistance(Coordinate coordinate) {
        return Math.sqrt(Math.pow(coordinate.x - this.x, 2) + Math.pow(coordinate.y - this.y, 2));
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
