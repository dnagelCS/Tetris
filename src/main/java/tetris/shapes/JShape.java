package tetris.shapes;

import tetris.Square;

import java.awt.*;

public class JShape extends AbstractShape {

    public JShape(int x, int y) {
        super(x, y);
        createJShape();
    }

    /**
     *   Individual Coordinates
     *            O (0,1)
     *            O (0,0)
     *  (-1,-1) O O (0,-1)
     */
    private void createJShape() {
        getSquares().add(new Square(getShapeX(), getShapeY() + 1, Color.ORANGE));
        getSquares().add(new Square(getShapeX(), getShapeY(), Color.ORANGE));
        getSquares().add(new Square(getShapeX(), getShapeY() - 1, Color.ORANGE));
        getSquares().add(new Square(getShapeX() - 1, getShapeY() - 1, Color.ORANGE));
    }
}