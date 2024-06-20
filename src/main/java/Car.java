public abstract class Car {
    int distance;
    int efficiency;
    String name;

    abstract String getName();

    public int getNeedFuel() {
        return distance / efficiency;
    }
}
