package exercise;//: generics/RandomList.java

import java.util.ArrayList;
import java.util.Random;

public class RandomList<T> {
    private ArrayList<T> storage = new ArrayList<T>();
    private Random rand = new Random(47);

    public void add(T item) {
        storage.add(item);
    }

    public T select() {
        return storage.get(rand.nextInt(storage.size()));
    }

    public static void main(String[] args) {
        RandomList<Integer> rs = new RandomList<Integer>();
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        for (Integer integer : integers)
            rs.add(integer);
        for (int i = 0; i < 11; i++)
            System.out.print(rs.select() + " ");
    }
} /* Output:
3 2 3 1 1 3 1 2 3 3 2
*///:~
