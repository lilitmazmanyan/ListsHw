package ListsImplementations;

import Student.Student;

public class TestingArrayList {
    public static void main(String[] args) {
        Student s1 = new Student("James", "Bond", 43);
        Student s2 = new Student("Mark", "Levi", 59);
        Student s3 = new Student("Michael", "Jackson", 60);
        Student s4 = new Student("Adam", "Levine", 40);
        Student s5 = new Student("StudentTo", "BeDeleted", 641);

        MyArrayList listToTest = new MyArrayList();

        listToTest.add(s1);
        listToTest.add(s2);
        listToTest.add(s3);

        System.out.println("Current of ArrayList size is " + listToTest.size());

        listToTest.add(s4);
        listToTest.add(s5);

        System.out.println("Size after adding 2 students is: " + listToTest.size());

        listToTest.remove(s1);
        System.out.println("Size after deliting student1 is: " + listToTest.size());
        System.out.println(listToTest.get(3) + "\n");
    }
}
