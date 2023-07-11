package DSA.array;

public class leftRotation {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n =arr.length-1;
        for(int i=0;i<n;i++){
            int temp=arr[0];
            arr[i]=arr[i+1];
            arr[n]=temp;
        }
    
    }
    
}
