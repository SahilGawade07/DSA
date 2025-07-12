import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Iterator;


public class intersectionOfTwoLinkedList_160 {

    // Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    // Class with method to implement
    static class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            ListNode currA = headA;
            ListNode currB = headB;
            System.out.println(currA);
            System.out.println(currA.next);

            Set<ListNode> setA = new LinkedHashSet<>();
            Set<ListNode> setB = new LinkedHashSet<>();

            while (currA != null) {
            setA.add(currA);
            currA = currA.next;
            }

            while (currB != null) {
            setB.add(currB);
            currB = currB.next;
            }

            setA.retainAll(setB);

            Iterator<ListNode> iterator = setA.iterator();
            if(iterator.hasNext()){
                return iterator.next();
            }



            return null ; 

        }
    }

    // Helper to print list (for debugging)
    static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        /*
         * Example Case:
         * intersectVal = 8
         * listA = [4,1,8,4,5]
         * listB = [5,6,1,8,4,5]
         * skipA = 2 (index where listA connects to intersection)
         * skipB = 3 (index where listB connects to intersection)
         */

        // Step 1: Create the common (intersecting) tail: [8 -> 4 -> 5]
        ListNode intersect = new ListNode(8);
        intersect.next = new ListNode(4);
        intersect.next.next = new ListNode(5);

        // Step 2: Create listA: [4 -> 1] + intersect
        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);
        headA.next.next = intersect;

        // Step 3: Create listB: [5 -> 6 -> 1] + intersect
        ListNode headB = new ListNode(5);
        headB.next = new ListNode(6);
        headB.next.next = new ListNode(1);
        headB.next.next.next = intersect;

        // Step 4: Test your method
        Solution sol = new Solution();
        ListNode result = sol.getIntersectionNode(headA, headB);

        // Step 5: Output result
        if (result != null) {
            System.out.println("Intersected at node with value: " + result.val);
        } else {
            System.out.println("No intersection.");
        }
    }
}
