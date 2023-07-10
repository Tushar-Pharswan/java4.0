package DSA.array;

public class arraysortedYesNo {
    static void sorted(int arr[]){
        for(int i=0 ; i<arr.length-1 ;i++){
            if (arr[i]<=arr[i+1]){
                System.out.println("yes");
            }
            
            else{
                System.out.println("NO");
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,8};
        sorted(arr);
    }
}
