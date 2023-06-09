package DSA.recursion;

import java.util.Arrays;

public class arrayOcurenceReplace {
    // by recursion
    static int[] rec(int arr1[], int j, int key) {
        if (j == -1) {
            System.out.println(" not presnt ");
            return arr1;
        }
        if (arr1[j] == key) {
            arr1[j] = 5;
        }

        return rec(arr1, --j, key);
    }

    // by loop
    // static int[] loop(int arr[]) {
    //     int i = arr.length - 1;
    //     while (i >= 0) {
    //         if (arr[i] == 1) {
    //             arr[i] = 5;
    //         }
    //         i--;
    //     }
    //     System.out.println(Arrays.toString(arr));
    //     return arr;
    // }

    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 1, 3, 1, 2, 5 };
        // int size=arr.length;
        // System.out.println(loop(arr));
        // loop(arr);
       System.out.println( Arrays.toString(rec(arr, arr.length-1, 1)));
    }

}
