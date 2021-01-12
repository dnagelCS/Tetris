package tetris.shapes;

import tetris.Square;

import java.util.ArrayList;
import java.util.List;

public class MiniShape {
    private List<Square> miniShape = new ArrayList<>();
    private int x = 0;
    private int y = 0;

    public MiniShape() {
        createMiniShape();
    }

    /**
     *   Individual Coordinates
     *    (-1,0) O O (0,0)
     */
    private void createMiniShape() {
        miniShape.add(new Square(x - 1, y));
        miniShape.add(new Square(x, y));
    }
}
