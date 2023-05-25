package method;

import java.util.Scanner;

public class no_avg {

    public static int average(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no. of digits  =  ");
    int digit = sc.nextInt();
    int temp = digit;
    int sum = 0;
    int avg=sum/digit;
    System.out.println("avg is ");

    while(temp>0)
    {
        temp--;
        sum = sum + temp;
    }
    return average();
    }
    public static void main(String[] args) {
        average();
    }
}
