package DSA.recursion;

import java.util.ArrayList;

public class ocurencesIndexToNewArr {
    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 1, 3, 1, 2, 5 };
        ArrayList<Integer> arr2 = new ArrayList<>();
        
        int i = arr.length - 1;
        
        while (i >= 0) {
            if (arr[i] == 1) {
                arr2.add(i);
            }
            i--;
        }
        System.out.println(arr2);
    }

}
