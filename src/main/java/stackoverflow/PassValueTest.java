package stackoverflow;

public class PassValueTest {

    public static void main(String[] args) {
        Dog aDog = new Dog("Max");
        Dog oldDog = aDog;

        // we pass the object to foo
        foo(aDog);
        // aDog variable is still pointing to the "Max" dog when foo(...) returns
        aDog.getName().equals("Max"); // true
        aDog.getName().equals("Fifi"); // false
        aDog == oldDog; // true
    }

    public static void foo(Dog d) {
        d.getName().equals("Max"); // true
        // change d inside of foo() to point to a new Dog instance "Fifi"
        d = new Dog("Fifi");
        d.getName().equals("Fifi"); // true
    }
}

class Dog {
    private String name;

    public String getName() {
        return name;
    }
}
