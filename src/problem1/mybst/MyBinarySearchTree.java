/*
 *  Created by IntelliJ IDEA.
 *  User: Rakesh Yadav
 *  Date: 28-Mar-20
 *
 */

package problem1.mybst;

import problem1.node.TreeNode;

// to implement BinarySearchTree
public class MyBinarySearchTree {
    public static StringBuilder preOrderString;
    static int levels = 0;
    public TreeNode root;

    public MyBinarySearchTree() {
        this.root = null;
        preOrderString = new StringBuilder();
    }

    public static void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        preOrderString.append(root.getKey() + " ");
        preOrder(root.getLeft());
        preOrder(root.getRight());
    }

    public void add(final int value) {
        this.root = addService(this.root, value);
    }

    public TreeNode addService(final TreeNode treeRoot, final int addingValue) {
        if (treeRoot == null) {
            return new TreeNode(addingValue);
        }
        if (addingValue < treeRoot.getKey()) {
            treeRoot.setLeft(addService(treeRoot.getLeft(), addingValue));
        } else if (addingValue == treeRoot.getKey()) {
            return treeRoot;
        } else {
            treeRoot.setRight(addService(treeRoot.getRight(), addingValue));
        }

        return treeRoot;
    }

    public void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        postOrder(root.getLeft());
        postOrder(root.getRight());
        System.out.print(root.getKey() + " ");
    }
}