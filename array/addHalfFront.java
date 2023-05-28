package array;

import java.util.Arrays;

public class addHalfFront {
    static void half() {
        int arr[] = new int[] { 1, 2, 3, 4, 5, 6 };
        System.out.println(Arrays.toString(arr));
        int sum = 0;
        int i;
        int center = arr.length / 2;

        if (arr.length % 2 == 0) {
            for (i = center-1; i>=0; i--) {
                sum = sum + arr[i];
            }

            // for (i = 0; i<center; i++) {
            //     System.out.println(i);
            //     sum = sum + arr[i];

            // }




            System.out.println("sum is "+sum);

        } else {
            System.out.println("hii");
        }
    }

    public static void main(String[] args) {
        half();
    }
}
