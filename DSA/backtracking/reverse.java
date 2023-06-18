package DSA.backtracking;

import java.lang.reflect.Array;
import java.util.Arrays;

import oops.calsses.test1.outside_subclass;

public class reverse {



    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4 };
        System.out.println(Arrays.toString(arr));

        //reversing
        int n =arr.length-1;

        for(int i=0; i<arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[n];
            arr[n] = temp;
            n--;
        }

        // int start = 0, end = arr.length-1;

        // while(start < end){
        //     int temp = arr[start];
        //     arr[start] = arr[end];
        //     arr[end] = temp;
        //     start++; end--;
        // }

        System.out.println(Arrays.toString(arr));
    }

}
