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
    private int margin = 30;

    public TetrisFrame(Grid grid, GridView gridView, TetrisKeyListener keyListener) {
        this.grid = grid;
        this.gridView = gridView;
        this.keyListener = keyListener;

        setSize(Grid.WIDTH + margin, Grid.HEIGHT + margin);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tetris");
        setLayout(new BorderLayout());

        panel = new JPanel();
        play = new JButton("Play \u25B6");
        //play.addActionListener(actionEvent -> playLoop());
        //panel.add(play);
        setBackground(Color.DARK_GRAY);

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