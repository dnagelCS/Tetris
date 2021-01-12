package tetris.shapes;

import tetris.Square;

import java.awt.*;

public class ZShape extends AbstractShape {

    public ZShape(int x, int y) {
        super(x, y);
        createZShape();
    }

    /**
     *   Individual Coordinates
     *    (-1,1) O O   (0,1)
     *     (0,0)   O O (1,0)
     */
    private void createZShape() {
        squaresList.add(new Square(getX() - 1, getY() + 1, Color.LIGHT_GRAY));
        squaresList.add(new Square(getX(), getY() + 1, Color.LIGHT_GRAY));
        squaresList.add(new Square(getX(), getY(), Color.LIGHT_GRAY));
        squaresList.add(new Square(getX() + 1, getY(), Color.LIGHT_GRAY));
    }
}