package DSA.Sheet.Day1Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class SortAnArrayOf0s1sand2sQ75 {

    //optimal

    

/* 
    // Better
    public static void sortArray(ArrayList<Integer> arr, int n) {
        int count0 = 0, count1 = 0, count2 = 0;

        for (int i = 0; i < n; i++) {
            if (arr.get(i) == 0)
                count0++;
            else if (arr.get(i) == 1)
                count1++;
            else
                count2++;
        }
        // replace place
        for (int i = 0; i < count0; i++)
            arr.set(i, 0); // replacing 0's

        for (int i = count0; i < count0 + count1; i++)
            arr.set(i, 1); // replacing 1's

        for (int i = count0 + count1; i < n; i++)
            arr.set(i, 2); // replacing 2's
    }

    public static void main(String[] args) {
        int n = 6;
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[] { 0, 2, 1, 2, 0, 1 }));
        sortArray(arr, n);
        // for (int i = 0; i < n; i++) {
        //     System.out.print(arr.get(i) + " ");
        // }
        System.out.println(arr);
    }

    */
}
