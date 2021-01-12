package tetris;

import tetris.shapes.AllShapes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Factory class for creating new Shape objects within the Grid.
 */
public class ShapeFactory {
    /**
     * @return a random new Shape Object
     */
    private List<AllShapes> shapeList = new ArrayList<>();
    private final Random rand = new Random();

    public AllShapes newInstance() {
        return shapeList.get(rand.nextInt(shapeList.size()));
    }
}