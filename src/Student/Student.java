package Student;

public class Student implements Comparable<Student> {
    String firstName;
    String lastName;
    int age;

    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " is " + age + " years old.";
    }

    public String toString(Student s) {
        return s.firstName + " " + s.lastName + " is " + s.age + " years old.";
    }

    @Override
    public int compareTo(Student student) {
        return this.firstName.compareTo(student.firstName);
    }

}