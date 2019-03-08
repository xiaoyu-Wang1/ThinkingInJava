//: typeinfo/toys/ToyTest.java
// Testing class Class.
package exercise;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static net.mindview.util.Print.print;

interface HasBatteries {
}

interface Waterproof {
}

interface Shoots {
}

interface TestInterface {
}

class Toy {
    // Comment out the following default constructor
    // to see NoSuchMethodError from (*1*)
//  Toy() {}
    Toy(int i) {
        System.out.println(i);
    }
}

class FancyToy extends Toy
        implements HasBatteries, Waterproof, Shoots, TestInterface {
    FancyToy() {
        super(1);
    }
}

public class ToyTest {
    static void printInfo(Class cc) {
        print("Class name: " + cc.getName() +
                " is interface? [" + cc.isInterface() + "]");
        print("Simple name: " + cc.getSimpleName());
        print("Canonical name : " + cc.getCanonicalName());
    }

    public static void main(String[] args) throws Exception {
//        Constructor<?>[] constructors = Toy.class.getConstructors();
        Constructor<?>[] constructors = Toy.class.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor.toString());
            if (constructor.getParameterCount() > 0) {
                constructor.newInstance(1);
            }
        }
    }
} /* Output:
Class name: typeinfo.toys.FancyToy is interface? [false]
Simple name: FancyToy
Canonical name : typeinfo.toys.FancyToy
Class name: typeinfo.toys.HasBatteries is interface? [true]
Simple name: HasBatteries
Canonical name : typeinfo.toys.HasBatteries
Class name: typeinfo.toys.Waterproof is interface? [true]
Simple name: Waterproof
Canonical name : typeinfo.toys.Waterproof
Class name: typeinfo.toys.Shoots is interface? [true]
Simple name: Shoots
Canonical name : typeinfo.toys.Shoots
Class name: typeinfo.toys.Toy is interface? [false]
Simple name: Toy
Canonical name : typeinfo.toys.Toy
*///:~
