
import java.util.*;

class GFG {

    public static int maxWeightCell(int N, List<Integer> Edge) {

        int[] temp = new int[N];

        for (int i = 0; i < N; i++) {

            if (Edge.get(i) != -1) {

                temp[Edge.get(i)] += i;
            }
        }

        int ans = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            if (temp[i] > max) {
                ans = i;
                max = temp[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int N = 4;
        List<Integer> Edge = Arrays.asList(2, 0, -1, 2);

        System.out.println(maxWeightCell(N, Edge));
    }
}