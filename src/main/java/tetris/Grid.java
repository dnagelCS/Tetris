package tetris;

import tetris.shapes.AbstractShape;

import java.util.ArrayList;

public class Grid {
    public static final int WIDTH = 300;
    public static final int HEIGHT = 600;
    public static final int CELL_SIZE = 30;
    public static final int COLS = WIDTH / CELL_SIZE;
    public static final int ROWS = HEIGHT / CELL_SIZE;
    private final ShapeFactory factory;
    private AbstractShape currentShape;
    private final Square[][] gridSquares = new Square[ROWS][COLS];

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
                    square.setX(square.getX() * CELL_SIZE + currentShape.getX());
                    square.setY(square.getY() * CELL_SIZE + currentShape.getY());
                    gridSquares[square.getY() / CELL_SIZE][square.getX() / CELL_SIZE] = square;
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
        if (rightBound()) {
            currentShape.move(CELL_SIZE, 0);
        }
    }

    public void moveLeft() {
        if (leftBound()) {
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
                if (gridSquares[row][col] == null) {
                    break;
                } else if (col == COLS - 1) {
                    fullRow = row;
                    return fullRow;
                }
            }
        }
        return fullRow;
    }

    private void removeRow(int row) {
        for (int col = 0; col < COLS; col++) {
            gridSquares[row][col] = null;
            for (int nextRow = row - 1; nextRow >= 0; nextRow--) {
                if (gridSquares[nextRow][col] != null) {
                    if (nextRow + 1 < ROWS - 1) {
                        if (gridSquares[nextRow + 1][col] == null) {
                            gridSquares[nextRow + 1][col] = gridSquares[nextRow][col];
                            gridSquares[nextRow][col] = null;
                        } else gridSquares[row - 1][col] = gridSquares[nextRow][col];
                    } else gridSquares[row - 1][col] = gridSquares[nextRow][col];

                }
            }
        }
    }

    private boolean shapeDown() {
        ArrayList<Square> squaresList = currentShape.getSquares();
        for (Square shapeSquare : squaresList) {
            int xVal = shapeSquare.getX() * CELL_SIZE + currentShape.getX();
            int yVal = shapeSquare.getY() * CELL_SIZE + currentShape.getY() + CELL_SIZE;
            if (gridSquares[yVal / CELL_SIZE][xVal / CELL_SIZE] != null) {
                return true;
            } else if (yVal == HEIGHT - CELL_SIZE) {
                return true;
            }
        }
        return false;
    }

    private boolean levelExceedsGrid() {
        for (int x = 0; x < COLS; x++) {
            if (gridSquares[0][x] != null) return true;
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
            if (shapeSquare.getX() + currentShape.getX() > WIDTH - CELL_SIZE * 2) {
                return false;
            }
        }
        return true;
    }

    public Square[][] getGridSquares() {
        return gridSquares;
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