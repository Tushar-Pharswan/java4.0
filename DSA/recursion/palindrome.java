package DSA.recursion;

import string.char_charAt_int_index;

public class palindrome {
    public static void main(String[] args) {
        String s1 = new String("abba");
        String s2=new String("");
        int size = s1.length();
        while(size>0){
            s2=s2+ s1.charAt(size-1);
            size--;
        }
        System.out.println("string 1 :  "+(s1));
        System.out.println("string 2 :  "+(s2));
        if(s1.equals(s2)){
            System.out.println("Palindrom");
        }
        else{
        System.out.println(" not palindrom ");
    }

    }
}
