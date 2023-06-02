package test1;

public class outside_subclass {
    protected int registration_no=1010;

    public static void main(String[] args) {
        second s1 =new second();
        // System.out.println(s1.chessi_no);
        
    }

}
 class second{
    private  int chessi_no;
    public static void main(String[] args) {
        second s1 =new second();
        System.out.println(s1.chessi_no);

        outside_subclass o1=new outside_subclass();
        System.out.println(o1.registration_no);
    }
 }
