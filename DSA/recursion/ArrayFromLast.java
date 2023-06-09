package DSA.recursion;

public class ArrayFromLast {
    static int rec(int arr[], int i, int key){
        if(i == 0){
            System.out.println("not present ");
            return -1;
        }
        if(arr[i] == key){
            return i;
        }

        return rec(arr, --i, key);
    }
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,54,6,6,75,45};
        int size = arr.length-1;
        // while(size>0){
        //     if (arr[size]==2){
        //         System.out.println(" by loop 2 is at index "+size);
        //     }
        //     size--;
        // }
        

        System.out.println("by rec : "+rec(arr, size, 54));
    }
    
}
