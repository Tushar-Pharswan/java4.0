package DSA.Sheet.Day2ArraysPart2;

import java.util.Arrays;

public class FindTheDuplicateInAnArrayOfNplus1integers {
    // Problem Statement: Given an array of N + 1 size, where each element is
    // between 1 and N. Assuming there is only one duplicate number, your task is to
    // find the duplicate number.

    //optimized

    

    // Better
/* 
    static int duplicate(int[] arr) {
        int n = arr.length+2;
        int freq[] = new int[n + 1];
        for (int i = 0; i < n; i++) {
            if (freq[arr[i]] == 0) {
                freq[arr[i]] += 1;
            } else {
                return arr[i];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 7, 3 };
        System.out.println(duplicate(arr));
    }

    */


    /*
     * //Brute
     * 
     * static int duplicate(int[] arr){
     * Arrays.sort(arr);
     * for(int i=0;i<arr.length-1;i++){
     * if(arr[i]==arr[i+1]){
     * return arr[i];
     * }
     * }
     * return 0;
     * }
     * public static void main(String[] args) {
     * int arr[]={1,4,8,6,2,3,5,4};
     * System.out.println(duplicate(arr));
     * }
     * 
     */
}
