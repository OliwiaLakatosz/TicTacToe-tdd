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
            Assert.assertEquals("", testBoard.get(position));
        }
    }

    @Test
    public void testCheckWinInFirstRow() {
        Map<Integer, String> testBoard = board.getBoard();
        testBoard.put(1, "X");
        testBoard.put(2, "X");
        testBoard.put(3, "X");
        System.out.println(testBoard);
        Assert.assertTrue(board.isWin());
    }
    @Test
    public void testCheckWinInSecondRow() {
        Map<Integer, String> testBoard = board.getBoard();
        testBoard.put(4, "Y");
        testBoard.put(5, "Y");
        testBoard.put(6, "Y");
        System.out.println(testBoard);
        Assert.assertTrue(board.isWin());
    }

    @Test
    public void testCheckWinInThirdRow() {
        Map<Integer, String> testBoard = board.getBoard();
        testBoard.put(7, "X");
        testBoard.put(8, "X");
        testBoard.put(9, "X");
        System.out.println(testBoard);
        Assert.assertTrue(board.isWin());
    }

    @Test
    public void testCheckIfThereIsNoWinInRow() {
        Map<Integer, String> testBoard = board.getBoard();
        testBoard.put(1, "X");
        testBoard.put(2, "Y");
        testBoard.put(3, "X");
        System.out.println(testBoard);
        Assert.assertFalse(board.isWin());
    }

    @Test
    public void testCheckWinInFirstColumn() {
        Map<Integer, String> testBoard = board.getBoard();
        testBoard.put(1, "X");
        testBoard.put(4, "X");
        testBoard.put(7, "X");
        System.out.println(testBoard);
        Assert.assertTrue(board.isWin());
    }

    @Test
    public void testCheckWinInSecondColumn() {
        Map<Integer, String> testBoard = board.getBoard();
        testBoard.put(2, "X");
        testBoard.put(5, "X");
        testBoard.put(8, "X");
        System.out.println(testBoard);
        Assert.assertTrue(board.isWin());
    }

    @Test
    public void testCheckWinInThirdColumn() {
        Map<Integer, String> testBoard = board.getBoard();
        testBoard.put(3, "X");
        testBoard.put(6, "X");
        testBoard.put(9, "X");
        System.out.println(testBoard);
        Assert.assertTrue(board.isWin());
    }

    @Test
    public void testCheckWinInDiagonalWinLeft() {
        Map<Integer, String> testBoard = board.getBoard();
        testBoard.put(1, "X");
        testBoard.put(5, "X");
        testBoard.put(9, "X");
        System.out.println(testBoard);
        Assert.assertTrue(board.isWin());
    }

    @Test
    public void testCheckWinInDiagonalWinRight() {
        Map<Integer, String> testBoard = board.getBoard();
        testBoard.put(3, "X");
        testBoard.put(5, "X");
        testBoard.put(7, "X");
        System.out.println(testBoard);
        Assert.assertTrue(board.isWin());
    }
}
