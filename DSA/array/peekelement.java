package DSA.array;

public class peekelement {
    public static int peek(int arr[],int element,int index){
        int n=arr.length-1;
        if(n==1){
            return n;
        }
        if(arr[0]>=arr[1]){
            return arr[0];
            // System.out.println("index is"+index+" element is"+element);
        }
        if(arr[n-1]>=arr[n-2]){
            return arr[n-1];
            //System.out.println("index is"+index+" element is"+element);
        }
        for(int i=0;i<=n;i++){
            if((arr[i]>=arr[i-1])&& (arr[i]>=arr[i+1])){
                return arr[i];
               // System.out.println("index is"+index+" element is"+element);
            }
        }
        return peek(arr, element, index);      
    } 
    public static void main(String[] args) {
        int arr[]={1,4,2,9,5};
        System.out.println(peek(arr,0, 0));
    }
}
