package tetris;

import javax.swing.*;
import java.awt.*;

public class TetrisFrame extends JFrame {
    private Grid grid;
    private GridView gridView;
    private TetrisKeyListener keyListener;
    private int delay = 200;
    private int margin = 30;

    public TetrisFrame(Grid grid, GridView gridView, TetrisKeyListener keyListener) {
        this.grid = grid;
        this.gridView = gridView;
        this.keyListener = keyListener;

        setSize(Grid.WIDTH + margin, Grid.HEIGHT + margin);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tetris");
        setLayout(new BorderLayout());

        add(gridView);
        addKeyListener(keyListener);
    }
}