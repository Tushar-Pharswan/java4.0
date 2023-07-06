package DSA.array;

import java.util.ArrayList;

import DSA.recursion.countOccurance;

public class pairSum {
    //traget = 9

    static void pairs(int arr[], int target){
        // int arr[]={2,7,11,15};
        // int sum=9;
        // for(int i=0;i<=arr.length;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[i]+arr[j]==sum){
        //             System.out.println(arr[i]);
        //         }
        //     }
        // }
        // return pairs(a, b);
        int count =0;

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] + arr[i+1] == target){
                count++;
               list.add(i);
               list.add(i+1);
            }
        }

       // System.out.println(list);
       System.out.println(count);

    }
    public static void main(String[] args) {
        
        int arr[] = {4,5,8,6,7,2};
        pairs(arr, 9);
    }
    
}
