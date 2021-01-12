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
        squaresList.add(new Square(getX(), getY() - 1, Color.RED));
        squaresList.add(new Square(getX(), getY(), Color.RED));
        squaresList.add(new Square(getX(), getY() + 1, Color.RED));
        squaresList.add(new Square(getX(), getY() + 2, Color.RED));
    }
}