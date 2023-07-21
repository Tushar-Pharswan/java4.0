package DSA.Sheet.Day1Arrays;

import java.util.ArrayList;
import java.util.List;

class Solution {

    class Pair {
        int row;
        int col;

        public Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    // public ArrayList<Pair> indeci(int[][] matrix) {
    //     ArrayList<Pair> zeroes = new ArrayList<>();
    //     for (int i = 0; i < matrix.length; i++) {
    //         for (int j = 0; j < matrix[0].length; j++) {
    //             if (matrix[i][j] == 0) {
    //                 zeroes.add(new Pair(i, j));
    //             }
    //         }
    //     }
    //     return zeroes;
    // }
    public void setZeroe(int[][] matrix) {
         // Find the zero elements and store their indices in the custom Pair class.
         List<pairr> zeroIndices = new ArrayList<>();
         for(int i= 0 ; i<matrix.length;i++){
             for(int j = 0 ; j<matrix[0].length;j++){
                 if(matrix[i][j]==0){
                     zeroIndices.add(new pairr(i,j));
                 }
             }
         }
        // Set entire row and column to zero based on the stored indices.

         for (pairr pair : zeroIndices) {
            int row = pair.row;
            int col = pair.col;

            // Set entire row to zero.
            for (int j = 0; j <matrix[0].length; j++) {
                matrix[row][j] = 0;
            }

            // Set entire column to zero.
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][col] = 0;
            }
        }

         return ;
    }
    
}

