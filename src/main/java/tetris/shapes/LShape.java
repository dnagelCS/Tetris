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
        squaresList.add(new Square(getX(), getY() + 1, Color.YELLOW));
        squaresList.add(new Square(getX(), getY(), Color.YELLOW));
        squaresList.add(new Square(getX(), getY() - 1, Color.YELLOW));
        squaresList.add(new Square(getX() + 1, getY() - 1, Color.YELLOW));
    }
}