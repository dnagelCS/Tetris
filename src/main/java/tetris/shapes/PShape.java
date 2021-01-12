package tetris.shapes;

import tetris.Square;

import java.util.ArrayList;
import java.util.List;

public class PShape {
    private List<Square> pShape = new ArrayList<>();
    private int x = 0;
    private int y = 0;

    public PShape() {
        createPShape();
    }

    /**
     *   Individual Coordinates
     *    (0,1) O O (1,1)
     *    (0,0) O O (1,0)
     *   (0,-1) O
     */
    private void createPShape() {
        pShape.add(new Square(x,y + 1));
        pShape.add(new Square(x + 1, y + 1));
        pShape.add(new Square(x, y));
        pShape.add(new Square(x + 1, y));
        pShape.add(new Square(x, y - 1));
    }
}
