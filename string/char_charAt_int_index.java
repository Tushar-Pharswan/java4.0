/*Java String charAt()

https://www.javatpoint.com/java-string-charat


The Java String class charAt() method returns a char value at the given index number.

The index number starts from 0 and goes to n-1, where n is the length of the string. It returns StringIndexOutOfBoundsException, if the given index number is greater than or equal to this string length or a negative number.

Syntax
public char charAt(int index) 

The method accepts index as a parameter. The starting index is 0. It returns a character at a specific index position in a string. It throws StringIndexOutOfBoundsException if the index is a negative value or greater than this string length.
*/
package string;

public class char_charAt_int_index {
    static void charAt1() {
        String str1 = new String("Tushar Pharswan");
        System.out.println("-- 1 -- \n\n" + "String is --> " + str1);
        char ch = str1.charAt(3);
        System.out.println("character at index 3 is --> " + ch);
    }

    /* Accessing First and Last Character by Using the charAt() Method */

    static void charAt2() {
        String str2 = new String("Tushar Pharswan");
        System.out.println("\n-- 2 -- \n\n" + "String is --> " + str2);
        // Fetching first character
        System.out.println("Character at 0 index is: " + str2.charAt(0));
        // Fetching last charater at last
        System.out.println("Character at last is: " + str2.charAt(str2.length() - 1));
    }

    // Print Characters Presented at Odd Positions by Using the charAt() Method

    static void charAt3() {
        String str3 = new String("Tushar Pharswan");
        System.out.println("\n-- 3 -- \n\n" + "String is --> " + str3);
        System.out.println("Character at odd places are");

        for (int i = 0; i <= str3.length() - 1; i++) {
            if (i % 2 != 0)
                System.out.println("Char at " + i + " place -->  " + str3.charAt(i));
        }
    }

    // Counting Frequency of a character in a String by Using the charAt() Method

    static void charAt4() {
        String str4 = new String("Tushar Pharswan");
        System.out.println("\n-- 4 -- \n\n" + "String is --> " + str4);
        int count = 0;
        for (int i = 0; i <= str4.length() - 1; i++) {
            if (str4.charAt(i) == 'a')
            count++;
        }
        System.out.println("Frequency of a is: " + count);
    }

    public static void main(String[] args) {
        charAt1();
        charAt2();
        charAt3();
        charAt4();
    }
}
