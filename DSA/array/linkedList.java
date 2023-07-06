package DSA.array;

public class linkedList<T> {
    private NodeA<T> start;
    void insertingAtBeg(NodeA<T>node){
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

    void insertingAtEnd(NodeA<T>node){
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
        NodeA<T> temp =start;
        while(temp.next !=null){
            temp= temp.next;
        }
        temp.next=node;
    }

    public static void main(String[] args) {
        linkedList<Integer>obj = new linkedList<>();
        obj.insertingAtBeg(new NodeA<>(2));
        obj.insertingAtBeg(new NodeA<>(6));
        obj.insertingAtBeg(new NodeA<>(8));
        obj.insertingAtBeg(new NodeA<>(10));
        obj.print();
    }
    
}
