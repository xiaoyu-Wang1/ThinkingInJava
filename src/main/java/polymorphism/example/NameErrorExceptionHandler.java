package polymorphism.example;

public class NameErrorExceptionHandler extends MyExceptionHandler {
    @Override
    public void handle(Exception e, MyExceptionHandler exceptionHandler) {

        System.out.println("name exception");
    }
}
