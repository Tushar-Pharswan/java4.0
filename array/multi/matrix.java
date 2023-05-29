package array.multi;

import java.util.Arrays;

public class matrix {
    static void simple(){
        int arr [][]=new int [][]{{1,2,3},{3,1,2},{2,3,1}};
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(+arr[i][j]+ " ");
            }
            System.out.println(" ");
        }
        // System.out.println(Arrays.deepToString(arr));
    }
    public static void main(String[] args) {
        simple();
    }
}
