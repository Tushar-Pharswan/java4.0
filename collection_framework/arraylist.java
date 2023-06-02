package collection_framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arraylist {

    public static void main(String[] args) {

        // ArrayList

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        System.out.println("Array list "+arr);
        arr.remove(0);
        System.out.println("After removing index 0 "+arr);
        arr.add(3, 6);
        System.out.println("inserting 6 in index 3 "+arr);
        arr.set(3, 0);
        System.out.println("after set(replace) index 3 as  0 "+arr);

        //List type

        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(12);

        System.out.println(list);
        list.add(1, 13);
        System.out.println(list);

        arr.addAll(list);
        System.out.println(" merged list "+list);

        System.out.println("index 5 is "+list.get(5));
        System.out.println(list.contains(9));// used to return boolean value true if the passed data is present
        list.contains(4);
        list.set(2, 88);
        System.out.println(list);

         //ways to iterate
         for(int i =0; i< list.size(); i++){
            System.out.println("the element is "+ list.get(i));// this is used to get every element particularly
        }

        
        //for-each loop
        for(Integer element : list){
            System.out.println("from for each loop "+ element);
        }

        //iterator
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.println("iterator "+it.next());
        }
    }

}
