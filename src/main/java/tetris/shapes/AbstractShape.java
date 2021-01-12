package tetris.shapes;

import tetris.Square;

import java.util.ArrayList;

public abstract class AbstractShape {
    protected ArrayList<Square> squaresList;
    private int shapeX = 0, shapeY = 0;
    private int gridX, gridY;
    private Square center;
    private boolean canRotate;
    private boolean fixed;
    private boolean inBounds;

    public AbstractShape(int gridX, int gridY) {
        this.gridX = gridX;
        this.gridY = gridY;
        squaresList = new ArrayList<>();
    }

    public ArrayList<Square> getSquares() {
        return squaresList;
    }

    public int getShapeX() {
        return shapeX;
    }

    public int getShapeY() {
        return shapeY;
    }

    public int getGridX() {
        return gridX;
    }

    public int getGridY() {
        return gridY;
    }

    public void move(int xChange, int yChange) {
        gridX += xChange;
        gridY += yChange;
    }

    public void rotate()
    {

    }
}
