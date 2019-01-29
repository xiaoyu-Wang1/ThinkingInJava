package test.inter;

public class Main {
    public static void main(String[] args) {
        AbstractTest abstractTest = new AbstractTest() {
            @Override
            void printMethod() {
                System.out.println("printMethod");
            }
        };

        abstractTest.printMethod();
    }
}
