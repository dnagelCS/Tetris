package tetris;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class TetrisKeyListener extends KeyAdapter {

    private final Grid grid;

    public TetrisKeyListener(Grid grid) {
        this.grid = grid;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        super.keyPressed(e);
        switch (e.getKeyCode()) {
            case KeyEvent.VK_RIGHT:
                grid.moveRight();
                break;
            case KeyEvent.VK_LEFT:
                grid.moveLeft();
                break;
            case KeyEvent.VK_UP:
                grid.rotateClockwise();
                break;
            case KeyEvent.VK_SPACE:
                grid.dropShape();
                break;
        }
    }
}