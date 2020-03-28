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
        Scanner scanner = new Scanner(System.in);

        /*
         *  taking only 7 inputs for simple demonstration with value 1,2,3,4,5,6,7
         */
        int i = 7;
        System.out.println("Please take only 7 inputs");
        while (i > 0) {
            try {
                tree.add(scanner.nextInt());
            } catch (Exception e) {
                System.out.println("Error Occurred is " + e + " \n");
            }
            i--;
        }

        /*
        *
        * > tree looks like
        *
                       4
                     /  \
                    2      6
                   / \    / \
                  1   3  5   7

        *
        */



        /*
         * > For Only Left Children 4,2,1,5 should be printed , for that we call printLeftChild()
         * > defined in MyBinarySearchTree.java
         *
         */

    }
}

