package tetris;

import javax.swing.*;
import java.awt.*;

public class TetrisFrame extends JFrame {
    private Grid grid;
    private GridView gridView;
    private TetrisKeyListener keyListener;
    private JPanel panel;
    private JPanel upcomingShapePanel;
    private JButton play;
    private int delay = 200;

    public TetrisFrame(Grid grid, GridView gridView, TetrisKeyListener keyListener) {
        this.grid = grid;
        this.gridView = gridView;
        this.keyListener = keyListener;

        setSize(420, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tetris");
        setLayout(new BorderLayout());

        play = new JButton("Play \u25B6");
        //play.addActionListener(actionEvent -> playLoop());
        panel.add(play);

        add(gridView);
        add(panel, BorderLayout.EAST);
        addKeyListener(keyListener);
    }

    private void playLoop() {
        Thread thread = new Thread(() -> {
            while(true) {
                grid.lowerShape();
                gridView.repaint();
                try {
                    Thread.sleep(delay);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
    }
}