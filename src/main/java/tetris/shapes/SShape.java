package tetris.shapes;

import tetris.Square;

import java.util.ArrayList;
import java.util.List;

public class SShape extends AllShapes{
    private List<Square> sShape = new ArrayList<>();
    private int x = 0;
    private int y = 0;

    public SShape() {
        createSShape();
    }

    /**
     *   Individual Coordinates
     *    (0,1)   O O (1,1)
     *   (-1,0) O O   (0,0)
     */
    private void createSShape() {
        sShape.add(new Square(x, y + 1));
        sShape.add(new Square(x + 1, y + 1));
        sShape.add(new Square(x - 1, y));
        sShape.add(new Square(x, y));
    }
}
