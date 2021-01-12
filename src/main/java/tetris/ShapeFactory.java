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
    private AbstractShape abstractShape;

    public AbstractShape newInstance() {
        int randNum = rand.nextInt(10);

        switch(randNum) {
            case 0:
                return new OShape();
            case 1:
                return new IShape();
            case 2:
                return new JShape();
            case 3:
                return new LShape();
            case 4:
                return new SShape();
            case 5:
                return new ZShape();
            case 6:
                return new TShape();
            case 7:
                return new PShape();
            case 8:
                return new UShape();
            case 9:
                return new MiniShape();
        }
        return abstractShape;
    }
}