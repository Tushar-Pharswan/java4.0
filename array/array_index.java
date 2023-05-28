package array;

import java.util.Arrays;

public class array_index {

    static int arr[] = new int[] { 0, 1, 2, 21, 4, 5, 6, 7, 8, 9 };
    static char charr[] = new char[] { 'A', 'B', 'C', 'D', 'E', 'F' };

    public static void main(String[] args) {
        // System.out.println(Arrays.toString(arr));
        // System.out.println(charr);
        
        // //System.out.println("Element at index  " +3 +" : "+arr[3]);
        // for (int i=0 ; i<arr.length;i++){
        //     System.out.println("Element at index  " +i +" : "+arr[i]);
        // }

        int i=-0;
        while ( i<=arr.length){
            i++;
            System.out.println(" Element at index " +i +" is "  +arr[i]);
        }
        
    }
}
