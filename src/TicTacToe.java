/**
@version 7.0
@author Harii
 */
import java.util.Random;

public class TicTacToe {

    static char[][] board = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
    };

    static char computerSymbol = 'O';

    public static void main(String[] args) {
        computerMove();
        printBoard();
    }

    static void computerMove() {
        Random rand = new Random();
        int slot, row, col;

        while (true) {
            slot = rand.nextInt(9) + 1;  // 1–9

            row = getRowFromSlot(slot);
            col = getColFromSlot(slot);

            if (isValidMove(row, col)) {
                placeMove(row, col, computerSymbol);
                break;
            }
        }
    }

    // UC4: slot → row
    static int getRowFromSlot(int slot) {
        return (slot - 1) / 3;
    }

    // UC4: slot → col
    static int getColFromSlot(int slot) {
        return (slot - 1) % 3;
    }

    // UC5: validation
    static boolean isValidMove(int row, int col) {
        if (row < 0 || row > 2 || col < 0 || col > 2) return false;
        return board[row][col] == '-';
    }

    // UC6: place move
    static void placeMove(int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    // Utility: print board
    static void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }
}