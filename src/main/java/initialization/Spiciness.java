package initialization;//: initialization/Spiciness.java

public enum Spiciness {
    NOT, MILD, MEDIUM, HOT, FLAMING;


    @Override
    public String toString() {
        return this.name() + " " + this.getClass().getSimpleName();
    }
} ///:~
