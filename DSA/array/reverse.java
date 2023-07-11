package DSA.array;

import java.lang.reflect.Array;
import java.util.Arrays;

import oops.calsses.test1.outside_subclass;

public class reverse {



    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4 };
        System.out.println(Arrays.toString(arr));

        //reversing
        int n =arr.length-1;

        // for(int i=0; i<arr.length/2; i++){
        //     int temp = arr[i];
        //     arr[i] = arr[n];
        //     // System.out.println(Arrays.toString(arr));
        //     arr[n] = temp;
            
        //     n--;
        int temp = arr[0];
            arr[0] = arr[n];
            // System.out.println(Arrays.toString(arr));
            arr[n] = temp;
        System.out.println(Arrays.toString(arr));
    }

}
