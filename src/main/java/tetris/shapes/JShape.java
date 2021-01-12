package tetris.shapes;

import tetris.Square;

import java.util.ArrayList;
import java.util.List;

public class JShape {
    private List<Square> jShape = new ArrayList<>();
    private int x = 0;
    private int y = 0;

    public JShape() {
        createJShape();
    }

    /**
     *   Individual Coordinates
     *            O (0,1)
     *            O (0,0)
     *  (-1,-1) O O (0,-1)
     */
    private void createJShape() {
        jShape.add(new Square(x, y + 1));
        jShape.add(new Square(x, y));
        jShape.add(new Square(x, y - 1));
        jShape.add(new Square(x - 1, y - 1));
    }
}
