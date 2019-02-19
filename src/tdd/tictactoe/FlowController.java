package tdd.tictactoe;

import tdd.tictactoe.tdd.tictactoe.logic.Board;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

class FlowController {

    private static Board boardObject = new Board();
    private static Font font = new Font("Arial", Font.BOLD, 80);
    private static String[] PLAYER = {"O", "X"};
    private static Object[] options = {"Play Again", "Exit"};
    private static int playerIndex = 0;

    static void clickButton(Button button) {
        Map<Integer, String> board = boardObject.getBoard();
        playerIndex = (playerIndex + 1) % 2;
        String sign = PLAYER[playerIndex];
        board.put(button.getID(), sign);
        button.setEnabled(false);
        button.setText(sign);
        button.setFont(font);
        announceWinner(sign);
    }

    static void announceWinner(String winner) {
        if (boardObject.isWin()) {
            String msg = "Winner: " + winner;
            JOptionPane optionPane = new JOptionPane();
            int option = optionPane.showOptionDialog(BoardView.getMainWindow(), msg, "Game Over",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                    null, options, options[0]);
            if (option == 0) {
                playAgain();
            } else if (option == 1) {
                BoardView.getMainWindow().dispose();
            }

        }
    }

    static void playAgain() {
        // TODO: implement reinit method - clear board map and gui
        System.out.println("To be implemented!");
    }
}
