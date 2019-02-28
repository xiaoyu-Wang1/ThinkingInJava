package lang;

public class Main {
    private static String b = "b";

    public static void main(String[] args) {
        String s = "s";
        int a = 1;
        changeString(s);
        changeString(b);
        changeInt(a);
        System.out.println(s);
        System.out.println(b);
        System.out.println(a);
        System.getProperties().list(System.out);
    }

    private static void changeString(String s) {
        s = "sb";
    }

    private static void changeInt(int a) {
        a = 2;
    }
}

