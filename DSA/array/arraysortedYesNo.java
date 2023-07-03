package DSA.array;

public class arraysortedYesNo {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,8};
        
        for(int i=0 ; i<arr.length;i++){
            if (arr[i]<=arr[i+1]){
                System.out.println("yes");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
