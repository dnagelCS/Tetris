package tetris.shapes;

import tetris.Grid;
import tetris.Square;

import java.util.ArrayList;
import java.util.List;

public class JShape {
    private List<Square> jShape = new ArrayList<>();
    private String color;
    private boolean canRotate;

    public void setJShape(List<Square> jShape) {
        this.jShape = jShape;
    }

    public List<Square> getJShape() {
        return jShape;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    /**
     *   Individual Coordinates
     *            O (0,1)
     *            O (0,0)
     *  (-1,-1) O O (0,-1)
     */
    private void createJShape() {
        int x = Grid.WIDTH / 2;
        int y = Grid.HEIGHT;
        for (int i = 0; i < 4; i++) {
            jShape.add(new Square(x, y - 1));
            if (i == 2) {
                x = x - 1;
                y = y + 1;
            }
        }
    }
}
