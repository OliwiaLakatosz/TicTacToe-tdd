package tdd.tictactoe.tdd.tictactoe.logic;

import java.util.LinkedHashMap;
import java.util.Map;

public class Board {

    private Map<Integer, String> board = new LinkedHashMap<Integer, String>();

    public Board() {
        for (int i = 1; i < 10; i++) {
            this.board.put(i, null);
        }
    }

    public Map<Integer, String> getBoard() {
        return board;
    }

}
