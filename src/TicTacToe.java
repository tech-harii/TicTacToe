/**
@version 8.0
@author Harii
 */
public class TicTacToe {

    static boolean isHumanTurn = true;
    static boolean gameOver = false;

    public static void main(String[] args) {

        while (!gameOver) {

            if (isHumanTurn) {
                System.out.println("Human Turn");
            } else {
                System.out.println("Computer Turn");
            }

            if (checkWin() || checkDraw()) {
                gameOver = true;
            } else {
                // switch turn
                isHumanTurn = !isHumanTurn;
            }
        }

        System.out.println("Game Over");
    }

    static boolean checkWin() {
        return false;
    }

    static boolean checkDraw() {
        return false;
    }
}