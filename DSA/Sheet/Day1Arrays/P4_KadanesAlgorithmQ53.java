package DSA.Sheet.Day1Arrays;

public class P4_KadanesAlgorithmQ53 {

    // optimal

    public static long maxSubarraySum(int[] arr, int n) {
        long maxi = Long.MIN_VALUE; // maximum sum
        long sum = 0;

        for (int i = 0; i < n; i++) {

            sum += arr[i];

            if (sum > maxi) {
                maxi = sum;
            }

            // If sum < 0: discard the sum calculated
            if (sum < 0) {
                sum = 0;
            }
        }

        // To consider the sum of the empty subarray
        // uncomment the following check:

        // if (maxi < 0) maxi = 0;

        return maxi;
    }

    public static void main(String args[]) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int n = arr.length;
        long maxSum = maxSubarraySum(arr, n);
        System.out.println("max is: " + maxSum);

    }

    /*
     * //Better
     * 
     * public static int maxSubarraySum(int[] arr, int n) {
     * int maxi = 0; // maximum sum
     * 
     * for (int i = 0; i < n; i++) {
     * int sum = 0;
     * for (int j = i; j < n; j++) {
     * // current subarray = arr[i.....j]
     * 
     * //add the current element arr[j]
     * // to the sum i.e. sum of arr[i...j-1]
     * sum += arr[j];
     * 
     * maxi = Math.max(maxi, sum); // getting the maximum
     * }
     * }
     * 
     * return maxi;
     * }
     * 
     * public static void main(String args[]) {
     * int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
     * int n = arr.length;
     * int maxSum = maxSubarraySum(arr, n);
     * System.out.println("max is: " + maxSum);
     * 
     * }
     * /*
     * //Brute force
     * public static int maxSubArraySum(int[]arr,int n){
     * //int max=Integer.MIN_VALUE;// max sum
     * int max=0;
     * 
     * for( int i = 0;i<n;i++){
     * for ( int j=i;j<n;j++){
     * // subarray = arr[i....j]
     * int sum = 0;
     * 
     * // add all the element of subarray
     * for( int k = i;k<j;k++){
     * sum= sum + arr[k];
     * }
     * max=Math.max(max,sum);
     * }
     * }
     * return max;
     * }
     * public static void main(String[] args) {
     * int[]arr={-2,1,-3,4,-1,2,1,-5,4};
     * int n = arr.length;
     * int maxSum = maxSubArraySum(arr, n);
     * System.out.println("mas is " +maxSum);
     * }
     * 
     */
}
