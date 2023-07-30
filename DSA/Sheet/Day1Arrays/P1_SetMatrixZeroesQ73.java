package DSA.Sheet.Day1Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//custom class for optimized 
class pairr {
    int row;
    int col;

    public pairr(int row, int col) {
        this.row=row;
        this.col = col;
    }
}

public class P1_SetMatrixZeroesQ73 {

    //optimized

    public static int [][]setZero(int matrix[][]){
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

         return matrix;
     }
     public static void main(String[] args) {
        int matrix[][]={
            {1,1,1},
            {1,0,1},
            {1,1,1}
        };

        int [][] finalMatrix = setZero(matrix);

        // idhr finalMatrix [][] (shreyshi ko he aayega ye "zero") 2d array hai
        // use  hum single  row[] array bna re
        // or fhir use hum normal integer bna re   1 0 1   0 0 0  1 0 1 
        for (int[] row : finalMatrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    }



    //Brute force
    
    /* 
    
    static void markRow(ArrayList<ArrayList<Integer>> matrix, int n, int m, int i) {
        // set all non-zero elements as -1 in the row i:
        for (int j = 0; j < m; j++) {
            if (matrix.get(i).get(j) != 0) {
                matrix.get(i).set(j, -1);
            }
        }
    }

    static void markCol(ArrayList<ArrayList<Integer>> matrix, int n, int m, int j) {
        // set all non-zero elements as -1 in the col j:
        for (int i = 0; i < n; i++) {
            if (matrix.get(i).get(j) != 0) {
                matrix.get(i).set(j, -1);
            }
        }
    }

    static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, int n, int m) {
        // Set -1 for rows and cols that contains 0. Don't mark any 0 as -1:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix.get(i).get(j) == 0) {
                    markRow(matrix, n, m, i);
                    markCol(matrix, n, m, j);
                }
            }
        }
        // Finally, mark all -1 as 0:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix.get(i).get(j) == -1) {
                    matrix.get(i).set(j, 0);
                }
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 0, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));

        int n = matrix.size();
        int m = matrix.get(0).size();

        ArrayList<ArrayList<Integer>> ans = zeroMatrix(matrix, n, m);

        System.out.println("The Final matrix is: ");
        for (ArrayList<Integer> row : ans) {
            for (Integer ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }

    */


//}