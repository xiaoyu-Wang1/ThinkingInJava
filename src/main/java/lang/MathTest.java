package lang;

public class MathTest {
    int j;
    public static void main(String[] args) {
        System.out.println(Math.ceil(1.25));
        System.out.println(Math.floor(1.25));
        System.out.println(Math.rint(1.50));
        System.out.println(Math.rint(1.49));
        System.out.println(Math.max(1.25, 2.50));
        System.out.println(Math.min(1.25, 2.50));
        System.out.println(Math.random());

        double[] arr = new double[5];
        for (double i : arr) {
            System.out.println(i);
        }

        MathTest test = new MathTest();
        test.printJ();

    }

    private void printJ() {
        System.out.println(j);
    }
}
