package DSA.recursion;

public class factorial {

    // recursion

    static int facRe(int a, int sum) {

        if (a == 0) {
            return sum;
        }
        sum = sum * a;

        return facRe(--a, sum);

    }

    static int facRe(int a) {

        if (a == 0) {
            return 1;
        }
        // sum = sum*a;

        return a * facRe(--a);
    }

    // loop
    static int fac(int a) {

        int sum = 1;
        for (int i = 1; i <= a; i++) {
            sum = sum * i;
        }
        return sum;

    }

    public static void main(String[] args) {
        System.out.println(fac(5));

        System.out.println(facRe(5, 1));
        System.out.println(facRe(5));
    }
}
