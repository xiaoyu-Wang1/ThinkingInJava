package exercise;//: generics/GenericMethods.java

public class GenericMethods {
    public <T1, T2, T3> void f(T1 x, T2 y, T3 z) {
        System.out.println(x.getClass().getName());
        System.out.println(y.getClass().getName());
        System.out.println(z.getClass().getName());
    }

    public <T1, T2> void f2(T1 x, T2 y, Double z) {
        System.out.println(x.getClass().getName());
        System.out.println(y.getClass().getName());
        System.out.println(z.getClass().getName());
    }

    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        gm.f("", 1, 1.0);
        gm.f2("", 1, 1.0);
    }
} /* Output:
java.lang.String
java.lang.Integer
java.lang.Double
*///:~
