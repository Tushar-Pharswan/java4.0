package DSA.recursion;

public class Sum_n_NaturalNo {

    //Recursion
    static int number2(int num ,int sum){
        if(num==0){
            return sum;
        }
            sum=sum+num;
        return number2(--num, sum);
    }

    //loop
    static int number(int num){

        int sum = 0;
        while(num>0){
            sum=sum+num;
            --num;
        }
        return sum;

    }
    public static void main(String[] args) {
        System.out.println(number(5));
        System.out.println(number2(5, 0));
    }
    
}
