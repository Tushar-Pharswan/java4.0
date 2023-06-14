package DSA.recursion;

public class nInputReturnX {
    static int nMul(int sum, int no){
        if(no==0){
            System.out.println(sum);
            return sum;
        }
        sum=sum*(no%10);
        no=no/10;
        return nMul(sum, no);
    }
    public static void main(String[] args) {
        nMul(1, 1234);
    }
    
}
