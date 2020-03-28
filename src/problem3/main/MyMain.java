/*
 *  Created by IntelliJ IDEA.
 *  User: Rakesh Yadav
 *  Date: 28-Mar-20
 *
 */
package problem3.main;

import problem3.myqueue.MyPriorityQueue;
import problem3.node.Node;
import problem5.student.Student;

/* executable class
 *use problem5.student.Student class to create object of student
 */

public class MyMain {

    public static void main(String[] args) {
        MyPriorityQueue myPriorityQueue = new MyPriorityQueue();
        /*
         *   Adding 5 Students by hard-coding
         *   The Queue enqueues them according to ascending Roll Number as given for example in Problem Statement
         */
        myPriorityQueue.enqueue(new Node(new Student(15, "GLA null")));
        myPriorityQueue.enqueue(new Node(new Student(500, "NK  ")));
        myPriorityQueue.enqueue(new Node(new Student(50, "VD ")));
        myPriorityQueue.enqueue(new Node(new Student(11, "Jio kola")));
        myPriorityQueue.enqueue(new Node(new Student(55, " DBC ")));

        myPriorityQueue.printQueue();
    }
}
