package DSA.recursion;

// Count Zero in a Given Number
//Num = 102030
//Count 0 - 3

public class countOccurance {

    // recursion

    static int number2(int num, int count) {
        if (num == 0) {
            return count;
        }
        if(num % 10==0)
        count++;
        return number2(num / 10, count);
    }

    // loop
    static int number(int num) {

        int count = 0;
        while (num > 0) {
            if (num % 10 == 0) {
                count++;
            }
            num = num / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(number(102030));
        System.out.println(number2(102030, 0));
    }
}
