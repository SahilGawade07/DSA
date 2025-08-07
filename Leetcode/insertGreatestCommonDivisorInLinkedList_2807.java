public class insertGreatestCommonDivisorInLinkedList_2807 {

    // Definition for singly-linked list
    static class ListNode {
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

    public static int fn(int a, int b) {
        int limit = a < b ? a : b;
        int gcd = 0;
        for (int i = 2; i <= limit; i++) {

            if ((a % i == 0) && (b % i == 0)) {
                gcd = i;
            }

        }
        if (gcd == 0) {
            gcd = 1;
        }

        return gcd;
    }

    // TODO: Implement this method
    public static ListNode insertGCD(ListNode head) {
        ListNode temp = head;
        ListNode temp2 = head.next;
        while (temp2 != null) {
            int limit = temp.val < temp2.val ? temp.val : temp2.val;
            int gcd = 0;
            for (int i = 2; i <= limit; i++) {

                if ((temp.val % i == 0) && (temp2.val % i == 0)) {
                    gcd = i;
                }

            }
            if (gcd == 0) {
                gcd = 1;
            }
            ListNode newNode = new ListNode(gcd, temp2);
            temp.next = newNode;

            temp = temp2;
            temp2 = temp2.next;
        }

        return head;
    }

    // Helper to create linked list from array
    static ListNode createList(int[] arr) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for (int val : arr) {
            curr.next = new ListNode(val);
            curr = curr.next;
        }
        return dummy.next;
    }

    // Helper to print linked list
    static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null)
                System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    // Sample test case
    public static void main(String[] args) {
        int[] input = { 18, 6, 10, 3 };
        ListNode head = createList(input);
        ListNode updated = insertGCD(head);
        printList(updated);
    }
}
