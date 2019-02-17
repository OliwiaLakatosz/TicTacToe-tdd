package tdd.tictactoe;

import javax.swing.*;
import java.awt.*;

public class BoardView {
    private static JFrame mainWindow;
    private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9;

    public BoardView() {
        mainWindow = new JFrame();
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setSize(400, 400);

        mainWindow.setLayout(new GridLayout(1, 1));
        JPanel buttonPanel = createButtonsPanel();
        mainWindow.add(buttonPanel);

        mainWindow.setTitle("TicTacToe");
        mainWindow.setVisible(true);
    }

    private JPanel createButtonsPanel() {
        JPanel buttons = new JPanel();

        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");

        buttons.add(b1);
        buttons.add(b2);
        buttons.add(b3);
        buttons.add(b4);
        buttons.add(b5);
        buttons.add(b6);
        buttons.add(b7);
        buttons.add(b8);
        buttons.add(b9);

        buttons.setLayout(new GridLayout(3, 3));
        return buttons;
    }
}
