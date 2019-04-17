package exercise;//: generics/MultipleInterfaceVariants.java
// {CompileTimeError} (Won't compile)


interface Payable {
}

class Employee implements Payable {
}

class Hourly extends Employee implements Payable {
    public static void main(String[] args) {

    }
} ///:~
