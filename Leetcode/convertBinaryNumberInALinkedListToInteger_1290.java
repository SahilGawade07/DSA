// LeetCode 1290: Convert Binary Number in a Linked List to Integer

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

public class convertBinaryNumberInALinkedListToInteger_1290 {

    public int getDecimalValue(ListNode head) {
        ListNode temp = head;
        ListNode temp2 = head;
        int len = 0;
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        len--;
        int ans = 0;
        while (temp2 != null) {
            ans += Math.pow(2, len) * temp2.val ;
            len--;
            temp2 = temp2.next;
        }

        return ans;
    }

    // Utility method to create a linked list from an array
    public static ListNode createLinkedList(int[] values) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        for (int val : values) {
            current.next = new ListNode(val);
            current = current.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        convertBinaryNumberInALinkedListToInteger_1290 solution = new convertBinaryNumberInALinkedListToInteger_1290();

        // Sample test case: binary [1, 0, 1] = decimal 5
        int[] binaryArray = { 0};
        ListNode head = createLinkedList(binaryArray);

        int result = solution.getDecimalValue(head);
        System.out.println("Decimal value: " + result); // Expected: 5
    }
}
