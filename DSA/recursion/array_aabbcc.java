package DSA.recursion;

public class array_aabbcc {
    public static void main(String[] args) {
        char arr[] = new char[] { 'a', 'a', 'b', 'b', 'c', 'c' };
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                arr[i + 1] = '#';
            }
        }
        String copString = String.copyValueOf(arr);
        System.out.println(copString);
     }

}
