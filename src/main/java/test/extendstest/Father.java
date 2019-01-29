package test.extendstest;

public abstract class Father {
    public static void printSonName(Father father) {
        System.out.println(father.tellMeName());
    }

    protected abstract String tellMeName();
}
