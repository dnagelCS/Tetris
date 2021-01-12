package tetris;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {
    private Grid grid;
    private GridView gridView;
    private JPanel panel;
    private JPanel upcomingShapePanel;
    private JButton play;
    private int delay = 200;

    public GameFrame(Grid grid, GridView gridView) {
        this.grid = grid;
        this.gridView = gridView;

        setSize(420, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tetris");
        setLayout(new BorderLayout());

        play = new JButton("Play \u25B6");
        play.addActionListener(actionEvent -> playLoop());
        panel.add(play);

        add(gridView);
        add(panel, BorderLayout.EAST);
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
