package tetris;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TetrominoTest {

    @Test
    public void createOShape() {
        //given
        Tetromino tetromino = new Tetromino();

        //when
        List<Square> oShape = new ArrayList<>(tetromino.getOShape());

        //then
        assertEquals(4, oShape.size());
    }
}
