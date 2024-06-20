public class Avante extends Car {
    private static final int EFFICIENCY = 15;

    public Avante(int distance) {
        this.distance = distance;
        this.efficiency = EFFICIENCY;
        this.name = "Avante";
    }

    @Override
    String getName() {
        return this.name;
    }
}
