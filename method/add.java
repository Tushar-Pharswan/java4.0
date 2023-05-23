package method;

import java.util.Scanner;

public class add {
    static Scanner sc=new Scanner(System.in);
    public static int sum (){
        System.out.println("Enter first no.");
        int a=sc.nextInt();
        System.out.println("Enter second no.");
        int b=sc.nextInt();
        int sum = a+b;
        System.out.println("Sum is ");
        System.out.println(a+ "+" +b +" = " + sum) ;
        return sum;
    }
    public static void main(String[] args) {
        sum();
    }
}
