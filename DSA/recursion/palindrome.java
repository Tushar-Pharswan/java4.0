package DSA.recursion;

public class palindrome {

    //recursion

    static String pali2(String s3,String s4,int size1,int size2){
        
        if(size1==s3.length()){
            System.out.println("By Recursion \n");
            if(s3.equals(s4))
            System.out.println("its palindrom ");
            else{
                System.out.println("not palindrome");
            }
            return s3;
        }
        size2=s3.length();
        
        s4 = s4 + s3.charAt(size2 - 1);

        return pali2(s3, s4, size1--,size2);
    }

    // loop 
    static String pali() {
        String s1 = new String("abba");
        String s2 = new String("");
        int size = s1.length();
        while (size > 0) {
            s2 = s2 + s1.charAt(size - 1);
            size--;
        }
        System.out.println("string 1 :  " + (s1));
        System.out.println("string 2 :  " + (s2));
        if (s1.equals(s2)) {
            System.out.println("Palindrom");
        } else {
            System.out.println(" not palindrom ");
        }
        return s2;
    }

    public static void main(String[] args) {
        System.out.println(pali());
        String s3 = new String("abba");
        String s4 = new String("");
        pali2(s3, s4, 0,0);

    }
}
