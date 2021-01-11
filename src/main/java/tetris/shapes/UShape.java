package tetris.shapes;

import tetris.Grid;
import tetris.Square;

import java.util.ArrayList;
import java.util.List;

public class UShape {
    private List<Square> uShape = new ArrayList<>();
    private String color;
    private boolean canRotate;

    public void setUShape(List<Square> uShape) {
        this.uShape = uShape;
    }

    public List<Square> getUShape() {
        return uShape;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    /**
     *   Individual Coordinates
     *    (-1,2) O   O (1,2)
     *    (-1,1) O   O (1,1)
     *    (-1,0) O O O (1,0)
     *           (0,0)
     */
    private void createUShape() {
        int x = Grid.WIDTH / 2;
        int y = Grid.HEIGHT;
        for (int i = 0; i < 7; i++) {
            uShape.add(new Square(x + i, y));
            if (i == 2) {
                x = x - i;
                y = y - 1;
            }
            if (i == 3) {
                x = x - i;
                y = y - 1;
            }
        }
    }
}
