package string;

import java.util.Arrays;

public class types {
    public static void main(String[] args) {
        String s1=" sring one ";
        System.out.println(s1);

        String s2 =new String("string 2 ");
        System.out.println(s2);

        char s3 [] =new char []{'T','U','S','H','A','R'};
        System.out.println("Array char --> " +Arrays.toString(s3));

        String s4 = new String(s3);
        System.out.println(s4);
        



    }
}
