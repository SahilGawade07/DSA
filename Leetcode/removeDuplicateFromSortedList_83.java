class ListNode {
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

public class removeDuplicateFromSortedList_83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode plusOne = head.next;
        System.out.println(head.val+" "+ plusOne.val);
        while(head != null){
            if(head.val == plusOne.val){
                head = plusOne.next;
                plusOne.next = plusOne.next.next;
            }
            return head;

        }

        return head;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode node5 = new ListNode(3);
        ListNode node4 = new ListNode(3, node5);
        ListNode node3 = new ListNode(2, node4);
        ListNode node2 = new ListNode(1, node3);
        ListNode node1 = new ListNode(1, node2);

        removeDuplicateFromSortedList_83 solution = new removeDuplicateFromSortedList_83();
        ListNode result = solution.deleteDuplicates(node1);

        printList(result);
    }
}
