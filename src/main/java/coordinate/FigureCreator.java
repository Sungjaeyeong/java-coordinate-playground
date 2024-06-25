package coordinate;

public interface FigureCreator {
    Boolean isCreate(Coordinates coordinates);
    Figure create(Coordinates coordinates);
}
