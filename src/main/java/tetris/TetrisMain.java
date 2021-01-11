package tetris;

public class TetrisMain {
    public static void main(String[] args) {
        Tetromino tetromino = new Tetromino();
        Grid grid = new Grid(tetromino);
        GridView view = new GridView(grid);
        TetrisKeyListener keyListener = new TetrisKeyListener();
        GridThread gridThread = new GridThread(grid, view);
        thread.start();
        new GameFrame(grid,view).setVisible(true);
    }
}
