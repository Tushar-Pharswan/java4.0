package DSA.recursion;

public class power {
    //recursion

    static int pow2(int num,int num2){
      

    }

    //loop 
    static int pow(int num,int num2){
        int ans=1;

        for (int i=0;i<num2;i++){
            ans=ans*num;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("by loop "+pow(2, 5));
        System.out.println("by Recusrion "+pow2(2, 5));
    }
    
}
