package tetris.shapes;

import tetris.Square;

import java.awt.*;

public class JShape extends AbstractShape {

    public JShape(int x, int y) {
        super(x, y);
        createJShape();
    }

    /**
     *   Individual Coordinates
     *            O (0,1)
     *            O (0,0)
     *  (-1,-1) O O (0,-1)
     */
    private void createJShape() {
        squaresList.add(new Square(0, 1, Color.ORANGE));
        squaresList.add(new Square(0, 0, Color.ORANGE));
        squaresList.add(new Square(0, -1, Color.ORANGE));
        squaresList.add(new Square(-1,-1, Color.ORANGE));
    }
}