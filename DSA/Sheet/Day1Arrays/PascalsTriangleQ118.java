package DSA.Sheet.Day1Arrays;

public class PascalsTriangleQ118 {

    // variation 2

    //Given the row number n. Print the n-th row of Pascal’s triangle.

    static void pascalTriangle(int n){
        long res = 1;
        System.out.println(res); 
        //rest of the no.

        for(int j = 1;j<n;j++){
            res = res * (n-j);
            res = res/j;
            System.out.print (res + " ");
        }
        System.out.println();

        public static void main(String[] args) {
            int n = 5;
            pascalTriangle(n);
        }
    }




    /* 

    // variation 1

    //In this case, we are given the row number r and the column number c, and we need to find out the element at position (r,c). 
    

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

    */
}
