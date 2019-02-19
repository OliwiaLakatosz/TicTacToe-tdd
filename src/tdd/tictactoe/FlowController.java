package tdd.tictactoe;

import tdd.tictactoe.tdd.tictactoe.logic.Board;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

class FlowController {

    private static Board boardObject = new Board();
    private static Font font = new Font("Arial", Font.BOLD, 80);
    private static String[] PLAYER = {"O", "X"};
    private static int playerIndex = 0;

    static void clickButton(Button button) {
        Map<Integer, String> board = boardObject.getBoard();
        playerIndex = (playerIndex + 1) % 2;
        String sign = PLAYER[playerIndex];
        board.put(button.getID(), sign);
        button.setEnabled(false);
        button.setText(sign);
        button.setFont(font);
        System.out.println(boardObject.isWin());
        System.out.println(board);
        announceWinner(sign);
    }

    static void announceWinner(String winner) {
        if (boardObject.isWin()) {
            String msg = "Winner: " + winner;
            JOptionPane.showMessageDialog(BoardView.getMainWindow(), msg);
        }
    }
}
