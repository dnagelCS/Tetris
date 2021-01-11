package tetris;

public class TetrisMain {
    public static void main(String[] args) {
        Grid grid = new Grid();
        GridView view = new GridView(grid);
        new GameFrame(grid,view).setVisible(true);
    }
}
