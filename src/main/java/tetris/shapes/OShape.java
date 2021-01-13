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
        squaresList.add(new Square(-1,0, Color.BLUE));
        squaresList.add(new Square(0, 0, Color.BLUE));
        squaresList.add(new Square(-1,-1, Color.BLUE));
        squaresList.add(new Square(0, -1, Color.BLUE));
    }
}