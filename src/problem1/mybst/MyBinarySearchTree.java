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
    private int count;
    Queue<Integer> queue;

    // Default Constructor
    public MyBinarySearchTree() {
        temp = null;
        root = null;
        count = 0;
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
                    count--;
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
                    count++;
                    newnode = null;
                } else {
                    System.out.println("Right not empty changing tmproot");
                    insert(tempRoot.getRight());
                }
            }
        } catch (NullPointerException ignore) {
        }
    }

    // Helper method for printing Left-child as per required
    public void printLeftChildren() {
        System.out.println("The left children of inserted nodes of Binary search tree are :");
        System.out.println(queue.toString());
        System.out.println("Number of Nodes not having left children" + count);
    }

}