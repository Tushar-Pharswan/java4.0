package DSA.recursion;

public class powerOf3n {
    public static boolean isPowerOfThree(int n) {

        if (n == 0) {
            return false;
        }
        if (n == 3) {
            return true;
        }

        return isPowerOfThree(n / 3);

        //return true;
    }

    public static void main(String[] args) {

        System.out.println(isPowerOfThree(893));
    }
}
