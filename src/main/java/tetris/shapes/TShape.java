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
        squaresList.add(new Square(getShapeX() - 1, getShapeY(), Color.WHITE));
        squaresList.add(new Square(getShapeX(), getShapeY(), Color.WHITE));
        squaresList.add(new Square(getShapeX() + 1, getShapeY(), Color.WHITE));
        squaresList.add(new Square(getShapeX(), getShapeY() - 1, Color.WHITE));
    }
}