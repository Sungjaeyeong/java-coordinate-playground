package rentcompany;

public class K5 extends Car {
    private static final int EFFICIENCY = 13;

    public K5(int distance) {
        this.distance = distance;
        this.efficiency = EFFICIENCY;
        this.name = "one.K5";
    }

    @Override
    String getName() {
        return this.name;
    }
}
