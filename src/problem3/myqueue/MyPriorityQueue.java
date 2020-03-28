/*
 *  Created by IntelliJ IDEA.
 *  User: Rakesh Yadav
 *  Date: 28-Mar-20
 *
 */
package problem3.myqueue;

import problem3.node.Node;

public class MyPriorityQueue {
    private Node rear;
    private Node front;
    private int size;

    public MyPriorityQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    /*
    helper method : enQueue
     */
    public void enqueue(Node addData) {
        if (front == null) {
            rear = addData;
            front = addData;
            size++;
        } else {
            if (addData.getData().getRollNumber() >= this.rear.getData().getRollNumber()) {
                rear.setNext(addData);
                rear = addData;
                size++;
            } else if (addData.getData().getRollNumber() <= this.front.getData().getRollNumber()) {
                addData.setNext(this.front);
                this.front = addData;
                size++;
            } else {
                Node temp = this.front;
                Node tempPrevious = this.front;
                while (temp.getNext() != null) {
                    if (temp.getData().getRollNumber() > addData.getData().getRollNumber()) {
                        break;
                    }
                    tempPrevious = temp;
                    temp = temp.getNext();
                }
                tempPrevious.setNext(addData);
                addData.setNext(temp);
                size++;

            }
        }
    }

    /*
    for getting size of Queue
     */
    public int getSize() {
        return size;
    }

    /*
    helper method : to print the Queue
     */
    public void printQueue() {
        Node temp = this.front;
        for (int i = 0; i < this.size; i++) {
            if (i != this.size - 1) {
                System.out.print(temp.getData().toString() + "--->");
                temp = temp.getNext();
            } else {
                System.out.println(temp.getData().toString());
            }
        }
    }

}
