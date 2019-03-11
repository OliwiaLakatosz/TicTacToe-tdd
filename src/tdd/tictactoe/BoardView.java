package tdd.tictactoe;

import javax.swing.*;
import java.awt.*;

public class BoardView {
    private static JFrame mainWindow;
    private JPanel buttonPanel;
    private static Button[] buttons = {
        new Button(1, ""),
        new Button(2, ""),
        new Button(3, ""),
        new Button(4, ""),
        new Button(5, ""),
        new Button(6, ""),
        new Button(7, ""),
        new Button(8, ""),
        new Button(9, "")
    };

    public static Button[] getButtons() {
        return buttons;
    }

    public static JFrame getMainWindow() {
        return mainWindow;
    }

    BoardView() {
        mainWindow = new JFrame();
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setSize(400, 400);

        mainWindow.setLayout(new GridLayout(1, 1));
        buttonPanel = createButtonsPanel();
        mainWindow.add(buttonPanel);

        mainWindow.setTitle("TicTacToe");
        mainWindow.setVisible(true);
    }

    public JPanel getButtonPanel() {
        return buttonPanel;
    }

    private JPanel createButtonsPanel() {
        JPanel buttons = new JPanel();
        Button[] list = getButtons();

        for (Button btn : getButtons()) {
            buttons.add(btn);
        }

        for (Button btn : list) {
            btn.addActionListener(e -> {
                ConnectWithButton model = new ConnectWithButton();
                model.setID(btn.getID());
            });
        }

        buttons.setLayout(new GridLayout(3, 3));
        return buttons;
    }
}
