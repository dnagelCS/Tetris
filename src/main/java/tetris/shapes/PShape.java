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
        squaresList.add(new Square(getShapeX(),getShapeY() + 1, Color.CYAN));
        squaresList.add(new Square(getShapeX() + 1, getShapeY() + 1, Color.CYAN));
        squaresList.add(new Square(getShapeX(), getShapeY(), Color.CYAN));
        squaresList.add(new Square(getShapeX() + 1, getShapeY(), Color.CYAN));
        squaresList.add(new Square(getShapeX(), getShapeY() - 1, Color.CYAN));
    }
}