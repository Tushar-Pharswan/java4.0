package loops;

import java.util.Scanner;

public class input_10_no_sum {
    public static void main(String[] args) {
        System.out.println("enter the 10 no.");
        Scanner no=new Scanner(System.in);


        // System.out.println("First no.");
        // int n1=no.nextInt();
        // System.out.println("Second no.");
        // int n2=no.nextInt();
        // System.out.println("Third no.");
        // int n3=no.nextInt();
        // System.out.println("Fourth no.");
        // int n4=no.nextInt();
        // System.out.println("Five no.");
        // int n5=no.nextInt();
        // System.out.println("six no.");
        // int n6=no.nextInt();
        // System.out.println("Seven no.");
        // int n7=no.nextInt();
        // System.out.println("Eight no.");
        // int n8=no.nextInt();
        // System.out.println("Nine no.");
        // int n9=no.nextInt();
        // System.out.println("Tenth no.");
        // int n10=no.nextInt();
        
        int sum=0;

        for(int i =1;i<=10; i++){
            int n = no.nextInt();
            System.out.println(i+ " number is "+n);
            sum = sum+n;
        }
        System.out.println("Sum = " +sum);
        int avg = sum/10;
        System.out.println("Average is " +avg); 

        


    }
    
}
