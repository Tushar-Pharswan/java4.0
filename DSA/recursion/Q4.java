package DSA.recursion;

//1/1^1 + 2 / 2 ^2 + 3 / 3^3 

public class Q4 {

    //zrecursion
    static int something2(int i , int sum){
        if(i==0){
            return sum;
        }

           sum=sum+(i/i)^i;
        return something2(--i, sum);
    }

    //loop
    static int something(int i){
        int sum=0;
        while(i>0){
            sum=sum+(i/i)^i;
            --i;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(something(3));
        System.out.println(something2(3, 0));
    }
}
