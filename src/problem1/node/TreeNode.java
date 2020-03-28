/*
 *  Created by IntelliJ IDEA.
 *  User: Rakesh Yadav
 *  Date: 28-Mar-20
 *
 */
package problem1.node;

public class TreeNode {
    private int key;
    private TreeNode left, right;

    public TreeNode(int item) {
        key = item;
        left = right = null;
    }

    public int getKey() {
        return key;
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
}
