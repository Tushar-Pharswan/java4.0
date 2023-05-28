package array;

import java.util.Arrays;
import java.util.Scanner;

public class add {
    // static void addArray() {
    // int arrAdd[] = new int[5];

    // Scanner sc = new Scanner(System.in);

    // int sum = 0;
    // int i = 0;

    // while (i < 5) {
    // arrAdd[i] = sc.nextInt();
    // sum = sum + arrAdd[i];
    // i++;
    // }
    // System.out.println(Arrays.toString(arrAdd));
    // System.out.println("sum is " + sum);

    // }

    static void forAdd() {
        int addFor[] = new int[5];
        Scanner digit = new Scanner(System.in);
        int sum = 0;
        int i = 0;
        System.out.println("Enter the Digits ");

        for (i = 0; i < 5; i++)
        {

            addFor[i] = digit.nextInt();
            sum = sum + addFor[i];
        }
        System.out.println(Arrays.toString(addFor));
        System.out.println("Sum of array digits is " + sum);
    }

    public static void main(String[] args) {
        // addArray();
        forAdd();
    }

}
