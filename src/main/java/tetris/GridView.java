package tetris;

import javax.swing.*;
import java.awt.*;

public class GridView extends JComponent {
    private Grid grid;
    private static final int CELL_SIZE = 15;
    
    public GridView(Grid grid) {
        this.grid = grid;
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        paintGrid(g);
        paintCurrShape(g);
    }

    private void paintGrid(Graphics g) {
        boolean board[][] = grid.getGrid();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                g.setColor(Color.BLACK);
                g.drawRect(i * CELL_SIZE, j * CELL_SIZE, CELL_SIZE, CELL_SIZE);
            }
        }
    }

    private void paintCurrShape(Graphics g) {
    }
}
