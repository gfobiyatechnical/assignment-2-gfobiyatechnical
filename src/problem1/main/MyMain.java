/*
 *  Created by IntelliJ IDEA.
 *  User: Rakesh Yadav
 *  Date: 28-Mar-20
 *
 */

package problem1.main;

import problem1.mybst.MyBinarySearchTree;

import java.util.Scanner;

// executable class
public class MyMain {
    public static void main(String[] args) {

        MyBinarySearchTree tree = new MyBinarySearchTree();
        tree.setRoot(new Scanner(System.in).nextInt());
        System.out.println("Root " + tree.getRoot().getData());

        for (int i = 0; i < 10; i++) {
            tree.insert(tree.getRoot());
        }
        tree.printLeftChildren();
    }
}

