package DSA.recursion;

import java.util.Arrays;

public class arrayOcurenceReplace {
    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 1, 3, 1, 2, 5 };
        
        int i = arr.length - 1;
        
        while (i >= 0) {
            if (arr[i] == 1) {
                arr[i]=5;
                
            }
            i--;
        }
        System.out.println(Arrays.toString(arr));
    }
    
}
