package tdd.tictactoe;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class BoardView {
    private static JFrame mainWindow;
    private JPanel buttonPanel;

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

    public static JFrame getMainWindow() {
        return mainWindow;
    }

    private JPanel createButtonsPanel() {
        JPanel buttons = new JPanel();
        List<Button> buttonsList = new ArrayList<>();

        Button b1 = new Button(1, "");
        Button b2 = new Button(2, "");
        Button b3 = new Button(3, "");
        Button b4 = new Button(4, "");
        Button b5 = new Button(5, "");
        Button b6 = new Button(6, "");
        Button b7 = new Button(7, "");
        Button b8 = new Button(8, "");
        Button b9 = new Button(9, "");

        buttonsList.add(b1);
        buttonsList.add(b2);
        buttonsList.add(b3);
        buttonsList.add(b4);
        buttonsList.add(b5);
        buttonsList.add(b6);
        buttonsList.add(b7);
        buttonsList.add(b8);
        buttonsList.add(b9);

        for (Button btn : buttonsList) {
            buttons.add(btn);
        }

        for (Button btn : buttonsList)
            btn.addActionListener(e -> {
                FlowController.clickButton(btn);
            });

        buttons.setLayout(new GridLayout(3, 3));
        return buttons;
    }
}
