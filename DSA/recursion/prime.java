package DSA.recursion;

public class prime {
    // recursion

    static void number2(int num, int i) {
        if(i==num){
            System.out.println("number is prime ");
            System.out.print(num+" ");
            return;
        }
        if(num%i == 0){
            System.out.println("number is not prime ");
            return ;
        }

         number2(num, ++i);
    }
    // loop

    static void number(int num) {
        boolean check = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                check = false;
                break;
            }

        }
        if (check == true) {
            System.out.println(num + " is a prime no.");
        } else {
            System.out.println(num + " is not prime no.");
        }
    }

    public static void main(String[] args) {
        number(10);
        number2(4, 2);
        // for(int i =2; i<500; i++){
        //     number2(i, 2);
        // }
    }
}
