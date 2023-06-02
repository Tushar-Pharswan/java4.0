package oops.calsses;

public class constructor {
    constructor(){
        int a=1; 
        int b=2;
        int c=a+b;
        System.out.println( c);
    }
    constructor(int a ){
        int b=1;
        int c=a*b;
        System.out.println(c);
    }
    public int data = 45;
    public static void main(String[] args) {
        constructor c =new constructor();
        constructor c2 =new constructor(2);
        
    }
}
