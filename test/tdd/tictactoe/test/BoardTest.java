package tdd.tictactoe.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import tdd.tictactoe.tdd.tictactoe.logic.Board;

import java.util.LinkedHashMap;
import java.util.Map;

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
        Map<Integer, String> testBoard = board.getBoard();
        for (Integer position : testBoard.keySet()) {
            Assert.assertNull(testBoard.get(position));
        }
    }

    @Test
    public void testCheckWinInRow() {
        Map<Integer, String> testBoard = board.getBoard();
        testBoard.put(1, "X");
        testBoard.put(2, "X");
        testBoard.put(3, "X");
        Assert.assertTrue(board.isWin());
    }
}
