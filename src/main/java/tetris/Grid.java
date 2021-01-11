package tetris;

public class Grid {
    private boolean[][] grid;
    public static final int WIDTH = 100;
    public static final int HEIGHT = 40;

    public Grid() { this.grid = new boolean[WIDTH][HEIGHT];
    }

    public boolean[][] getGrid() {
        return grid;
    }
}
