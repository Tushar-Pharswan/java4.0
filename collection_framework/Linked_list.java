package collection_framework;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked_list {
    public static void main(String[] args) {
        LinkedList<String> linking = new LinkedList<String>();
        linking.add("Name : ");
        linking.add("Tushar ");
        linking.add("Pharswan");

        linking.addLast("is your name");
        linking.add("withoutaddLast");

        System.out.println(linking);

        System.out.println(linking.size());
        
        Iterator<String> it = linking.descendingIterator ();
        while(it.hasNext()){
            System.out.println("Itrating "+it.next());
        }
    }   
}
