package tetris;

import javax.swing.*;
import java.awt.*;

public class GridView extends JComponent {
    private Grid grid;
    private static final int GRID_SIZE = 500;
    private static final int CELL_SIZE = 20;
    public static final int rows = GRID_SIZE/CELL_SIZE;
    public static final int cols = GRID_SIZE/CELL_SIZE;
    
    public GridView(Grid grid) {
        this.grid = grid;
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        paintGrid(g);
    }

    private void paintGrid(Graphics g) {
    }
}
