package tdd.tictactoe;

import javax.swing.*;

class Button extends JButton {
    private int ID;

    Button(int id, String text) {
        super(text);
        this.ID = id;
    }

    int getID() {
        return ID;
    }
}
