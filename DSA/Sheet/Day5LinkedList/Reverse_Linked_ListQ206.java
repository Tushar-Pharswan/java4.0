package DSA.Sheet.Day5LinkedList;

public class Reverse_Linked_ListQ206 {

    //Leet code 

    // Definition for singly-linked list.
    // public class ListNode {
    //     int val;
    //     ListNode next;

    //     ListNode() {
    //     }

    //     ListNode(int val) {
    //         this.val = val;
    //     }

    //     ListNode(int val, ListNode next) {
    //         this.val = val;
    //         this.next = next;
    //     }
    // }

    // public ListNode reverseList(ListNode head) {

    // }

    //OWN

    Node head;
    
    class Node {
        int data;
        Node next;

        Node(int i){
            this.data = i;
            this.next = null;
        }
    }

    //addLast
    public void addLast(int i) {
        Node newNode = new Node(i);
        if (head == null) {
            head = newNode;
        } else {
            Node useHead = head;
            while (useHead.next != null) {
                useHead = useHead.next;
            }
            useHead.next = newNode;
        }
    }

    //
    public void reverseIterator(){

        if(head==null || head.next == null){
            return;
        }
        
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null ){
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            //update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    // Print
    public void printing() {

        if (head == null) {
            System.out.println(" List is empty ");
            return;
        }
        Node useeeHead = head;
        while (useeeHead != null) {
            System.out.print(useeeHead.data + " -> ");
            useeeHead = useeeHead.next;
        }

        System.out.println("NULL");
    }

    public Node reverseRecursive(Node head){
        if (head==null || head.next==null){
            return head;
        }
        Node newHead = reverseRecursive(head.next);
        head.next.next=head;
        head.next=null;

        return newHead;
    }


    public static void main(String[] args) {
        Reverse_Linked_ListQ206 list = new Reverse_Linked_ListQ206();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.printing();

        list.reverseIterator();
        list.printing();

        list.head = list.reverseRecursive(list.head);
        list.printing();
    }
}
