/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
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
}
