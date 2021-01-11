package tetris.shapes;

import tetris.Grid;
import tetris.Square;

import java.util.ArrayList;
import java.util.List;

public class TShape {
    private List<Square> tShape = new ArrayList<>();
    private String color;
    private boolean canRotate;

    public void setTShape(List<Square> tShape) {
        this.tShape = tShape;
    }

    public List<Square> getTShape() {
        return tShape;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    /**
     *   Individual Coordinates
     *           (0,0)
     *    (-1,0) O O O (1,0)
     *             O
     *           (0,-1)
     */
    private void createTShape() {
        int x = Grid.WIDTH / 2;
        int y = Grid.HEIGHT;
        for (int i = 0; i < 4; i++) {
            tShape.add(new Square(x + i, y));
            if (i == 2) {
                x = x - i;
                y = y - 1;
            }
        }
    }
}
