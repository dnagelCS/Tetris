package tetris.shapes;

import tetris.Grid;
import tetris.Square;

import java.util.ArrayList;
import java.util.List;

public class MiniShape {
    private List<Square> miniShape = new ArrayList<>();
    private String color;
    private boolean canRotate;

    public void setMiniShape(List<Square> zShape) {
        this.miniShape = zShape;
    }

    public List<Square> getMiniShape() {
        return miniShape;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    /**
     *   Individual Coordinates
     *    (-1,0) O O (0,0)
     */
    private void createMiniShape() {
        int x = Grid.WIDTH / 2;
        int y = Grid.HEIGHT;
        for (int i = 0; i < 2; i++) {
            miniShape.add(new Square(x + i, y));
        }
    }
}
