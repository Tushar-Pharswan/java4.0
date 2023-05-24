package method;

import java.util.Scanner;

public class no_avg {
    static Scanner sc=new Scanner(System.in);
   
    public static int average(){
       int no1;
        // int no2=sc.nextInt();
        // int no3=sc.nextInt();
        int result =0;
        int sum =0, count=0;
        String a;

        while(true){
            no1=sc.nextInt();
            sum = sum+no1;
            count++;
        }

        result =sum/count;
        


        //System.out.println("average is  " +sum);
        return result;
    }
    public static void main(String[] args) {
        average();
    }
    
}
