package tetris.shapes;

import tetris.Grid;
import tetris.Square;

import java.util.ArrayList;
import java.util.List;

public class PShape {
    private List<Square> pShape = new ArrayList<>();
    private String color;
    private boolean canRotate;

    public void setPShape(List<Square> pShape) {
        this.pShape = pShape;
    }

    public List<Square> getPShape() {
        return pShape;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    /**
     *   Individual Coordinates
     *    (0,1) O O (1,1)
     *    (0,0) O O (1,0)
     *   (0,-1) O
     */
    private void createPShape() {
        int x = Grid.WIDTH / 2;
        int y = Grid.HEIGHT;
        for (int i = 0; i < 5; i++) {
            pShape.add(new Square(x + i, y));
            if (i == 2) {
                x = x - i;
                y = y - 1;
            }
        }
    }
}
