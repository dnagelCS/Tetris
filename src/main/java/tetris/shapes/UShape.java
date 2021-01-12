package tetris.shapes;

import tetris.Square;

import java.util.ArrayList;
import java.util.List;

public class UShape {
    private List<Square> uShape = new ArrayList<>();
    private int x = 0;
    private int y = 0;

    public UShape() {
        createUShape();
    }

    /**
     *   Individual Coordinates
     *    (-1,2) O   O (1,2)
     *    (-1,1) O   O (1,1)
     *    (-1,0) O O O (1,0)
     *           (0,0)
     */
    private void createUShape() {
        uShape.add(new Square(x - 1, y + 2));
        uShape.add(new Square(x - 1, y + 1));
        uShape.add(new Square(x - 1, y));
        uShape.add(new Square(x, y));
        uShape.add(new Square(x + 1, y));
        uShape.add(new Square(x + 1, y + 1));
        uShape.add(new Square(x + 1, y + 2));
    }
}
