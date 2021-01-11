package tetris.shapes;

import tetris.Grid;
import tetris.Square;

import java.util.ArrayList;
import java.util.List;

public class LShape {
    private List<Square> lShape = new ArrayList<>();
    private String color;
    private boolean canRotate;

    public void setLShape(List<Square> lShape) {
        this.lShape = lShape;
    }

    public List<Square> getLShape() {
        return lShape;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    /**
     *   Individual Coordinates
     *    (0,1) O
     *    (0,0) O
     *   (0,-1) O O (1,-1)
     */
    private void createLShape() {
        int x = Grid.WIDTH / 2;
        int y = Grid.HEIGHT;
        for (int i = 0; i < 4; i++) {
            lShape.add(new Square(x, y - 1));
            if (i == 2) {
                x = x + 1;
                y = y + 1;
            }
        }
    }
}
