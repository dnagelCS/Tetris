package tetris.shapes;

import tetris.Grid;
import tetris.Square;

import java.util.ArrayList;
import java.util.List;

public class OShape {
    //Class of O-shape tetris piece that includes the following:
    //List<Square>
    //color
    //coordinates --> individual coords or coords on grid or both?

    private List<Square> oShape = new ArrayList<>();
    private String color;
    private boolean canRotate;

    //in order to place OShape on grid
    public void setOShape(List<Square> oShape) {
        this.oShape = oShape;
    }

    public List<Square> getOShape() {
        return oShape;
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
     *   (-1,-1) O O (0,-1)
     */
    private void createOShape() {
        //coordinates on grid
        int x = Grid.WIDTH / 2;
        int y = Grid.HEIGHT;
        for (int i = 0; i < 4; i++) {
            oShape.add(new Square(x + i, y));
            if (i == 1) {
                x = x - (i + 1);
                y = y - 1;
            }
        }
    }
}
