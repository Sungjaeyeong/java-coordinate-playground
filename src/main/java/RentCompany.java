import java.util.ArrayList;
import java.util.List;

public class RentCompany {
    private static final String NEWLINE = System.getProperty("line.separator");

    private final List<Car> cars = new ArrayList<>();

    public static RentCompany create() {
        return new RentCompany();
    }

    public void addCar(Car car) {
        this.cars.add(car);
    }

    public String generateReport() {
        String result = "";
        for (Car car : cars) {
            result += car.getName() + " : " + car.getNeedFuel() + "리터" + NEWLINE;
        }
        return result;
    }
}
