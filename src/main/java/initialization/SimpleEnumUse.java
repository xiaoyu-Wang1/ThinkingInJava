package initialization;//: initialization/SimpleEnumUse.java

public class SimpleEnumUse {
  public static void main(String[] args) {
    Spiciness howHot = Spiciness.MEDIUM;
    Spiciness howHot2 = Spiciness.MEDIUM;
    System.out.println(howHot.equals(howHot2));
  }
} /* Output:
MEDIUM
*///:~
