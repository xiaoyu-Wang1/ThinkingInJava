package polymorphism.example;

public class AgeErrorExceptionHandler extends MyExceptionHandler {
    @Override
    public void handle(Exception e, MyExceptionHandler exceptionHandler) {
        System.out.println("age exception");
    }
}
