package tdd.tictactoe.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import tdd.tictactoe.logic.Board;

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
            Assert.assertEquals("", testBoard.get(position));
        }
    }

    @Test
    public void testCheckWinInFirstRow() {
        Map<Integer, String> testBoard = board.getBoard();
        testBoard.put(1, "X");
        testBoard.put(2, "X");
        testBoard.put(3, "X");
        testBoard.put(4, "O");
        testBoard.put(5, "X");
        testBoard.put(6, "O");
        testBoard.put(7, "O");
        testBoard.put(8, "O");
        testBoard.put(9, "X");
        Assert.assertTrue(board.isWin());
    }
    @Test
    public void testCheckWinInSecondRow() {
        Map<Integer, String> testBoard = board.getBoard();
        testBoard.put(4, "O");
        testBoard.put(5, "O");
        testBoard.put(6, "O");
        testBoard.put(1, "X");
        testBoard.put(2, "O");
        testBoard.put(3, "X");
        testBoard.put(7, "X");
        testBoard.put(8, "X");
        testBoard.put(9, "O");
        Assert.assertTrue(board.isWin());
    }

    @Test
    public void testCheckWinInThirdRow() {
        Map<Integer, String> testBoard = board.getBoard();
        testBoard.put(1, "X");
        testBoard.put(2, "O");
        testBoard.put(3, "X");
        testBoard.put(4, "X");
        testBoard.put(5, "X");
        testBoard.put(6, "O");
        testBoard.put(7, "O");
        testBoard.put(8, "O");
        testBoard.put(9, "O");
        Assert.assertTrue(board.isWin());
    }

    @Test
    public void testCheckIfThereIsNoWinInRow() {
        Map<Integer, String> testBoard = board.getBoard();
        testBoard.put(1, "X");
        testBoard.put(2, "O");
        testBoard.put(3, "X");
        testBoard.put(4, "X");
        testBoard.put(5, "O");
        testBoard.put(6, "O");
        testBoard.put(7, "O");
        testBoard.put(8, "X");
        testBoard.put(9, "X");
        Assert.assertFalse(board.isWin());
    }

    @Test
    public void testCheckWinInFirstColumn() {
        Map<Integer, String> testBoard = board.getBoard();
        testBoard.put(1, "X");
        testBoard.put(4, "X");
        testBoard.put(7, "X");
        Assert.assertTrue(board.isWin());
    }

    @Test
    public void testCheckWinInSecondColumn() {
        Map<Integer, String> testBoard = board.getBoard();
        testBoard.put(2, "X");
        testBoard.put(5, "X");
        testBoard.put(8, "X");
        Assert.assertTrue(board.isWin());
    }

    @Test
    public void testCheckWinInThirdColumn() {
        Map<Integer, String> testBoard = board.getBoard();
        testBoard.put(3, "X");
        testBoard.put(6, "X");
        testBoard.put(9, "X");
        Assert.assertTrue(board.isWin());
    }

    @Test
    public void testCheckWinInDiagonalWinLeft() {
        Map<Integer, String> testBoard = board.getBoard();
        testBoard.put(1, "X");
        testBoard.put(5, "X");
        testBoard.put(9, "X");
        Assert.assertTrue(board.isWin());
    }

    @Test
    public void testCheckWinInDiagonalWinRight() {
        Map<Integer, String> testBoard = board.getBoard();
        testBoard.put(3, "X");
        testBoard.put(5, "X");
        testBoard.put(7, "X");
        Assert.assertTrue(board.isWin());
    }

    @Test
    public void testCheckIfClearedBoardIsEmpty() {
        Map<Integer, String > testBoard = board.getBoard();
        testBoard.put(1, "X");
        testBoard.put(2, "O");
        testBoard.put(3, "X");
        testBoard.put(4, "X");
        testBoard.put(5, "O");
        testBoard.put(6, "X");
        testBoard.put(7, "X");
        testBoard.put(8, "O");
        testBoard.put(9, "O");
        board.clearBoard();
        for (Integer i : testBoard.keySet()) {
            Assert.assertEquals("", testBoard.get(i));
        }
    }

    @Test
    public void testCheckIfBoardIsFull() {
        Map<Integer, String > testBoard = board.getBoard();
        testBoard.put(1, "X");
        testBoard.put(2, "O");
        testBoard.put(3, "X");
        testBoard.put(4, "X");
        testBoard.put(5, "O");
        testBoard.put(6, "O");
        testBoard.put(7, "O");
        testBoard.put(8, "X");
        testBoard.put(9, "X");
        Assert.assertTrue(board.checkIfBoardIsFull());
    }

    @Test
    public void testCheckIfFieldIsEmpty() {
        Map<Integer, String > testBoard = board.getBoard();
        testBoard.put(1, "X");
        Assert.assertFalse(board.isFieldEmpty(1));
        Assert.assertTrue(board.isFieldEmpty(2));
    }
}
