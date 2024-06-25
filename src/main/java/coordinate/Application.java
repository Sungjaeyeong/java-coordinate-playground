package coordinate;

import java.util.Scanner;

import static coordinate.Coordinates.createCoordinates;

public class Application {
    public static void main(String[] args) {
        System.out.println("좌표를 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Coordinates coordinates = createCoordinates(input);
        Calculator calculator = CalculatorFactory.getCalculator(coordinates);
        double result = calculator.calculate();
        System.out.println("result = " + result);
    }
}
