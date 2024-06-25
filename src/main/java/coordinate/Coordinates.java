package coordinate;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Coordinates {
    private List<Coordinate> coordinates;

    public Coordinates(List<Coordinate> coordinates) {
        this.coordinates = coordinates;
    }

    public Coordinate getPoint(int index) {
        return coordinates.get(index);
    }

    public boolean isLine() {
        return coordinates.size() == 2;
    }

    public boolean isRectangle() {
        return coordinates.size() == 4;
    }

    public static Coordinates createCoordinates(String input) {
        List<Coordinate> coordinates = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\((\\d+),(\\d+)\\)");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            int x = Integer.parseInt(matcher.group(1));
            int y = Integer.parseInt(matcher.group(2));
            coordinates.add(new Coordinate(x, y));
        }

        return new Coordinates(coordinates);
    }
}
