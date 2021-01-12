package tetris.shapes;

import tetris.Square;

import java.util.ArrayList;
import java.util.List;

public class LShape extends AllShapes{
    private List<Square> lShape = new ArrayList<>();
    private int x = 0;
    private int y = 0;

    public LShape() {
        createLShape();
    }

    /**
     *   Individual Coordinates
     *    (0,1) O
     *    (0,0) O
     *   (0,-1) O O (1,-1)
     */
    private void createLShape() {
        lShape.add(new Square(x, y + 1));
        lShape.add(new Square(x, y));
        lShape.add(new Square(x, y - 1));
        lShape.add(new Square(x + 1, y - 1));
    }
}
