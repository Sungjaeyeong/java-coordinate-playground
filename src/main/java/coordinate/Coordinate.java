package coordinate;

import java.util.List;

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

    public int calculateArea(List<Coordinate> coordinates) {
        Coordinate point1 = coordinates.get(0);
        Coordinate point2 = coordinates.get(1);
        Coordinate point3 = coordinates.get(2);
        Coordinate point4 = coordinates.get(3);

        // 가로 길이와 세로 길이를 구합니다.
        double width = point1.calculateDistance(point2);
        double height = point2.calculateDistance(point3);

        // 넓이를 구합니다.
        return (int)(width * height);
    }
}
