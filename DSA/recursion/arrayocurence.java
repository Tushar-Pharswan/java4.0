package DSA.recursion;

public class arrayocurence {

    // recursion

    static int[] ocurence(int[] arr2, int i, int count) {
        if (i == arr2.length - 1) {
            System.out.println("no of ocurence of " + count);
            return arr2;
        }
            if (arr2[i] == 2) {
                ++count;
            }
            return ocurence(arr2, i+1, count);

        }

    public static void main(String[] args) {
        // int arr[]=new int []{1,2,3,2,2,4,};
        // int count=0;
        // int i=arr.length-1;
        // while(i>0){
        // if(arr[i]==2){
        // count++;
        // }
        // i--;
        // }
        // System.out.println(count);

        // recursion

        int arr2[] = new int[] { 1, 2, 3, 2, 2, 4, };
        ocurence(arr2, 0, 0);

    }

}
