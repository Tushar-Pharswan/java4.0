package DSA.array;

public class linkedList{
    Node head; // head of list 
    
    // Linked list Node. 
    // This inner class is made static 
    // so that main() can access it 
    static class Node { 
    
        int data; 
        Node next; 
    
        // Constructor 
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
    
    private Node start;
    void insertingAtBeg(Node node){
        //linked list is empty
        if(start==null){
            if(start==null){
                start = node;
                return;
            }
            node.next=start;
            start=node;
        }
    }

    void insertingAtEnd(Node node){
        // If linked list is empty
        if(start==null){
            start=node;
            return;
        }
        // if linked list has only one node
        if(start.next == null ){
            start.next=node;
            return;
        }
        Node temp =start;
        while(temp.next !=null){
            temp= temp.next;
        }
        temp.next=node;
    }

    public static void main(String[] args) {
        linkedList obj = new linkedList ();
        obj.insertingAtBeg(new Node(2));
        obj.insertingAtBeg(new Node(6));
        obj.insertingAtBeg(new Node(8));
        obj.insertingAtBeg(new Node(10));
        obj.print();
    }
    
}
