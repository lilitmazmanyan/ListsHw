package ListsImplementations;

import Student.Student;

public class TestingDoublyLinkedList {
    public static void main(String[] args) {
        Student s1 = new Student("James", "Bond", 43);
        Student s2 = new Student("Mark", "Levi", 59);
        Student s3 = new Student("Michael", "Jackson", 60);
        Student s4 = new Student("Adam", "Levine", 40);
        Student s5 = new Student("StudentTo", "BeDeleted", 641);

        DoublyLinkedList linkedListToTest = new DoublyLinkedList();

        linkedListToTest.push(s1);
        linkedListToTest.push(s2);
        linkedListToTest.addLast(s3);
        System.out.println("The size of list after adding 3 students: " + linkedListToTest.size());
        linkedListToTest.push(s4);
        linkedListToTest.addLast(s5);
        linkedListToTest.printStudents();
        System.out.println("Popping the first student " + linkedListToTest.pop());
        System.out.println("Removing the last student " + linkedListToTest.removeLast());

    }
}