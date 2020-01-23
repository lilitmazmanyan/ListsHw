package ListsImplementations;

import Student.Student;

class Node {
    Student data;
    private Node next;
    private Node previous;

    Node getNext() {
        return next;
    }

    Node getPrevious() {
        return previous;
    }

    void setNext(Node next) {
        this.next = next;
    }

    void setPrevious(Node previous) {
        this.previous = previous;
    }

    Node(Student student) {
        this.data = student;

    }

    void printData() {
        System.out.println(data);
    }
}