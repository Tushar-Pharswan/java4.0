package collection_framework;

public class LinkedList2 {
    Node head;

    private int size;

    LinkedList2() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
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
            while (useHead.next != null) {
                useHead = useHead.next;
            }
            useHead.next = newNode;
        }
    }

    // delete first

    public void deleteFirst() {
        if (head == null) {
            System.out.println("This list is empty");
            return;
        }

        size--;
        head = head.next;
    }

    // delete last

    public void deleteLast() {
        if (head == null) {
            System.out.println("Yhe list is empty");
            return;
        }

        size--;
        // side case 0.1
        if (head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;// head.next = null -> lastNode =null

        while (lastNode.next != null) {// null.next #error for error not to occur we make side case up 0.1
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }

    // Print
    public void printing() {

        if (head == null) {
            System.out.println(" List is empty ");
            return;
        }
        Node useHead = head;
        while (useHead != null) {
            System.out.print(useHead.data + " -> ");
            useHead = useHead.next;
        }

        System.out.println("NULL");
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        LinkedList2 list = new LinkedList2();
        list.addFirst("a");
        list.addFirst("is");
        list.printing();

        list.addLast("List");
        list.printing();

        list.addFirst("This");
        list.printing();

        list.deleteFirst();
        list.printing();

        list.deleteLast();
        list.printing();

        System.out.println(list.getSize());

        list.addFirst("This");
        list.printing();

        System.out.println(list.getSize());
        
    }
}