package DSA.recursion;

public class power {

    //loop 
    static int pow(int num,int num2){
        int ans=1;

        for (int i=0;i<num2;i++){
            ans=ans*num;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(pow(2, 5));
    }
    
}
