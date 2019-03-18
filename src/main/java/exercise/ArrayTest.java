package exercise;

public class ArrayTest {
    public static void main(String[] args) {
        Student[] students = new Student[10];
        System.out.println(students.length);
    }
}

class Student {
    private String name;
}
