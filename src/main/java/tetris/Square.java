package tetris;

import java.util.Objects;

public class Square {
    private int x;
    private int y;

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

    public void setX(int x) {this.x = x;}

    public void setY(int y) {this.y = y;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;
        Square segment = (Square) o;
        return x == segment.x &&
                y == segment.y;

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
