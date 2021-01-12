package tetris;

public class TetrisMain {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Grid grid = new Grid(shapeFactory);
        GridView view = new GridView(grid);
        TetrisKeyListener keyListener = new TetrisKeyListener();
        GridThread gridThread = new GridThread(grid, view);
        thread.start();
        new GameFrame(grid,view).setVisible(true);
    }
}
