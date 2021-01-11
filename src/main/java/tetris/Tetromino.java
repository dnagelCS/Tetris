package tetris;

import java.util.*;

public class Tetromino {

    private HashMap<Integer, List<Square>> allShapes = new HashMap<>();
    private ArrayList<List<Square>> shapeHolder = new ArrayList<>();

    //class of all 10 tetris shapes
    private List<Square> oShape = new ArrayList<>();
    private List<Square> iShape = new ArrayList<>();
    private List<Square> jShape = new ArrayList<>();
    private List<Square> lShape = new ArrayList<>();
    private List<Square> sShape = new ArrayList<>();
    private List<Square> zShape = new ArrayList<>();
    private List<Square> tShape = new ArrayList<>();
    private List<Square> pShape = new ArrayList<>();
    private List<Square> uShape = new ArrayList<>();
    private List<Square> miniShape = new ArrayList<>();

    public Tetromino() {
        getRandomShape();
    }

    private void createOShape() {
        int x = Grid.WIDTH/2;
        int y = Grid.HEIGHT;
        for (int i = 0; i < 4; i++) {
            oShape.add(new Square(x+i, y));
            if(i == 1) {
                x = x - (i+1);
                y = y - 1;
            }
        }
    }

    private void createIShape() {
        int x = Grid.WIDTH/2;
        int y = Grid.HEIGHT;
        for (int i = 0; i < 4; i++) {
            iShape.add(new Square(x + i, y));
        }
    }

    private void createJShape() {
        int x = Grid.WIDTH/2;
        int y = Grid.HEIGHT;
        for (int i = 0; i < 4; i++) {
            jShape.add(new Square(x, y-1));
            if(i == 2) {
                x = x - 1;
                y = y + 1;
            }
        }
    }

    private void createLShape() {
        int x = Grid.WIDTH/2;
        int y = Grid.HEIGHT;
        for (int i = 0; i < 4; i++) {
            lShape.add(new Square(x, y-1));
            if(i == 2) {
                x = x + 1;
                y = y + 1;
            }
        }
    }

    private void createSShape() {
        int x = Grid.WIDTH/2;
        int y = Grid.HEIGHT;
        for (int i = 0; i < 4; i++) {
            sShape.add(new Square(x+i, y));
            if(i == 1) {
                x = x - (i + 2);
                y = y - 1;
            }
        }
    }

    private void createZShape() {
        int x = Grid.WIDTH/2;
        int y = Grid.HEIGHT;
        for (int i = 0; i < 4; i++) {
            zShape.add(new Square(x+i, y));
            if(i == 1) {
                x = x - i;
                y = y - 1;
            }
        }
    }

    private void createTShape() {
        int x = Grid.WIDTH/2;
        int y = Grid.HEIGHT;
        for (int i = 0; i < 4; i++) {
            tShape.add(new Square(x + i, y));
            if (i == 2) {
                x = x - i;
                y = y - 1;
            }
        }
    }

    private void createPShape() {
        int x = Grid.WIDTH/2;
        int y = Grid.HEIGHT;
        for (int i = 0; i < 5; i++) {
            pShape.add(new Square(x+i, y));
            if(i == 2) {
                x = x - i;
                y = y - 1;
            }
        }
    }

    private void createUShape() {
        int x = Grid.WIDTH/2;
        int y = Grid.HEIGHT;
        for (int i = 0; i < 7; i++) {
            uShape.add(new Square(x+i, y));
            if(i == 2) {
                x = x - i;
                y = y - 1;
            }
            if (i == 3) {
                x = x - i;
                y = y - 1;
            }
        }
    }

    private void createMiniShape() {
        int x = Grid.WIDTH/2;
        int y = Grid.HEIGHT;
        for (int i = 0; i < 2; i++) {
            miniShape.add(new Square(x + i, y));
        }
    }

    public List<Square> getOShape() {
          return oShape;
    }

    public List<Square> getIShape() {
        return iShape;
    }

    public List<Square> getJShape() {
        return jShape;
    }

    public List<Square> getLShape() {
        return lShape;
    }

    public List<Square> getSShape() {
        return sShape;
    }

    public List<Square> getZShape() {
        return zShape;
    }

    public List<Square> getTShape() {
        return tShape;
    }

    public List<Square> getPShape() {
        return pShape;
    }

    public List<Square> getUShape() {
        return uShape;
    }

    public List<Square> getMiniShape() {
        return miniShape;
    }

    public List rotateClockwise(List<Square> shape) {
        if (oShape.equals(shape)) {
            return oShape;
        }
        if (iShape.equals(shape)) {

        }
        //add all shapes
        return shape;
    }

    //add rotateCounter()

    /**
     * @return last element/bottom of shape.
     * Used if the shape reached bottom of grid or other shape at bottom.
     */
    public Square getShapeBottom() {
        if (oShape.equals(getCurrentShape())) {
            return oShape.get(oShape.size()-1);
        } else if (iShape.equals(getCurrentShape())) {
            return iShape.get(iShape.size() - 1);
        } else if (jShape.equals(getCurrentShape())) {
            return jShape.get(jShape.size() - 1);
        } else if (lShape.equals(getCurrentShape())) {
            return lShape.get(lShape.size() - 1);
        } else if (sShape.equals(getCurrentShape())) {
            return sShape.get(sShape.size() - 1);
        } else if (zShape.equals(getCurrentShape())) {
            return zShape.get(zShape.size() - 1);
        } else if (tShape.equals(getCurrentShape())) {
            return tShape.get(tShape.size() - 1);
        } else if (pShape.equals(getCurrentShape())) {
            return pShape.get(pShape.size() - 1);
        } else if (uShape.equals(getCurrentShape())) {
            return uShape.get(uShape.size() - 1);
        } else if (miniShape.equals(getCurrentShape())) {
            return miniShape.get(miniShape.size() - 1);
        }
        //if it's an unhandled shape
        else {
            return null;
        }
    }

    public void getAllShapes() {
        allShapes.put(1, oShape);
        allShapes.put(2, iShape);
        allShapes.put(3, jShape);
        allShapes.put(4, lShape);
        allShapes.put(5, sShape);
        allShapes.put(6, zShape);
        allShapes.put(7, tShape);
        allShapes.put(8, pShape);
        allShapes.put(9, uShape);
        allShapes.put(10, miniShape);
    }

    public List<Square> getRandomShape() {
        //populate HashMap with all shapes
        getAllShapes();
        //place all keys into array
        Object[] keysArray = allShapes.keySet().toArray();
        //get random key from keysArray
        Random random = new Random();
        Object key = keysArray[random.nextInt(keysArray.length)];
        //return shape value associated with that random key
        return allShapes.get(key);
    }

    public List<Square> getCurrentShape() {
        return shapeHolder.get(0);
    }

    public ArrayList<List<Square>> getShapeHolder() {
        return shapeHolder;
    }
}