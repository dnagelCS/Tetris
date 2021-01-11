package tetris.shapes;

import tetris.Grid;
import tetris.Square;

import java.util.ArrayList;
import java.util.List;

public class SShape {
    private List<Square> sShape = new ArrayList<>();
    private String color;
    private boolean canRotate;

    public void setSShape(List<Square> sShape) {
        this.sShape = sShape;
    }

    public List<Square> getSShape() {
        return sShape;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    /**
     *   Individual Coordinates
     *    (0,1)   O O (1,1)
     *   (-1,0) O O   (0,0)
     */
    private void createSShape() {
        int x = Grid.WIDTH / 2;
        int y = Grid.HEIGHT;
        for (int i = 0; i < 4; i++) {
            sShape.add(new Square(x + i, y));
            if (i == 1) {
                x = x - (i + 2);
                y = y - 1;
            }
        }
    }
}
