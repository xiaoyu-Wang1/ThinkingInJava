package typeinfo;//: typeinfo/SweetShop.java
// Examination of the way the class loader works.

import java.util.HashMap;

import static net.mindview.util.Print.*;

class Candy {
    static {
        print("Loading Candy");
    }
}

class Gum {
    static {
        print("Loading Gum");
    }
}

class Cookie {
    static {
        print("Loading Cookie");
    }
}

class AA {
}

class AAA extends AA {
}

class AAAA extends AAA {
}


public class SweetShop {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        print("inside main");
        new Candy();
        print("After creating Candy");
        try {
            Class.forName("Gum");
        } catch (ClassNotFoundException e) {
            print("Couldn't find Gum");
        }
        print("After Class.forName(\"Gum\")");
        new Cookie();
        print("After creating Cookie");

        // excise
        Class<?> aClass = Class.forName("typeinfo." + args[0]);
        aClass.newInstance();

        printExtendClass(new AAAA());
    }

    private static void printExtendClass(Object o) throws IllegalAccessException, InstantiationException {
        if (o.getClass().getSuperclass() != null) {
            System.out.println(o.getClass().getSimpleName());
            printExtendClass(o.getClass().getSuperclass().newInstance());
        } else {
            System.out.println(o.getClass().getSimpleName());
        }
    }
} /* Output:
inside main
Loading Candy
After creating Candy
Loading Gum
After Class.forName("Gum")
Loading Cookie
After creating Cookie
*///:~
