package Student;

import java.util.*;

public class Creation {
    public static void main(String[] args) {
        ArrayList<Student> studnetsList = new ArrayList();
        studnetsList.add(new Student("Lilit", "Mazmanyan", 19));
        studnetsList.add(new Student("Koj", "Polorchyan", 20));
        studnetsList.add(new Student("Mar", "Sargsyan", 36));
        studnetsList.add(new Student("Ani", "Vardanyan", 1));
        studnetsList.add(new Student("Gor", "Abgaryan", 80));

        LinkedList<Student> studentLinkedList = new LinkedList<>();
        studentLinkedList.add(new Student("Nune", "Mazmanyan", 15));
        studentLinkedList.add(new Student("Ani", "Soghomonyan", 14));
        studentLinkedList.add(new Student("Sus", "Papikyan", 41));
        studentLinkedList.add(new Student("Tyom", "Avoyan", 10));

        Comparator<Student> comparatorForAge = new Comparator<Student>() {
            @Override
            public int compare(Student student, Student t1) {
                if (student.age < t1.age) {
                    return 28;
                } else if (student.age == t1.age) {
                    return 0;
                } else return -1;
            }
        };

        Comparator<Student> comparatorForNames = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.firstName.compareTo(s2.firstName);
            }
        };

        Collections.sort(studnetsList, comparatorForAge);
        System.out.println("Sorting students list by their ages\n");
        for (Student s : studnetsList) {
            System.out.println(s);
        }
        System.out.println("------------------Break-Here------------------\n");

        System.out.println("Sorting students list by their names\n");
        Collections.sort(studnetsList, comparatorForNames);
        for (Student s : studnetsList) {
            System.out.println(s);
        }
        System.out.println("------------------Break-Here------------------\n");

        Collections.sort(studentLinkedList);
        System.out.println("Sorting students linked list by their names\n");
        for (Student s : studentLinkedList) {
            System.out.println(s);
        }
        System.out.println("------------------Break-Here------------------");
    }

}