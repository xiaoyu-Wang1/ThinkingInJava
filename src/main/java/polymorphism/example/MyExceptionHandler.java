package polymorphism.example;

import java.util.HashMap;
import java.util.Map;

public abstract class MyExceptionHandler {
    private static Map<String, String> map = new HashMap<>();

    static {
        map.put(AgeErrorException.class.getSimpleName(), AgeErrorExceptionHandler.class.getSimpleName());
    }

    public static void main(String[] args) throws ClassNotFoundException {
        try {
            throwAgeException();
            throwNameException();
        } catch (Exception e) {
            String exceptionName = e.getClass().getSimpleName();
            String exceptionHandlerName = map.get(exceptionName);
            System.out.println(exceptionHandlerName);
        }
    }


    public abstract void handle(Exception e, MyExceptionHandler exceptionHandler);


    private static void throwAgeException() throws AgeErrorException {
        throw new AgeErrorException();
    }


    private static void throwNameException() throws NameErrorException {
        System.out.println("throw name exception here");
        throw new NameErrorException();
    }
}
