public class swapNodeInPairs_24 {

    // Definition for singly-linked list.
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

    public ListNode swapPairs(ListNode head) {
        ListNode prev = head;
        ListNode curr = head;
        ListNode next = head.next;
        

        while (next != null) {
            if(curr == head){
                head = next;
                next.next = curr;

                curr.next = curr.next;
                continue;
            }


            curr = next;
            next = next.next;
        }

        return head;
    }

    // Helper method to create a linked list from an array
    public static ListNode createList(int[] values) {
        if (values.length == 0)
            return null;
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        return head;
    }

    // Helper method to print a linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + (current.next != null ? " -> " : ""));
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        swapNodeInPairs_24 obj = new swapNodeInPairs_24();

        int[] arr = { 1, 2, 3, 4 }; // You can change this input
        ListNode head = createList(arr);
        System.out.print("Original list: ");
        printList(head);

        ListNode swapped = obj.swapPairs(head);
        System.out.print("Swapped list:  ");
        printList(swapped);
    }
}






ListNode swapPairs (ListNode head) {
DF