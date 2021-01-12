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
        getSquares().add(new Square(getX(), getY() + 1, Color.ORANGE));
        getSquares().add(new Square(getX(), getY(), Color.ORANGE));
        getSquares().add(new Square(getX(), getY() - 1, Color.ORANGE));
        getSquares().add(new Square(getX() - 1, getY() - 1, Color.ORANGE));
    }
}