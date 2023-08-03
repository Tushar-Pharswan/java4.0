package DSA.Sheet.Day3Arrays;

public class pow_x_n_Q50 {
    public static double myPow(double x, int n) {
        long nn = n;
        double ans = 1.0;
        // negative to positive
        if (nn< 0) {
            nn = -1 * nn;
        }
        while (nn > 0) {
            // odd pow
            if (nn % 2 == 1) {
                ans = ans * x;
                nn = nn - 1;
            }
            // even pow
            else {
                x = x * x;
                nn = nn/ 2;
            }
        }
        // pow back to positive
        if (n < 0) {
            ans = (double) (1.0) / (double) (ans);
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(myPow(2,10));
    }
}