
public class reverseTheLinkedList_206 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5)))));

        // You can test reverseList here once it's implemented
        reverseTheLinkedList_206 obj = new reverseTheLinkedList_206();
        ListNode reversed = obj.reverseList(head);

        // Print reversed list (for checking after implementing reverseList)
        printList(reversed);
    }

    public ListNode reverseList(ListNode head) {
        // ArrayList<ListNode> a = new ArrayList<>();

        // ListNode temp = head;
        // while (temp != null) {
        // a.add(temp);
        // temp = temp.next;
        // }

        // // Important fix: Clear all .next to break original links
        // for (ListNode node : a) {
        // node.next = null;
        // }

        // ListNode ans = null;
        // for (int i = a.size() - 1; i >= 0; i--) {
        // ListNode node = a.get(i);
        // node.next = ans;
        // ans = node;
        // }

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {

            curr = curr.next;
            curr.next = prev;
        }
        return curr;
    }

    // Helper method to print the list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}

// Definition for singly-linked list.
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
