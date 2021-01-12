package tetris.shapes;

import tetris.Square;

import java.awt.*;
import java.util.ArrayList;

public abstract class AllShapes {
    private Color color;
    protected ArrayList<Square> squaresList;
    private Square center;
    private boolean canRotate;
    private boolean fixed;
    private boolean inBounds;

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public ArrayList<Square> getSquares() {
        return squaresList;
    }

    public void move(int xChange, int yChange) {
        center.setX(center.getX() + xChange);
        center.setY(center.getY() + yChange);
    }

    public void rotate()
    {

    }
}
