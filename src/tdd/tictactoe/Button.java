package tdd.tictactoe;

import javax.swing.*;

public class Button extends JButton {
    private int ID;

    public Button(int id, String text) {
        super(text);
        this.ID = id;
    }

    public int getID() {
        return ID;
    }
}
