package DSA.recursion;

public class arrayocurence {
    public static void main(String[] args) {
        int arr[]=new int []{1,2,3,2,2,4,};
        int count=0;
        int i=arr.length-1;
        while(i>0){
            if(arr[i]==2){
                count++;
            }
            i--;
        }
        System.out.println(count);
    }
    
}
