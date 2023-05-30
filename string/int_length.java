package string;

public class int_length {
    //reverse 

    static void lenght1(){
        String str1 =new String("Tushar Pharswan");
        System.out.println("\n-- 1 -- \n\n" + "String is --> " + str1);
        System.out.println("Reverse is ");
        for (int i=0;i<=str1.length()-1;i++){
            System.out.print(str1.charAt(str1.length()-1-i));
        }

    }
    public static void main(String[] args) {
        lenght1();
    }
}
 