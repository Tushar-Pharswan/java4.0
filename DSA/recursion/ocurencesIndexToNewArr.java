package DSA.recursion;

import java.util.ArrayList;

public class ocurencesIndexToNewArr {

    //recursion 

    static int[] replace(int[] arr3, int i, ArrayList<Integer> arr4) {
        if (i == arr3.length ) {
            System.out.println("By recursion" + arr4);
            return arr3;
        }
        if (arr3[i] == 1) {
            arr4.add(i);
        }

        return replace(arr3, i+1, arr4);

    }

    public static void main(String[] args) {
        // int arr[] = new int[] { 1, 2, 1, 3, 1, 2, 5 };
        // ArrayList<Integer> arr2 = new ArrayList<>();
        
        // int i = arr.length - 1;
        
        // while (i >= 0) {
        //     if (arr[i] == 1) {
        //         arr2.add(i);
        //     }
        //     i--;
        // }
        // System.out.println("By loop "+arr2);

        //recursion
        int arr3[] = new int[] { 1, 2, 1, 3, 1, 2, 1 };
        ArrayList<Integer> arr4 = new ArrayList<>();
        

        replace(arr3, 0, arr4);

    }

}
