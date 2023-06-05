package DSA.recursion;

public class sumOfDigits {
    static int sum = 0;

    static int digit(int num) {

        if (num == 0) {
            return 1;
        }
        sum = sum + num % 10;
        num = num / 10;
        return digit(num);
    }

    static int count = 0;

    static int noOfDigits(int num) {
        if (num == 0) {
            return 1;
        }
        count++;

        return noOfDigits(num / 10);

    }

    public static void main(String[] args) {
        digit(1234);
        System.out.println(sum);
        noOfDigits(1234);
        System.out.println(count);

    }
}