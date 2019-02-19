package tdd.tictactoe;

import tdd.tictactoe.tdd.tictactoe.logic.Board;

import java.awt.*;
import java.util.Map;

public class FlowController {

    private static Board boardObject = new Board();
    private static Font font = new Font("Arial", Font.BOLD, 80);

    public static void clickButton(Button button) {
        Map<Integer, String> board = boardObject.getBoard();
        String sign = "X";
        board.put(button.getID(), "X");
        button.setEnabled(false);
        button.setText("X");
        button.setFont(font);
        System.out.println(board);
    }
}
