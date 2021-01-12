package tetris.shapes;

import tetris.Square;

import java.awt.*;

public class IShape extends AbstractShape {

    public IShape(int x, int y) {
        super(x, y);
        createIShape();
    }

    /**
     *   Individual Coordinates
     *    O     O     O     O
     * (0,-1) (0,0) (0,1) (0,2)
     */
    private void createIShape() {
        getSquares().add(new Square(getShapeX(), getShapeY() - 1, Color.RED));
        getSquares().add(new Square(getShapeX(), getShapeY(), Color.RED));
        getSquares().add(new Square(getShapeX(), getShapeY() + 1, Color.RED));
        getSquares().add(new Square(getShapeX(), getShapeY() + 2, Color.RED));
    }
}