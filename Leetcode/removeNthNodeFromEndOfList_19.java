
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

public class removeNthNodeFromEndOfList_19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int len = 0;
        while (temp != null) {
            len++;
            temp = temp.next;
        }

        int target = len - n;

        if (target == 0) {
            return head.next;
        }

        ListNode prev = head;
        for (int i = 1; i < target; i++) {
            prev = prev.next;
        }

        prev.next = prev.next.next;

        return head;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) {
                System.out.print(" -> ");
            }
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        removeNthNodeFromEndOfList_19 solution = new removeNthNodeFromEndOfList_19();

        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5)))));

        int n = 2;

        ListNode result = solution.removeNthFromEnd(head, n);

        printList(result);
    }
}
