package DSA.Sheet.Day5LinkedList;

public class Merge_Two_Sorted_Lists_Q21 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // iterative
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;

        if (list1.val > list2.val) {
            ListNode temp = list1;
            list1 = list2;
            list2 = temp;
        }
        ListNode res = list1;
        while (list1 != null && list2 != null) {
            ListNode temp2 = null;
            while (list1 != null && list1.val<= list2.val) {
                temp2 = list1;
                list1 = list1.next;
            }
            temp2.next = list2;

            // swap
            ListNode temp = list1;
            list1 = list2;
            list2 = temp;
        }
        return res;
    }
}
