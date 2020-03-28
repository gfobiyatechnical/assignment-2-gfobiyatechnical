/*
 *  Created by IntelliJ IDEA.
 *  User: Rakesh Yadav
 *  Date: 28-Mar-20
 *
 */

package problem1.mybst;

import problem1.node.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

// to implement BinarySearchTree
public class MyBinarySearchTree {

    private TreeNode newnode;
    private TreeNode root;
    private TreeNode temp;
    private int ctr;
    Queue<Integer> queue;

    // Default Constructor
    public MyBinarySearchTree() {
        temp = null;
        root = null;
        ctr = 0;
        queue = new LinkedList<>();
    }

    //node generation
    private void generateNode(int data) {
        newnode = new TreeNode();
        newnode.setData(data);
        newnode.setLeft(null);
        newnode.setRight(null);
    }

    public TreeNode getRoot() {
        return root;
    }

    //setting root node
    public void setRoot(int data) {
        generateNode(data);
        if (root == null) {
            root = newnode;
            temp = root;
            newnode = null;

        }
    }


}
