package method;

import java.util.Scanner;

public class smallest_no {
    static Scanner sc = new Scanner(System.in);

    public static int digits() {
        System.out.println("enter no.1 ");
        int no1 = sc.nextInt();
        System.out.println("enter no.2 ");
        int no2 = sc.nextInt();
        System.out.println("enter no.3 ");
        int no3 = sc.nextInt();

        if (no1 > no2 && no2 > no3) {
            System.out.println("smallest no. is " + no3);
            return no3;
        } else if (no3 > no1 && no1 > no2) {
            System.out.println("smallest no. is" + no2);
            return no2;
        } else
            System.out.println("smallest no. is " + no1);
        return no1;
    }

    public static void main(String[] args) {
        digits();
    }
}
