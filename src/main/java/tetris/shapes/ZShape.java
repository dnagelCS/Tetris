package tetris.shapes;

import tetris.Grid;
import tetris.Square;

import java.util.ArrayList;
import java.util.List;

public class ZShape {
    private List<Square> zShape = new ArrayList<>();
    private String color;
    private boolean canRotate;

    public void setZShape(List<Square> zShape) {
        this.zShape = zShape;
    }

    public List<Square> getZShape() {
        return zShape;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    /**
     *   Individual Coordinates
     *    (-1,1) O O   (0,1)
     *     (0,0)   O O (1,0)
     */
    private void createZShape() {
        int x = Grid.WIDTH / 2;
        int y = Grid.HEIGHT;
        for (int i = 0; i < 4; i++) {
            zShape.add(new Square(x + i, y));
            if (i == 1) {
                x = x - i;
                y = y - 1;
            }
        }
    }
}
