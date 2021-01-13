package tetris.shapes;

import tetris.Square;

import java.awt.*;

public class TShape extends AbstractShape {

    public TShape(int x, int y) {
        super(x, y);
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
        squaresList.add(new Square(-1,0, Color.WHITE));
        squaresList.add(new Square(0, 0, Color.WHITE));
        squaresList.add(new Square(1, 0, Color.WHITE));
        squaresList.add(new Square(0, -1, Color.WHITE));
    }
}