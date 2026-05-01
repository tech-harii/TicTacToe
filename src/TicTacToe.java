/**
@version 6.0
@author Hari
 */
/***
 * TicTacToe
 * UC6 places a player's symbol on the board at the given position.
 * This use case focuses on updating game state.
 */
public class TicTacToe {

    static char[][] board = new char[3][3];

    public static void main(String[] args) {

        placeMove(0, 0, 'X');   // corrected call
        System.out.println(board[0][0]);
    }
    static void placeMove(int row, int col, char symbol) {
        board[row][col] = symbol;
    }
}
