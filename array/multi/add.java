package array.multi;

import java.util.Arrays;

public class add {
    static void two() {
        int arr1[][] = new int[][] { { 1, 1, 1 }, { 1, 1, 1 } };

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

        int arr2[][] = new int[][] { { 1, 1, 1 }, { 1, 1, 1 } };
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3;j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        int arr3[][] = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(arr3[i][j] + " ");
            }

            // System.out.println(Arrays.deepToString(arr3));
            System.out.println();
        }

    }

    public static void main(String[] args) {
        two();
    }
}
