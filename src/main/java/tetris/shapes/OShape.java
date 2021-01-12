package tetris.shapes;

import tetris.Square;

import java.util.ArrayList;
import java.util.List;

public class OShape extends AllShapes{
    private List<Square> oShape = new ArrayList<>();
    private int x = 0;
    private int y = 0;

    public OShape() {
        createOShape();
    }

    /**
     *   Individual Coordinates
     *    (-1,0) O O (0,0)
     *   (-1,-1) O O (0,-1)
     */
    private void createOShape() {
        oShape.add(new Square(x - 1, y));
        oShape.add(new Square(x, y));
        oShape.add(new Square(x - 1, y - 1));
        oShape.add(new Square(x, y - 1));
    }
}
