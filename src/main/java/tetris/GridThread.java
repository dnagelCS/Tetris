package tetris;

public class GridThread {

        private static final int DELAY_MS = 80;
        private int currentDelay;
        private int currentRound;

        private final Grid grid;
        private final GridView gridView;

        public GridThread(Grid grid, GridView gridView) {
            this.grid = grid;
            this.gridView = gridView;
            currentDelay = DELAY_MS;
            currentRound = 0;
        }

        /**
         * Every second, lower shape and repaint the grid
         */
        public void run() {
            while (grid.proceed()) {
                gridView.repaint();
                try {
                    decrementDelay();
                    Thread.sleep(currentDelay);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public void decrementDelay() {
            if (currentDelay > 15) {
                if (currentRound < 50) {
                    currentRound++;
                } else {
                    currentDelay--;
                    currentRound = 0;
                }
            }
        }
    }