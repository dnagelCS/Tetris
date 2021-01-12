package tetris;

import tetris.shapes.*;

import java.util.ArrayList;
import java.util.List;

public class ShapeList {
    private List<Object> shapeList = new ArrayList<>();

    public List<Object> getShapeList() {
        return shapeList;
    }

    public void addShapes() {
        shapeList.add(new OShape());
        shapeList.add(new IShape());
        shapeList.add(new JShape());
        shapeList.add(new LShape());
        shapeList.add(new SShape());
        shapeList.add(new ZShape());
        shapeList.add(new TShape());
        shapeList.add(new PShape());
        shapeList.add(new UShape());
        shapeList.add(new MiniShape());
    }
}