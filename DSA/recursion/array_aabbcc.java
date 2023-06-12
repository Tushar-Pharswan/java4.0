package DSA.recursion;

public class array_aabbcc {

    // recusrion
    static char[] hash(char[] arr, int i){
        if(i == arr.length-1){
             System.out.println(arr);
            return arr;
           
        }
        if(arr[i] == arr[i+1]){
            arr[i+1] = '#';
        }

        return hash(arr, i+1);
    }


    // loop
    static char[] aabbcc1() {
        char arr[] = new char[] { 'a', 'a', 'b', 'b', 'c', 'c' };
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                arr[i + 1] = '#';
            }
        }
        String copString = String.copyValueOf(arr);
        System.out.println("by loop " + copString);
        return arr;
    }

    
    public static void main(String[] args) {
        // aabbcc1();
        String str = "acbbcc";
        char[] arr = str.toCharArray();
        hash(arr, 0);

    }

}
