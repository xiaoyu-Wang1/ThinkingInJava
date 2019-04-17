package exercise.ch1526;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayCovariationTest {

    public static void main(String[] args) {
        Number[] numbers = new Integer[2];
        numbers[0] = 1;
        numbers[1] = 1.0;   //java.lang.ArrayStoreException: java.lang.Double
        System.out.println(Arrays.toString(numbers));

        // error
//        List<Number> numberList = new ArrayList<Integer>();
    }
}
