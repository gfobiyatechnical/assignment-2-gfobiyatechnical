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

    Queue<Integer> queue;
    private TreeNode newnode;
    private TreeNode root;
    private TreeNode temp;
    private int ctr;

    public MyBinarySearchTree() {
        temp = null;
        root = null;
        ctr = 0;
        queue = new LinkedList<>();
    }

}
