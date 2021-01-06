package tetris;

import java.util.Objects;

public class Square {
    private final int x;
    private final int y;

    public Square(Square square) {
        this.x = square.x;
        this.y = square.y;
    }

    public Square(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    /**
     * @return true if this Square is in the bounds of the Garden, otherwise false.
     */
    public boolean inBounds() {
        return x >= 0 && x < Grid.WIDTH && y >= 0 && y < Grid.HEIGHT;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Square{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
