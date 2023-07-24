import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        for (int i = 1; i < numRows+1; i++) {
            long res = 1;
            System.out.print(res + " ");
            for (int j = 1; j <= i+1; j++) {
                res = res * (i - j);
                res = res / j;
                if(res==0){
                    System.out.println();
                }
                else{
                    System.out.print(res + " ");
                }
            }
        }
    }
}