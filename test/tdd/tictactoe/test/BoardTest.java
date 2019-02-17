package tdd.tictactoe.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import tdd.tictactoe.tdd.tictactoe.logic.Board;

public class BoardTest {

    private Board board;
    @Before
    public void createBoardForTest() {
       board = new Board();
    }

    @Test
    public void testCheckIfCreatedBoardHasNineKeys() {
        Assert.assertEquals(9, board.getBoard().size());
    }

    @Test
    public void testCheckIfCreatedBoardIsEmpty() {
        for (Integer position : board.getBoard().keySet()) {
            Assert.assertNull(board.getBoard().get(position));
        }
    }
}
