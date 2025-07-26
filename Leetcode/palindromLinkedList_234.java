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

class palindromLinkedList_234 {
    public boolean isPalindrome(ListNode head) {
        StringBuilder s = new StringBuilder();

        ListNode temp = head;

        while (temp != null) {
            s.append(temp.val);
            temp = temp.next;
        }

        StringBuilder rev = new StringBuilder(s.reverse());
        s.reverse();

        if (s.toString().equals(rev.toString())) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        palindromLinkedList_234 solution = new palindromLinkedList_234();

        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(2);
        head1.next.next.next = new ListNode(1);
        System.out.println("Test Case 1: " + solution.isPalindrome(head1));

        ListNode head2 = new ListNode(3);
        head2.next = new ListNode(2);
        System.out.println("Test Case 2: " + solution.isPalindrome(head2));

    }
}