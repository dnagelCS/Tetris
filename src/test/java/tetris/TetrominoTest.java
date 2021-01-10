package tetris;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TetrominoTest {

    @Test
    public void getCurrentShape() {
        //given
        Tetromino tetromino = new Tetromino();
        tetromino.addRandomShape();

        //when
        tetromino.getCurrentShape();

        //then
        assertTrue(tetromino.getShapesList().contains(tetromino.getCurrentShape()));
    }
}
