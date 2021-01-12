package tetris.shapes;

import tetris.Square;

import java.util.ArrayList;
import java.util.List;

public class ZShape {
    private List<Square> zShape = new ArrayList<>();
    private int x = 0;
    private int y = 0;

    public ZShape() {
        createZShape();
    }

    /**
     *   Individual Coordinates
     *    (-1,1) O O   (0,1)
     *     (0,0)   O O (1,0)
     */
    private void createZShape() {
        zShape.add(new Square(x - 1, y + 1));
        zShape.add(new Square(x, y + 1));
        zShape.add(new Square(x, y));
        zShape.add(new Square(x + 1, y));
    }
}
