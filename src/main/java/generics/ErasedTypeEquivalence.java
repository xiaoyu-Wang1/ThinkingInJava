package generics;//: generics/ErasedTypeEquivalence.java

import java.util.*;

public class ErasedTypeEquivalence {
    public static void main(String[] args) {
        Class c1 = new ArrayList<String>().getClass();
        Class c2 = new ArrayList<Integer>().getClass();
        System.out.println(c1 == c2);

        System.out.println(Arrays.toString(c1.getTypeParameters()));
        System.out.println(Arrays.toString(c2.getTypeParameters()));
    }
} /* Output:
true
*///:~
