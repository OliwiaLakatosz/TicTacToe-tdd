package tdd.tictactoe;

import javax.swing.*;
import java.awt.*;

public class BoardView {
    private static JFrame mainWindow;
    private Button b1, b2, b3, b4, b5, b6, b7, b8, b9;

    BoardView() {
        mainWindow = new JFrame();
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setSize(400, 400);

        mainWindow.setLayout(new GridLayout(1, 1));
        JPanel buttonPanel = createButtonsPanel();
        mainWindow.add(buttonPanel);

        mainWindow.setTitle("TicTacToe");
        mainWindow.setVisible(true);
    }

    public static JFrame getMainWindow() {
        return mainWindow;
    }

    private JPanel createButtonsPanel() {
        JPanel buttons = new JPanel();

        b1 = new Button(1,"");
        b2 = new Button(2,"");
        b3 = new Button(3,"");
        b4 = new Button(4,"");
        b5 = new Button(5,"");
        b6 = new Button(6,"");
        b7 = new Button(7,"");
        b8 = new Button(8,"");
        b9 = new Button(9,"");

        buttons.add(b1);
        buttons.add(b2);
        buttons.add(b3);
        buttons.add(b4);
        buttons.add(b5);
        buttons.add(b6);
        buttons.add(b7);
        buttons.add(b8);
        buttons.add(b9);

        b1.addActionListener(e -> FlowController.clickButton(b1));
        b2.addActionListener(e -> FlowController.clickButton(b2));
        b3.addActionListener(e -> FlowController.clickButton(b3));
        b4.addActionListener(e -> FlowController.clickButton(b4));
        b5.addActionListener(e -> FlowController.clickButton(b5));
        b6.addActionListener(e -> FlowController.clickButton(b6));
        b7.addActionListener(e -> FlowController.clickButton(b7));
        b8.addActionListener(e -> FlowController.clickButton(b8));
        b9.addActionListener(e -> FlowController.clickButton(b9));

        buttons.setLayout(new GridLayout(3, 3));
        return buttons;
    }
}
