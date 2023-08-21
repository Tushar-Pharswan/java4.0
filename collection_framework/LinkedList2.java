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

    public static void main(String[] args) {
        LinkedList2 list = new LinkedList2();
        list.addFirst("a");
        list.addFirst("is");
        
    }
}
