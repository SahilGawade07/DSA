public class ll {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    public void addAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
    }

    public void addAtPosition(int data, int position) {
        if (position == 0) {
            addAtBeginning(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;

        for (int i = 0; i < position - 1; i++) {
            if (temp == null) {
                System.out.println("Position out of bounds.");
                return;
            }
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of bounds.");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int countNodes() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public void traverse() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        System.out.print("Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        ll list = new ll();

        list.addAtEnd(10);
        list.addAtBeginning(5);
        list.addAtEnd(15);
        list.addAtPosition(12, 2); 
        list.addAtPosition(1, 0);   
        list.traverse();

        System.out.println("Total nodes: " + list.countNodes());
    }
}
