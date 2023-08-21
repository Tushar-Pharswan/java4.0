package collection_framework;

import java.util.List;

public class LinkedList2 {
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // add - first

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        } else {
            newNode.next = head;
            head = newNode;
        }

    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node useHead = head;
            while ( useHead.next !=null){
                useHead=useHead.next;
            }
            useHead.next=newNode;
        }
    }
    //Print
        public void printing(){

            if (head == null){
                System.out.println( " List is empty ");
                return;
            }
            Node useHead = head;
            while(useHead.next !=null){
                System.out.print(useHead.data+ " -> ");
                useHead = useHead.next;
            }

            System.out.println( "NULL");
        }

    public static void main(String[] args) {
        LinkedList2 list = new LinkedList2();
        list.addLast("a");
        list.addLast("is");
        list.addLast("the");
        list.printing();
    }
}
