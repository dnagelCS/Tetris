package tetris;

import java.util.List;
import java.util.Random;

/**
 * Factory class for creating new Shape objects within the Grid.
 */
public class ShapeFactory {
    /**
     * @return a random new Shape Object
     */
    private Tetris tetris = new Tetris();
    private final Random rand = new Random();

    public Object newInstance() {
        Object randShape = tetris.getShapeList().get(rand.nextInt());
        return randShape;
    }
}
