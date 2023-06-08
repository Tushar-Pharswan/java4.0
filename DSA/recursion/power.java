package DSA.recursion;
//Power of a Number  2^5

public class power {
    // recursion
    static int pow2(int num,int num2,int ans){
        if(num2==0){
            return ans;
        }
        ans=ans*num;
        return pow2(num, --num2, ans);
    }

    // loop
    static int pow(int num, int num2) {
        int ans = 1;

        for (int i = 0; i < num2; i++) {
            ans = ans * num;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("by loop " + pow(2, 5));
        System.out.println("by Recusrion " +pow2(2, 5, 1));
    }

}
