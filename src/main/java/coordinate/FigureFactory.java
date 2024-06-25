package coordinate;

import java.util.ArrayList;
import java.util.List;

public class FigureFactory {
    public static Figure getInstance(Coordinates coordinates) {
        List<FigureCreator> figureCreatorList = new ArrayList<>();
        figureCreatorList.add(new Line());
        figureCreatorList.add(new Rectangle());
        figureCreatorList.add(new Triangle());

        return figureCreatorList.stream()
                .filter(figureCreator -> figureCreator.isCreate(coordinates))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("생성할 수 있는 도형이 없습니다."))
                .create(coordinates);
    }
}
