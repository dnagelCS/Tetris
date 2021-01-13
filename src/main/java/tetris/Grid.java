package tetris;

import tetris.shapes.AbstractShape;

import java.util.ArrayList;

public class Grid {
    public static final int WIDTH = 450;
    public static final int HEIGHT = 600;
    public static final int CELL_SIZE = 15;
    private final ShapeFactory factory;
    private AbstractShape currentShape;
    private ArrayList<Square> fixedSquares = new ArrayList<>();

    public Grid(ShapeFactory factory) {
        this.factory = factory;
        this.currentShape = factory.newInstance();
    }

    public boolean proceed() {
        if (!levelExceedsGrid()) {/*
            if (fullRow() >= 0) {
                removeRow(fullRow());
            }*/
            if (!shapeDown()) {
                lowerShape();
            } else {
                for (Square square : currentShape.getSquares()) {
                    square.setX((square.getX()*CELL_SIZE) + currentShape.getX());
                    square.setY(square.getY()*CELL_SIZE + currentShape.getY());
                    fixedSquares.add(square);
                }
                currentShape = factory.newInstance();
            }
            return true;
        } else return false;
    }

    public void lowerShape() {
        currentShape.move(0, CELL_SIZE);
    }

    public void dropShape() {
        while (!shapeDown()) {
            currentShape.move(0, CELL_SIZE);
        }
    }

    public void moveRight() {
        if(rightBound()) {
            currentShape.move(CELL_SIZE, 0);
        }
    }

    public void moveLeft() {
        if(leftBound()) {
            currentShape.move(-CELL_SIZE, 0);
        }
    }

    public void rotateClockwise() {
        currentShape.rotate();
    }
/*
    private int fullRow() {
        int fullRow = -1;
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                if (fixedSquares[row][col] == null) {
                    break;
                } else if (row == ROWS - 1) {
                    fullRow = row;
                    return fullRow;
                }
            }
        }
        return fullRow;
    }

    private void removeRow(int row) {
        for (int col = 0; col < COLS; col++) {
            fixedSquares[row][col] = null;
        }
    }
*/
    private boolean shapeDown() {
        ArrayList<Square> squaresList = currentShape.getSquares();
        for (Square shapeSquare : squaresList) {
            for(Square fixed : fixedSquares){
                if ((shapeSquare.getX() + currentShape.getX()) == fixed.getX() &&
                        (shapeSquare.getY() + currentShape.getY()) == (fixed.getY() - CELL_SIZE)) {
                    return true;
                }
            }
            if(shapeSquare.getY() + currentShape.getY() + CELL_SIZE == HEIGHT - CELL_SIZE)
            {
                return true;
            }
        }
        return false;
    }

    private boolean levelExceedsGrid() {
        for (Square square : fixedSquares) {
            if (square.getY() <= 0) {
                return true;
            }
        }
        return false;
    }

    private boolean leftBound() {
        ArrayList<Square> squaresList = currentShape.getSquares();
        for (Square shapeSquare : squaresList) {
            if (shapeSquare.getX() + currentShape.getX() < CELL_SIZE) {
                return false;
            }
        }
        return true;
    }

    private boolean rightBound() {
        ArrayList<Square> squaresList = currentShape.getSquares();
        for (Square shapeSquare : squaresList) {
            if (shapeSquare.getX() + currentShape.getX() > WIDTH - CELL_SIZE*2) {
                return false;
            }
        }
        return true;
    }

    public ArrayList<Square> getFixedSquares() {
        return fixedSquares;
    }

    public AbstractShape getCurrentShape() {
        return currentShape;
    }

    public static int getWidth() {
        return WIDTH;
    }

    public static int getHeight() {
        return HEIGHT;
    }

    public static int getCellSize() {
        return CELL_SIZE;
    }

}