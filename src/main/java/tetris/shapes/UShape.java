package tetris.shapes;

import tetris.Square;

import java.awt.*;

public class UShape extends AbstractShape {

    public UShape(int x, int y) {
        super(x, y);
        createUShape();
    }

    /**
     *   Individual Coordinates
     *    (-1,2) O   O (1,2)
     *    (-1,1) O   O (1,1)
     *    (-1,0) O O O (1,0)
     *           (0,0)
     */
    private void createUShape() {
        squaresList.add(new Square(-1, 2, Color.MAGENTA));
        squaresList.add(new Square(-1, 1, Color.MAGENTA));
        squaresList.add(new Square(-1, 0, Color.MAGENTA));
        squaresList.add(new Square(0, 0, Color.MAGENTA));
        squaresList.add(new Square(1, 0, Color.MAGENTA));
        squaresList.add(new Square(1, 1, Color.MAGENTA));
        squaresList.add(new Square(1, 2, Color.MAGENTA));
    }
}