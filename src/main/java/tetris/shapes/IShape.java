package tetris.shapes;

import tetris.Square;

import java.util.ArrayList;
import java.util.List;

public class IShape extends AllShapes{
    private List<Square> iShape = new ArrayList<>();
    private int x = 0;
    private int y = 0;

    public IShape() {
       createIShape();
    }

    /**
     *   Individual Coordinates
     *    O     O     O     O
     * (0,-1) (0,0) (0,1) (0,2)
     */
    private void createIShape() {
        iShape.add(new Square(x, y - 1));
        iShape.add(new Square(x, y));
        iShape.add(new Square(x, y + 1));
        iShape.add(new Square(x, y + 2));
    }
}
