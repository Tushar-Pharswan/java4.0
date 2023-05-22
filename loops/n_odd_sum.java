package loops;

import java.util.Scanner;

public class n_odd_sum {
    public static void main(String[] args) {

        System.out.println("no of terms");
        Scanner ter=new Scanner(System.in);
        int ms=2*ter.nextInt();
        int i;
        int sum=0;

        for(i=1;i<=ms;  i=i+2){      
            // if(i%2 !=0)
            System.out.println(+i);
            sum = sum + i;
        }
        
        System.out.println(+sum);
        ter.close();
    }
    
}
