public class Sonata extends Car {
    private static final int EFFICIENCY = 10;

    public Sonata(int distance) {
        this.distance = distance;
        this.efficiency = EFFICIENCY;
        this.name = "Sonata";
    }

    @Override
    String getName() {
        return this.name;
    }
}
