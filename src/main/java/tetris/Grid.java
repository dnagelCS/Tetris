package tetris;

import tetris.shapes.AbstractShape;

import java.util.ArrayList;

public class Grid {
    public static final int WIDTH = 450;
    public static final int HEIGHT = 600;
    public static final int CELL_SIZE = 15;
    private final ShapeFactory factory;
    private AbstractShape currentShape;
    public static final int ROWS = HEIGHT/CELL_SIZE;
    public static final int COLS = WIDTH/CELL_SIZE;
    private Square[][] fixedSquares = new Square[ROWS][COLS];

    public Grid(ShapeFactory factory) {
        this.factory = factory;
        this.currentShape = factory.newInstance();
    }

    public boolean proceed() {
        if (!levelExceedsGrid()) {
            if (fullRow() >= 0) {
                removeRow(fullRow());
            }
            if (!shapeDown()) {
                lowerShape();
            } else {
                for (Square square : currentShape.getSquares()) {
                    fixedSquares[(square.getY() + currentShape.getY())/CELL_SIZE]
                            [(square.getX() + currentShape.getX())/CELL_SIZE] = square;
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

    private boolean shapeDown() {
        ArrayList<Square> squaresList = currentShape.getSquares();
        for (Square shapeSquare : squaresList) {
            int row = (shapeSquare.getY() + currentShape.getY() + CELL_SIZE)/CELL_SIZE;
            int col = (shapeSquare.getX() + currentShape.getX())/CELL_SIZE;
            if(row >= 0) {
                if (fixedSquares[row][col] != null) {
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
        for (int col = 0; col < COLS; col++) {
            if (fixedSquares[0][col] != null) {
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
            if (shapeSquare.getX() + currentShape.getX() + CELL_SIZE > WIDTH - CELL_SIZE) {
                return false;
            }
        }
        return true;
    }

    public Square[][] getFixedSquares() {
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