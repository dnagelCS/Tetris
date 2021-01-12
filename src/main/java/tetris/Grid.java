package tetris;

import tetris.shapes.AbstractShape;

import java.util.ArrayList;

public class Grid {
    private boolean[][] grid;
    public static final int WIDTH = 100;
    public static final int HEIGHT = 40;
    public static final int CELL_SIZE = 10;
    private final ShapeFactory factory;
    private AbstractShape currentShape;
    public static final int ROWS = HEIGHT / CELL_SIZE;
    public static final int COLS = WIDTH / CELL_SIZE;
    private Square[][] fixedSquares = new Square[ROWS + 1][COLS];

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
                    fixedSquares[square.getY() + 1][square.getX()] = square;
                }
                currentShape = factory.newInstance();
            }
            return true;
        } else return false;
    }

    public void lowerShape() {
        currentShape.move(0, -1);
    }

    public void dropShape() {
        while (shapeDown()) {
            currentShape.move(0, -1);
        }
    }

    public void moveRight() {
        currentShape.move(1, 0);
    }

    public void moveLeft() {
        currentShape.move(-1, 0);
    }

    public void rotateClockwise() {
        currentShape.rotate();
    }

    private int fullRow() {
        int fullRow = -1;
        for (int row = 1; row < ROWS; row++) {
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
            int row = shapeSquare.getY() - CELL_SIZE;
            int col = shapeSquare.getX();
            if (fixedSquares[row][col] != null) {
                return true;
            }
            if(shapeSquare.getY() == HEIGHT - CELL_SIZE)
            {
                return true;
            }
        }
        return false;
    }

    private boolean levelExceedsGrid() {
        for (int col = 0; col < COLS; col++) {
            if (fixedSquares[0][col] != null) {
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
}