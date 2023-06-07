package DSA.recursion;

public class Armstrong {

    //loop

    static double no1(int digit){
        double sum = 0;
        while ( 0<digit){
            sum =sum + (Math.pow(digit%10,3 ));
            digit=digit/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("By loop "+no1(153));
    }
    
}
