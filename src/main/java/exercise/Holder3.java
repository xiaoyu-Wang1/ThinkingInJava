package exercise;

import typeinfo.pets.Cat;
import typeinfo.pets.Pet;

public class Holder3<T> {
    private T a;

    public Holder3(T a) {
        this.a = a;
    }

    public T getA() {
        return a;
    }

    public void setA(T a) {
        this.a = a;
    }

    public static void main(String[] args) {
        Holder3<Pet> holder3 = new Holder3<>(new Pet());
        holder3.setA(new Cat());
        Pet pet = holder3.getA();
    }
}
