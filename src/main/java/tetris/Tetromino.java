package tetris;

import java.util.ArrayList;
import java.util.List;

public class Tetromino {

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
        createOShape();
        createIShape();
        createJShape();
        createLShape();
        createSShape();
        createZShape();
        createTShape();
        createPShape();
        createUShape();
        createMiniShape();
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

    public Tetromino rotateClockwise(Tetromino shape) {
        if (oShape.equals(shape)) {
            return this;
        }
        if (iShape.equals(shape)) {

        }
        //add all shapes
        return shape;
    }

    //add rotateCounter()
}
