package tetris;

import java.util.ArrayList;

public class Grid {
    public static final int WIDTH = 100;
    public static final int HEIGHT = 400;

    public static final int CELL_SIZE = 15;

    private final Tetromino tetro;

    public Grid(Tetromino tetro)
    {
        this.tetro = tetro;
    }

    public void lowerShape()
    {
        ArrayList<Square> shape = tetro.getFallingShape();
        for(Square square : shape)
        {
            square.setY(square.getY() - CELL_SIZE);
        }
    }

    public void dropShape()
    {
        ArrayList<Square> shape = tetro.getFallingShape();
        while(!shapeDown()) {
            for (Square square : shape) {
                square.setY(square.getY() - CELL_SIZE);
            }
        }
    }

    public void moveRight()
    {
        ArrayList<Square> shape = tetro.getFallingShape();
        for(Square square : shape)
        {
            square.setX(square.getX() + CELL_SIZE);
        }
    }

    public void moveLeft()
    {
        ArrayList<Square> shape = tetro.getFallingShape();
        for(Square square : shape)
        {
            square.setX(square.getX() - CELL_SIZE);
        }
    }

    public void removeRow(int row)
    {
        ArrayList<ArrayList<Square>> stillShapes = tetro.getStillShapes();
        for(ArrayList<Square> shape : stillShapes)
        {
            for(Square square : shape)
            {
                if(square.getY() == row)
                {
                    tetro.removeSquare();
                }
            }
        }
    }

    private boolean shapeDown()
    {
        ArrayList<ArrayList<Square>> stillShapes = tetro.getStillShapes();
        ArrayList<Square> fallingShape = tetro.getFallingShape();
        Square bottom = tetro.getShapeBottom(fallingShape);
        for(ArrayList<Square> shape : stillShapes)
        {
            for(Square square : shape)
            {
                if(square.getX() == bottom.getX() && square.getY() == bottom.getY() - CELL_SIZE)
                {
                    return true;
                }
            }
        }
        return false;
    }

    public int currentLevel()
    {
        int highestY = 0;
        for(ArrayList<Square> shape : tetro.getStillShapes())
        {
            for(Square square : shape)
            {
                if(square.getY() > highestY)
                {
                    highestY = square.getY();
                }
            }
        }
        return highestY;
    }
}
