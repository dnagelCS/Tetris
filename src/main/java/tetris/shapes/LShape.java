package tetris.shapes;

import tetris.Square;

import java.awt.*;

public class LShape extends AbstractShape {

    public LShape(int x, int y) {
        super(x, y);
        createLShape();
    }

    /**
     *   Individual Coordinates
     *    (0,1) O
     *    (0,0) O
     *   (0,-1) O O (1,-1)
     */
    private void createLShape() {
        squaresList.add(new Square(getShapeX(), getShapeY() + 1, Color.YELLOW));
        squaresList.add(new Square(getShapeX(), getShapeY(), Color.YELLOW));
        squaresList.add(new Square(getShapeX(), getShapeY() - 1, Color.YELLOW));
        squaresList.add(new Square(getShapeX() + 1, getShapeY() - 1, Color.YELLOW));
    }
}