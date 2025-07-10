import java.util.HashSet;
import java.util.Set;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class linkedListCycle_141 {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> s = new HashSet<>();
        ListNode temp = head;
        while (temp != null && !s.contains(temp)) {
            s.add(temp);
            temp = temp.next;
        }
        if(temp != null){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // Example: [3,2,0,-4], pos = 1 (cycle)
        ListNode head = new ListNode(3);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(0);
        ListNode fourth = new ListNode(-4);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = null; // cycle here

        linkedListCycle_141 solution = new linkedListCycle_141();
        System.out.println("Has cycle? " + solution.hasCycle(head)); // Expected: true
    }
}
