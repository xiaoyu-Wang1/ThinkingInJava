package net.jcip.examples;

public abstract class StudentServiceImpl implements StudentService {
    @Override
    public String getName() {
        return "haha";
    }
    @Override
    public String getAge() {
        return "houhou";
    }
    public static void main(String[] args) {
        StudentService service = new StudentServiceImpl(){};
        System.out.println(service.getName());
        System.out.println(service.getAge());
    }
}
