package tetris;

import java.util.ArrayList;

public class Grid {
    private boolean[][] grid;
    public static final int WIDTH = 100;
    public static final int HEIGHT = 40;
    public static final int CELL_SIZE = 10;
    private final ShapeFactory factory;
    private TetrisShape currentShape;
    private final int rows = HEIGHT / CELL_SIZE;
    private final int cols = WIDTH / CELL_SIZE
    private Square[][] fixedSquares = new Square[rows + 1][cols];

    public Grid(ShapeFactory factory) {
        this.factory = factory;
        this.currentShape = factory.getCurrentShape();
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
                currentShape = factory.generateRandomShape();
            }
            return true;
        } else return false;
    }

    private void lowerShape() {
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

    public void rotateClockwise()
    {
        currentShape.rotate();
    }

    private int fullRow() {
        int fullRow = -1;
        for (int row = 1; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (fixedSquares[row][col] == null) {
                    break;
                } else if (row == rows - 1) {
                    fullRow = row;
                    return fullRow;
                }
            }
        }
        return fullRow;
    }

    private void removeRow(int row) {
        for (int col = 0; col < cols; col++) {
            fixedSquares[row][col] = null;
        }
    }

    private boolean shapeDown() {
        ArrayList<Square> squaresList = currentShape.getSquares();
        for (Square shapeSquare : squaresList) {
            for (int row = 1; row < rows; row++) {
                for (int col = 0; col < cols; col++) {
                    if (fixedSquares[row][col] != null) {
                        Square fixedSquare = fixedSquares[row][col];
                        if (shapeSquare.getX() == fixedSquare.getX() && shapeSquare.getY() == fixedSquare.getY() - CELL_SIZE) {
                            return true;
                        }
                    }
                }
            }
            if(shapeSquare.getY() == HEIGHT - 10)
            {
                return true;
            }
        }
        return false;
    }

    private boolean levelExceedsGrid() {
        for (int col = 0; col < cols; col++) {
            if (fixedSquares[0][col] != null) {
                return false;
            }
        }
        return true;
    }
}
