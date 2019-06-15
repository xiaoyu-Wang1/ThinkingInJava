package exercise;


public class Ch1601 {
    static void printObject(BerylliumSphere[] berylliumSpheres) {
        System.out.println(berylliumSpheres.length);
    }

    public static void main(String[] args) {
//        printObject(new BerylliumSphere[]{new BerylliumSphere(), new BerylliumSphere()});
        BerylliumSphere[] b1 = {new BerylliumSphere()};
        BerylliumSphere[] b2 = new BerylliumSphere[2];
        System.arraycopy(b1, 0, b2, 0, 1);
    }
}

class BerylliumSphere {
    private static long counter;
    private final long id = counter++;

    public String toString() {
        return "Sphere " + id;
    }
}

