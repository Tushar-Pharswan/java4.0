package DSA.recursion;

public class Armstrong {

    // recursion

    static int no2(int digit2, int sum2) {
        if (digit2 == 0) {
            return sum2;
        }
        int d=digit2%10;
        sum2 = sum2 + (d*d*d);
        return no2(--digit2/10, sum2);
    }

    // loop while

    static int no1(int digit) {
        int sum = 0;
        while (0 < digit) {
            int d = digit%10;
            sum = sum + (d*d*d);
            digit = digit / 10;
        }
        return sum;
    }

    // loop again for

    static int no3(int digit3){
        int sum3 = 0;
        int count =digit3;
        for(int i=0;i<=count;i++){
            int d=digit3%10;
            sum3=sum3+(d*d*d);
            digit3=digit3/10;

        }
        return sum3;
    }

    public static void main(String[] args) {
        System.out.println("By while loop " + no1(153));
        System.out.println("By for loop " +no3(153));
        System.out.println("By recursion " +no2(153, 0));
        
    }

}
