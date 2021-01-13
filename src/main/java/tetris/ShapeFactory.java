package tetris;

import tetris.shapes.*;

import java.util.Random;

/**
 * Factory class for creating new Shape objects within the Grid.
 */
public class ShapeFactory {
    /**
     * @return a random new Shape Object
     */
    private final Random rand = new Random();
    private int startX = 225;
    private int startY = 0;

    public AbstractShape newInstance() {
        int randNum = rand.nextInt(10);

        switch (randNum) {
            case 0:
                return new OShape(startX, startY);
            case 1:
                return new IShape(startX, startY);
            case 2:
                return new JShape(startX, startY);
            case 3:
                return new LShape(startX, startY);
            case 4:
                return new SShape(startX, startY);
            case 5:
                return new ZShape(startX, startY);
            case 6:
                return new TShape(startX, startY);
            case 7:
                return new PShape(startX, startY);
            case 8:
                return new UShape(startX, startY);
            case 9:
                return new MiniShape(startX, startY);
            default:
                Exception exc = new Exception();
                exc.printStackTrace();
        }
        return null;
    }
}