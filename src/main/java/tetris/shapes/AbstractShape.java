package tetris.shapes;

import tetris.Square;

import java.util.ArrayList;

public abstract class AbstractShape {
    private ArrayList<Square> squaresList;
    private int x = 0, y = 0;
    private Square center;
    private boolean canRotate;
    private boolean fixed;
    private boolean inBounds;

    public AbstractShape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public ArrayList<Square> getSquares() {
        return squaresList;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void move(int xChange, int yChange) {
        x += xChange;
        y += yChange;
    }

    public void rotate()
    {

    }
}
