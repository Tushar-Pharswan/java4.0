package DSA.Sheet.Day5LinkedList;

public class Delete_Node_in_a_Linked_List_Q237 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;

        return ;
    }
}
