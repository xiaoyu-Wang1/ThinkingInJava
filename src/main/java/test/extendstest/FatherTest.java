package test.extendstest;

public class FatherTest {
    public static void main(String[] args) {
        Son1 son1 = new Son1();
        Son2 son2 = new Son2();
        Father.printSonName(son1);
        Father.printSonName(son2);
    }
}
