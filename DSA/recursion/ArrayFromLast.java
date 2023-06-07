package DSA.recursion;

public class ArrayFromLast {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4};
        int size = arr.length-1;
        while(size>0){
            if (arr[size]==2){
                System.out.println(" 2 is at index "+size);
            }
            size--;
        }
    }
    
}
