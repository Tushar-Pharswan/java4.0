package DSA.array;

public class SubArrayProduct {
    
    static int solution(int arr[], int k) {
        if(k<=1){
            return 0;
        }
        int ans = 0;
        int product = 1;
        int start = 0;
        for (int i = 0; i < arr.length; i++) {
            // includeing the next element in product
            product = product * arr[i];
            while (product >= k) {
                // removing the fisrt element from product
                //sliding window approach
                product = product / arr[start++];
            }
            ans += i - start +1;
            //System.out.println(product);
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 5, 2, 6 };
        int k = 100;
        int ans = solution(arr, k);
        System.out.println(ans);
    }
}
