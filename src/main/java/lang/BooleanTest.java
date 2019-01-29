package lang;

public class BooleanTest {
    public static void main(String[] args) {
        Boolean b = new Boolean("true");
        Boolean b2 = Boolean.TRUE;
        Boolean b3 = new Boolean(true);

        System.out.println(b.booleanValue());

        if (b3) {
            System.out.println("b2 is true");
        }

        System.out.println(b.hashCode() + " " + b2.hashCode());

    }
}
