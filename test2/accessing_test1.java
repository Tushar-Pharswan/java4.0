package test2;

import test1.*;

public class accessing_test1 extends outside_subclass {

    public static void main(String[] args) {
        outside_subclass R1 = new outside_subclass();

        // System.out.println(R1.registration_no);

        accessing_test1 a1=new accessing_test1();
        System.out.println(a1.registration_no);

    }

}