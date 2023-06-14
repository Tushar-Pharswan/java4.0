package DSA.recursion;

import java.util.Arrays;

public class nInputReturnX {
    static int nMul(int sum, int no) {
        if (no == 0) {
            System.out.println("without arr " + sum);
            return sum;
        }
        sum = sum * (no % 10);
        no = no / 10;
        return nMul(sum, no);
    }

    static int[] nmul2(int arr[], int sum1, int i) {
        if (i == 0) {
            System.out.println("with arr " + sum1);
            return arr;
        }
        // int i=0;
        sum1 = sum1 * (arr[i] * arr[i + 1]);

        return nmul2(arr, sum1, --i);
    }

    static int[] abc(int arr[], int i){
        if(i == arr.length-1){
            return arr;
        }

        arr[i] = arr[i] * arr[i-1];

        return abc(arr, i+1);
    }

    public static void main(String[] args) {
        // nMul(1, 1234);
        int arr[] = new int[] { 1, 2, 3, 4,5,6 };
        //nmul2(arr, 1, arr.length - 2);
        System.out.println(Arrays.toString(abc(arr, 1)));
    }

}
