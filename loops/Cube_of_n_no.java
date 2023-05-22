package loops;

import java.util.Scanner;

public class Cube_of_n_no {
    public static void main(String[] args) {
        System.out.println("Enter no of itreation");
        Scanner it=new Scanner(System.in);
        int re=it.nextInt();
        Scanner no=new Scanner(System.in);
        System.out.println("Enter the numbers");
        int i;
        int cube=0;
        for(i=1;i<=re;i++){
            int n=no.nextInt();
            cube=n*n*n;
            System.out.println(i+ " no is " +n +"its cube is " +cube );

        }
        System.out.println("completed");
    }
    
}
