package tdd.tictactoe.logic;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class Board {

    private static Map<Integer, String> board = new LinkedHashMap<>();

    public Board() {
        for (int i = 1; i < 10; i++) {
            board.put(i, "");
        }
    }

    public Map<Integer, String> getBoard() {
        return board;
    }
    
    public boolean checkIfBoardIsFull() {
        for (Map.Entry<Integer, String > entry : getBoard().entrySet()) {
            if (entry.getValue().equals("")) {
                return false;
            }
        }
        return true;
    }
    
    public void clearBoard() {
        for (Integer index : getBoard().keySet()) {
            board.put(index, "");
        }
    }

    public boolean isFieldEmpty(int index) {
        if (!board.get(index).equals("")){
            return false;
        }
        return true;
    }

    public void putRandomOnBoard() {
        while (true) {
           int randomIndex = ThreadLocalRandom.current().nextInt(1, 9);
           if (isFieldEmpty(randomIndex)) {
               board.put(randomIndex, "O");
               break;
           }
        }
    }

    public boolean isWin() {
        // Rows
        if (board.get(1).equals(board.get(2)) && board.get(2).equals(board.get(3))) {
            if (!board.get(1).equals("") && !board.get(2).equals("") && !board.get(3).equals("")) {
                return true;
            }
        }
        if (board.get(4).equals(board.get(5)) && board.get(5).equals(board.get(6))) {
            if (!board.get(4).equals("") && !board.get(5).equals("") && !board.get(6).equals("")) {
                return true;
            }
        }
        if (board.get(7).equals(board.get(8)) && board.get(8).equals(board.get(9))) {
            if (!board.get(7).equals("") && !board.get(8).equals("") && !board.get(9).equals("")) {
                return true;
            }
        }
        // Columns
        if (board.get(1).equals(board.get(4)) && board.get(4).equals(board.get(7))) {
            if (!board.get(1).equals("") && !board.get(4).equals("") && !board.get(7).equals("")) {
                return true;
            }
        }
        if (board.get(2).equals(board.get(5)) && board.get(5).equals(board.get(8))) {
            if (!board.get(2).equals("") && !board.get(5).equals("") && !board.get(8).equals("")) {
                return true;
            }
        }
        if (board.get(3).equals(board.get(6)) && board.get(6).equals(board.get(9))) {
            if (!board.get(3).equals("") && !board.get(6).equals("") && !board.get(9).equals("")) {
                return true;
            }
        }
        // Diagonal
        if (board.get(1).equals(board.get(5)) && board.get(5).equals(board.get(9))) {
            if (!board.get(1).equals("") && !board.get(5).equals("") && !board.get(9).equals("")) {
                return true;
            }
        }
        if (board.get(3).equals(board.get(5)) && board.get(5).equals(board.get(7))) {
            if (!board.get(3).equals("") && !board.get(5).equals("") && !board.get(7).equals("")) {
                return true;
            }
        }
        return false;
    }
}
