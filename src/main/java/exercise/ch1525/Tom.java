package exercise.ch1525;

public class Tom implements Person, Student {
    @Override
    public String getName() {
        return "tom";
    }

    @Override
    public Integer getScore() {
        return 100;
    }

    public static <T extends Person> String getTName(T t) {
        return t.getName();
    }

    public static void main(String[] args) {
        System.out.println(getTName(new Tom()));
    }
}
