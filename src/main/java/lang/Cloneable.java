package lang;

public class Cloneable {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] arrCopy = arr.clone();
        arr[1] = 0;
    }
}
