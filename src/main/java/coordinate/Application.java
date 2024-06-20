package coordinate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Application {
    public static void main(String[] args) {
        System.out.println("좌표를 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        List<Coordinate> coordinates = parseCoordinates(input);
        if (coordinates.size() == 2) {
            LineCalculator lineCalculator = new LineCalculator();
            double calculateDistance = lineCalculator.calculate(coordinates);
            System.out.println("두 점 사이의 거리는 " + calculateDistance);
        }
        if (coordinates.size() == 4) {
            RectangleCalculator rectangleCalculator = new RectangleCalculator();
            int calculateDistance = (int) rectangleCalculator.calculate(coordinates);
            System.out.println("사각형 넓이는 " + calculateDistance);
        }
    }

    public static List<Coordinate> parseCoordinates(String input) {
        List<Coordinate> coordinates = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\((\\d+),(\\d+)\\)");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            int x = Integer.parseInt(matcher.group(1));
            int y = Integer.parseInt(matcher.group(2));
            coordinates.add(new Coordinate(x, y));
        }

        return coordinates;
    }
}
