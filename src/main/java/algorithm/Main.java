package algorithm;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] originArr = {1, 3, 5, 7, 9, 3, 8, 4, 2};
        BubbleSort.sort(originArr);
        System.out.println(Arrays.toString(originArr));
    }
}
