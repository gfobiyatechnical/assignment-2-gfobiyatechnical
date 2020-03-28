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
import java.util.Scanner;

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

    // Binary Tree: Insertion helper method
    public void insert(TreeNode tempRoot) {
        if (newnode == null) {
            generateNode(new Scanner(System.in).nextInt());
            System.out.println("Node Generated");
        }
        try {
            if (newnode.getData() <= tempRoot.getData()) {
                System.out.println("Left Traversal...");
                if (tempRoot.getLeft() == null) {
                    tempRoot.setLeft(newnode);
                    System.out.println("Node inserted at Left");
                    queue.add(newnode.getData());
                    ctr--;
                    newnode = null;
                    return;
                } else {
                    System.out.println("Left not empty changing tempRoot ");
                    insert(tempRoot.getLeft());
                }
            }
        } catch (NullPointerException ignore) {
        }
        try {
            if (newnode.getData() > tempRoot.getData()) {
                System.out.println("Right Traversal...");
                if (tempRoot.getRight() == null) {
                    tempRoot.setRight(newnode);
                    System.out.println("Node inserted at Right");
                    ctr++;
                    newnode = null;
                } else {
                    System.out.println("Right not empty changing tmproot");
                    insert(tempRoot.getRight());
                }
            }
        } catch (NullPointerException ignore) {
        }
    }


}
