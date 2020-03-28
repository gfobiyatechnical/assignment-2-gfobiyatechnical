/*
 *  Created by IntelliJ IDEA.
 *  User: Rakesh Yadav
 *  Date: 28-Mar-20
 *
 */
package problem1.node;

public class TreeNode {
    private TreeNode left;
    private TreeNode right;
    private int data;
    private TreeNode next;

    // Parameterized Constructor
    public TreeNode(TreeNode left, TreeNode right, int data) {
        this.left = left;
        this.right = right;
        this.data = data;
        next = null;
    }

    //default constructor
    public TreeNode() {
        this.left = null;
        this.right = null;
        this.data = 0;
        next = null;
    }


    public TreeNode getNext() {
        return next;
    }

    // Getter & Setter Methods
    public void setNext(TreeNode next) {
        this.next = next;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
