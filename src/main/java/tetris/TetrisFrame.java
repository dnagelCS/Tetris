package tetris;

import javax.swing.*;
import java.awt.*;

public class TetrisFrame extends JFrame {

    public TetrisFrame(Grid grid, GridView gridView, TetrisKeyListener keyListener) {
        int widthMargin = 14;
        int heightMargin = 9;

        setSize(Grid.WIDTH + widthMargin, Grid.HEIGHT + heightMargin);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tetris");
        setLayout(new BorderLayout());

        add(gridView);
        addKeyListener(keyListener);
    }
}