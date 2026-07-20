package Practice;

import java.util.LinkedList;
import java.util.Queue;

class tree {
    public static void main(String args[]){
        Node root = new Node(5);

        Node l = new Node(4);
        Node r = new Node(3);

        root.right = r;
        root.left = l;

        Node ll = new Node(1);
        Node lr = new Node(2);

        root.left.left = ll;
        root.left.right = lr;

        Node rl = new Node(9);
        Node rr = new Node(8);

        root.right.left = rl;
        root.right.right = rr;

        levelorder(root);
    }

    static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }

    static void inroder(Node root){
        if(root == null){
            return;
        }

        inroder(root.left);
        System.out.println(root.data);
        inroder(root.right);
    }

    static void postorder(Node root){
        if(root == null){
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data);
    }

    static void levelorder(Node root){
        
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            Node current = q.poll();

            System.out.println(current.data);

            if(current.left != null) q.add(current.left);
            if(current.right != null) q.add(current.right);

        }

    }
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int num){
            this.data = num;
        }
    }
}