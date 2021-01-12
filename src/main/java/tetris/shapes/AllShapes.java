package tetris.shapes;

import java.awt.*;

public abstract class AllShapes {
    private Color color;
    private int xGridCoord, yGridCoord, xShapeCoord, yShapeCoord;
    private boolean canRotate;
    private boolean fixed;
    private boolean inBounds;

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setGridCoords(int x, int y) {
        this.xGridCoord = x;
        this.yGridCoord = y;
    }

    public int getXGrid() {
        return xGridCoord;
    }

    public int getYGrid() {
        return yGridCoord;
    }

    public void setShapeCoords(int x, int y) {
        this.xShapeCoord = x;
        this.yShapeCoord = y;
    }

    public int getXShape() {
        return xShapeCoord;
    }

    public int getYShape() {
        return yShapeCoord;
    }
}
