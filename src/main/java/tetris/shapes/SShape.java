package tetris.shapes;

import tetris.Square;

import java.awt.*;

public class SShape extends AbstractShape {

    public SShape(int x, int y) {
        super(x, y);
        createSShape();
    }

    /**
     *   Individual Coordinates
     *    (0,1)   O O (1,1)
     *   (-1,0) O O   (0,0)
     */
    private void createSShape() {
        squaresList.add(new Square(getShapeX(), getShapeY() + 1, Color.PINK));
        squaresList.add(new Square(getShapeX() + 1, getShapeY() + 1, Color.PINK));
        squaresList.add(new Square(getShapeX() - 1, getShapeY(), Color.PINK));
        squaresList.add(new Square(getShapeX(), getShapeY(), Color.PINK));
    }
}