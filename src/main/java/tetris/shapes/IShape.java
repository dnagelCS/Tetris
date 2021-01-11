package tetris.shapes;

import tetris.Grid;
import tetris.Square;

import java.util.ArrayList;
import java.util.List;

public class IShape {
    private List<Square> iShape = new ArrayList<>();
    private String color;
    private boolean canRotate;

    public void setIShape(List<Square> iShape) {
        this.iShape = iShape;
    }

    public List<Square> getIShape() {
        return iShape;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    /**
     *   Individual Coordinates
     *    O     O     O     O
     * (0,-1) (0,0) (0,1) (0,2)
     */
    private void createIShape() {
        int x = Grid.WIDTH / 2;
        int y = Grid.HEIGHT;
        for (int i = 0; i < 4; i++) {
            iShape.add(new Square(x + i, y));
        }
    }
}
