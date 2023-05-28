package array;

public class customAdd {
    static void custom() {
        int arr[] = new int[] { 1, 2, 3, 4, 5, 6 };
        int sum = 0;
        int size = (arr.length / 2);

        if (arr.length % 2 == 0) {
            size = (arr.length / 2) - 1;
            sum = arr[size] + arr[size + 1];
        } else
            sum = arr[size] + arr[size + 1];

        System.out.println(sum);
    }

    public static void main(String[] args) {
        custom();
    }

}
