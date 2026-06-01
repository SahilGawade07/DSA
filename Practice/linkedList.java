package Practice;

import java.util.Scanner;

public class linkedList {
          static  Node head = null;

    public static void main(String[] args) {
        int input;
        Scanner sc = new Scanner(System.in);
       
        while (true) {

    System.out.println("1. Print");
    System.out.println("2. insert at last");
    System.out.println("3. Insert at begining");
    System.out.println("5. Exit");

    int option = sc.nextInt();

    if (option == 5)
        break;

        switch(option){
            case 2:
                System.out.println("Enter a number:");
                input = sc.nextInt();
                insertAtLast(input);
                break;
            
            case 1:
                printList();
                break;
            
            case 3:
                input = sc.nextInt();
                insertAtBeggining(input);
                break;
      }
    }

    }

   static void insertAtLast(int num) {

    if (head == null) {
        head = new Node();
        head.data = num;
        head.next = null;
        return;
    }

    Node temp = head;

    while (temp.next != null) {
        temp = temp.next;
    }

    Node newNode = new Node();
    newNode.data = num;
    newNode.next = null;

    temp.next = newNode;
}

    static void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    static void insertAtBeggining(int num){
        if (head == null) {
        head = new Node();
        head.data = num;
        head.next = null;
        return;
    }

    Node newNode = new Node();
    newNode.data = num;
    newNode.next = head;
    head = newNode;


    }
    static class Node {
        int data;
        Node next;
    }
}
