/*
 *  Created by IntelliJ IDEA.
 *  User: Rakesh Yadav
 *  Date: 28-Mar-20
 *
 */
package problem4.myqueue;
// to create queue to store pre - order successor
import problem1.node.TreeNode;

public class MyQueue {
    private Node front;
    private Node rear;

    public MyQueue() {
        front = null;
        rear = null;
    }

    public void enqueue(int data) {
        Node ns = new Node();
        ns.setData(data);
        if (front == null) {
            front = rear = ns;
        } else {
            rear.setNext(ns);
            rear = ns;
        }
    }

    public void preSuccessor(TreeNode root) {
        if (root == null) {
            System.out.println(" Ops !!  Empty");
        } else {
            enqueue(root.getKey());
            preSuccessor(root.getLeft());
            preSuccessor(root.getRight());
        }
    }

    public void getPreSucc() {
        Node temp = front.getNext();
        while (temp != null) {
            System.out.print(temp.getData() + "\t");
            temp = temp.getNext();
        }
    }

    static class Node {
        int data;
        Node next;

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}