package tdd.tictactoe;

import tdd.tictactoe.tdd.tictactoe.logic.Board;

import java.util.Map;

public class FlowController {

    private static Board boardObject = new Board();

    public static void clickButton() {
        Map<Integer, String> board = boardObject.getBoard();
        board.put(1, "X");
        System.out.println(board);
    }
}
