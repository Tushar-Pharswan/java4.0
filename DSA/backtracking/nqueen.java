package DSA.backtracking;

import java.util.Arrays;

public class nqueen {

    static boolean isSafe(boolean board[][], int row, int col) {

        //queen up check

        for (int i = row; i >= 0; i--) {
            if (board[i][col] == true) {
                return false;
            }
        }
        //diagonal left

        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == true) {
                return false;
            }
        }
        //diagonal right

        for (int i = row, j = col; i >= 0 && j < board[row].length; i--, j++) {
            if (board[i][j] == true) {
                return false;
            }
        }

        return true;
    }

    static void queen(boolean board[][], int row) {

        if (row == board.length) {
            for (boolean[] arr : board) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println();
            return;
        }

        for (int col = 0; col < board[row].length; col++) {
            if (isSafe(board, row, col) == true) {
                board[row][col] = true;
                queen(board, row + 1);
                board[row][col] = false;
            }
        }

    }

    public static void main(String[] args) {
        boolean board[][] = {
                { false, false, false, false },
                { false, false, false, false },
                { false, false, false, false },
                { false, false, false, false }
        };

        queen(board, 0);
    }
}
