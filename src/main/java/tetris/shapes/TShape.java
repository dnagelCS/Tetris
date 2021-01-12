package tetris.shapes;

import tetris.Square;

import java.util.ArrayList;
import java.util.List;

public class TShape {
    private List<Square> tShape = new ArrayList<>();
    private int x = 0;
    private int y = 0;

    public TShape() {
        createTShape();
    }

    /**
     *   Individual Coordinates
     *           (0,0)
     *    (-1,0) O O O (1,0)
     *             O
     *           (0,-1)
     */
    private void createTShape() {
        tShape.add(new Square(x - 1, y));
        tShape.add(new Square(x, y));
        tShape.add(new Square(x + 1, y));
        tShape.add(new Square(x, y - 1));
    }
}
