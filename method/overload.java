package method;

import java.util.Scanner;

public class overload {
    public static void load(int a, double b){
        System.out.println(a+b);
    }
    public static void load(int c , int a){
        System.out.println(c);
    }
    public static void load(int a, int b , int d) {
        System.out.println(a+b+d);
    }

    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        // load(2, 2, 2);
        // load(3,2);
        // load(2, 2);
        
        

    }
}
