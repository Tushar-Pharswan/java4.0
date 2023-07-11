package DSA.array;

import java.util.Arrays;

public class leftRotation {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n =arr.length-1;
        int temp=arr[0];
        System.out.println(temp);
        for(int i=0;i<n;i++){
            arr[i]=arr[i+1];
            if(i == arr.length){
                arr[i] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    
}
