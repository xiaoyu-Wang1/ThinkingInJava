package exercise.ch1520;

public class Teacher implements Person {
    @Override
    public String getName() {
        return "teacher";
    }

    @Override
    public Integer getAge() {
        return 30;
    }

    public void printInfo() {
        System.out.println(getName() + " " + getAge());
    }
}
