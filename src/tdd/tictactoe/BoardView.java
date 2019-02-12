package tdd.tictactoe;

import javax.swing.*;

public class BoardView {
    private static JFrame mainWindow;

    public BoardView() {
        mainWindow = new JFrame();
        mainWindow.setSize(400, 500);
        mainWindow.setLayout(null);
        mainWindow.setVisible(true);
    }
}
