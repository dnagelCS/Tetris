package tetris.shapes;

import tetris.Square;

import java.awt.*;

public class MiniShape extends AbstractShape {

    public MiniShape(int x, int y) {
        super(x, y);
        createMiniShape();
    }

    /**
     *   Individual Coordinates
     *    (-1,0) O O (0,0)
     */
    private void createMiniShape() {
        getSquares().add(new Square(getX() - 1, getY(), Color.GREEN));
        getSquares().add(new Square(getX(), getY(), Color.GREEN));
    }
}