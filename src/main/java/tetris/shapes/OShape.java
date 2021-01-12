package tetris.shapes;

import tetris.Square;

import java.awt.*;


public class OShape extends AbstractShape {

    public OShape(int x, int y) {
        super(x,y);
        createOShape();
    }

    /**
     *   Individual Coordinates
     *    (-1,0) O O (0,0)
     *   (-1,-1) O O (0,-1)
     */
    private void createOShape() {
        getSquares().add(new Square(getX() - 1, getY(), Color.BLUE));
        getSquares().add(new Square(getX(), getY(), Color.BLUE));
        getSquares().add(new Square(getX() - 1, getY() - 1, Color.BLUE));
        getSquares().add(new Square(getX(), getY() - 1, Color.BLUE));
    }
}