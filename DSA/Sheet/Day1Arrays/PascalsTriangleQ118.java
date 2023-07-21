package DSA.Sheet.Day1Arrays;

public class PascalsTriangleQ118 {

    /* variation 1 
    In this case, we are given the row number r and the column number c, and we need to find out the element at position (r,c). 
    */

    public static long ncr(int n , int r){
        long res =1;
        //calculating ncr with shortcut method
        for(int i=0;i<r;i++){
            res=res * (n-i);
            res=res / (i+1);
        }
        return res;
    }
    public static long  pascalTriangle(int r, int c){
        long element = (long) ncr(r-1,c-1);
        return element;
    }
    public static void main(String[] args) {
        int r = 5; // row number
        int c = 3; // col number
        long element = pascalTriangle(r, c);
        System.out.println("The element at position (r,c) is: " + element);
    }
}
