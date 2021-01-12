package tetris.shapes;

import tetris.Square;

import java.awt.*;

public class PShape extends AbstractShape {

    public PShape(int x, int y) {
        super(x, y);
        createPShape();
    }

    /**
     *   Individual Coordinates
     *    (0,1) O O (1,1)
     *    (0,0) O O (1,0)
     *   (0,-1) O
     */
    private void createPShape() {
        squaresList.add(new Square(getX(),getY() + 1, Color.CYAN));
        squaresList.add(new Square(getX() + 1, getY() + 1, Color.CYAN));
        squaresList.add(new Square(getX(), getY(), Color.CYAN));
        squaresList.add(new Square(getX() + 1, getY(), Color.CYAN));
        squaresList.add(new Square(getX(), getY() - 1, Color.CYAN));
    }
}