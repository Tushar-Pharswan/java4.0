package DSA.backtracking;

public class maze {
    static void start(int board[][], int row, int col, String ans){
        if(row==board.length-1 && col == board.length-1){
            System.out.println(ans);
            return;
        }

        if(board[row][col] == 0){
            return;
        }
        
        board[row][col] =0;

        if(row < board.length-1 ){
        start(board, row+1, col, ans+"D");
        }

        if(col <board.length-1 ){
        start(board, row, col+1, ans+"R");
        }

        if(row >0 ){
        start(board, row-1, col, ans+"U");
        }
        
        if(col>0 ){
        start(board, row, col-1, ans+"L");
        }

        board[row][col] = 1;
    }
    public static void main(String[] args) {
        int box[][]=
        {
            {1,1,1},
            {1,0,1},
            {1,0,1}
        };

        start(box, 0, 0, "");
    }    
}
