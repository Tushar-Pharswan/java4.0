package DSA.array;

public class largest_no {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 8, 4, 9, 3, 5 };
        int index=0;
        int max = arr[0];
        int secondMax = arr[0];
        int thirdMax = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                index=i;
            }

        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != max) {
                if (secondMax < arr[i]) {
                    secondMax = arr[i];
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != secondMax && arr[i] != max) {
                if (thirdMax < arr[i]) {
                    thirdMax = arr[i];
                }
            }
        }

        System.out.println(max);
        System.out.println(index);
        System.out.println(secondMax);
        System.out.println(thirdMax);

    }

}
