// File: addTwoNumbers_2.java

public class addTwoNumbers_2 {

    // Definition for singly-linked list.
    public static class ListNode {
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

    // Solution class
    static class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode head = null;
            ListNode temp = null;
            int carry = 0;

            while (l1 != null || l1 != null || carry != -0) {
                int val1 = (l1 == null) ? 0 : l1.val;
                int val2 = (l2 == null) ? 0 : l2.val;

                int res = val1 + val2 + carry;
                carry = res / 10;
                ListNode newNode = new ListNode(res % 10);
                if(head == null) {
                    head = newNode;
                    temp = newNode;
                }else{
                    temp.next = newNode;
                    temp = temp.next;
                }
                if(l1!= null){
                    l1 = l1.next;
                }
                if(l2 != null){
                    l2=l2.next;
                }
            }

            return head;
        }
    }

    public static void main(String[] args) {
        // Create l1 = [2, 4, 3]
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));

        // Create l2 = [5, 6, 4]
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        // Call the solution
        Solution sol = new Solution();
        ListNode result = sol.addTwoNumbers(l1, l2);

        // Print the result linked list
        System.out.print("Result: ");
        while (result != null) {
            System.out.print(result.val);
            if (result.next != null)
                System.out.print(" -> ");
            result = result.next;
        }
        System.out.println();
    }
}
