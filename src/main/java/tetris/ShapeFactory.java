package tetris;

import java.util.Random;

/**
 * Factory class for creating new Shape objects within the Grid.
 */
public class ShapeFactory {
    /**
     * @return a random new Shape Object
     */
    private ShapeList shapeList = new ShapeList();
    private final Random rand = new Random();

    public Object newInstance() {
        Object randShape = shapeList.getShapeList().get(rand.nextInt());
        return randShape;
    }
}
