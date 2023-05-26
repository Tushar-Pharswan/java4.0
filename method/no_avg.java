package method;

import java.util.Scanner;

public class no_avg {

    public static int average() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of digits  =  ");
        int digit = sc.nextInt();
        int temp = digit;
        int no;
        int sum=0;
        System.out.println("enter your no.s ");

        while (temp > 0) {
            no = sc.nextInt();
            sum = sum + no;
            temp--;
        }
        int avg = sum / digit;
        System.out.println("avg is " + avg);
        return avg;


        // System.out.println("enter how many numbers ");
        // int num = sc.nextInt();
        // int temp = num;
        // System.out.println("enter your numbers ");
        // int value;
        // int sum =0;

        // while(temp>0){
        //     value = sc.nextInt();
        //     sum = sum + value;
        //     temp--;
        // }
        // int avg = sum/num;
        // System.out.println("avg is "+avg);

    }

    public static void main(String[] args) {
        int a = average();
        System.out.println(a);
    }
}
