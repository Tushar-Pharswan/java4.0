package collection_framework;

import java.util.Vector;

public class vector {
    public static void main(String[] args) {

        Vector<Integer> v = new Vector<>();
        for (int i = 0; i < 5; i++) {
            v.add(i);
        }
        System.out.println(v);

        // another way to initialize vector class
        int n = 5;
        Vector<Integer> v1 = new Vector<>(n);
        for (int i = 0; i < v1.size(); i++) {
            v1.add(i);
        }
        System.out.println(v);

        // object type
        Vector<id> v2 = new Vector<>();
        v2.add(new id(78));
        v2.add(new id(78));
        v2.add(new id(27));

        System.out.println(v2);

        Vector v4 = new Vector();
        v4.add(87);
        v4.add(67);
        v4.add("did not define int or string but prints both ");
        System.out.println(v4);


        Vector<String> v5 = new Vector<>();
        // Add elements using add() method
        v5.add("2");
        v5.add("string");
        v5.add(1, "4");
        System.out.println(v5);

        
    }
}

class id {
    int data;

    id(int x) {
        data = x;
    }

    public String toString() {
        return " " + data;
    }
    
}
