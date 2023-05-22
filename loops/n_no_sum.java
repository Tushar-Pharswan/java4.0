package loops;

import java.util.Scanner;

public class n_no_sum {
    public static void main(String[] args) {
        System.out.println("enter the no.");
         Scanner n = new Scanner(System.in);
         int no=n.nextInt();

         int i;
         int sum=0;
         for(i=0;i<=no;i++){
            System.out.println(+i);
            sum=sum+i; 
         }
         System.out.println("sum is " + sum);
    }
    
}
