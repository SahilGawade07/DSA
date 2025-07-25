public class middleOfTheLinkedList_876 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        // Call your solution
        Solution solution = new Solution();
        ListNode middle = solution.middleNode(head);

        // Print from middle to end
        while (middle != null) {
            System.out.print(middle.val + " ");
            middle = middle.next;
        }
    }
}

// ListNode definition
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

// Your logic preserved
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        ListNode temp2 = head;
        int count = 0;

        // Count number of nodes
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        int mid = count / 2 + 1;

        count = 0;

        while (temp2 != null) {
            count++;
            if (count == mid)
                return temp2;
            temp2 = temp2.next;
        }

        return null;
    }
}
