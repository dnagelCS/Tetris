package tetris;

public class TetrisMain {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Grid grid = new Grid(shapeFactory);
        GridView view = new GridView(grid);
        TetrisKeyListener keyListener = new TetrisKeyListener(grid);
        GridThread gridThread = new GridThread(grid, view);
        gridThread.start();
        new TetrisFrame(grid, view, keyListener).setVisible(true);
    }
}