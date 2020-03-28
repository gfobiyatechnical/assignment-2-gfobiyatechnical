/*
 *  Created by IntelliJ IDEA.
 *  User: Rakesh Yadav
 *  Date: 28-Mar-20
 *
 */
package problem3.node;
import problem5.student.Student;

public class Node {

    private Student student;
    private Node next;

    /*
     Constructor
     */
    public Node(Student student) {
        this.student = student;
        next = null;
    }

    /*
    Getter & Setter methods
     */
    public Student getData() {
        return student;
    }


    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

}
