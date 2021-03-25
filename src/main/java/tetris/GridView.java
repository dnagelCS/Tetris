package tetris;

import tetris.shapes.AbstractShape;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import static tetris.Grid.COLS;
import static tetris.Grid.ROWS;

public class GridView extends JComponent {
    private Grid grid;
    private static final int WIDTH = Grid.getWidth();
    private static final int HEIGHT = Grid.getHeight();
    private static final int CELL_SIZE = Grid.getCellSize();

    public GridView(Grid grid) {
        this.grid = grid;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        paintGrid(g);
        paintFixedSquares(g);
        paintCurrShape(g);
    }

    private void paintGrid(Graphics g) {
        g.setColor(new Color(0, 0, 100));
        g.fillRect(0, 0, WIDTH+CELL_SIZE, HEIGHT);

        g.setColor(Color.BLACK);
        for (int i = 0; i < HEIGHT/CELL_SIZE; i++) {
            g.drawLine(0, i * CELL_SIZE, WIDTH+CELL_SIZE, i * CELL_SIZE);
        }

        for (int i = 0; i <= WIDTH/CELL_SIZE; i++) {
            g.drawLine(i * CELL_SIZE, 0, i * CELL_SIZE, HEIGHT);
        }
    }

    private void paintFixedSquares(Graphics g){
        Square[][] gridSquares = grid.getGridSquares();
        for(int x = 0; x < COLS; x++){
            for(int y = 0; y < ROWS; y++){
                if(gridSquares[y][x] == null){
                    continue;
                }
                else{
                    g.setColor(gridSquares[y][x].getColor());
                    g.fillRect(x * CELL_SIZE,  y * CELL_SIZE, CELL_SIZE, CELL_SIZE);
                    g.setColor(Color.BLACK);
                    g.drawLine(x * CELL_SIZE, y * CELL_SIZE, x * CELL_SIZE, y * CELL_SIZE + CELL_SIZE);
                    g.drawLine(x * CELL_SIZE, y * CELL_SIZE, x * CELL_SIZE + CELL_SIZE, y * CELL_SIZE);
                }
            }
        }
    }

    private void paintCurrShape(Graphics g) {
        AbstractShape shape = grid.getCurrentShape();
        int gridX = shape.getX();
        int gridY = shape.getY();
        ArrayList<Square> squares = shape.getSquares();
        for(Square square : squares)
        {
            int x = gridX + square.getX() * CELL_SIZE;
            int y = gridY + square.getY() * CELL_SIZE;
            g.setColor(square.getColor());
            g.fillRect(x,  y, CELL_SIZE, CELL_SIZE);
            g.setColor(Color.BLACK);
            g.drawLine(x, y, x, y + CELL_SIZE);
            g.drawLine(x, y, x + CELL_SIZE, y);
        }
    }
}