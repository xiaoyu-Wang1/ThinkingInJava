package exercise;

import java.lang.reflect.AnnotatedType;

public class GetAllInfoOfClass {

    public static void main(String[] args) {
        AnnotatedType[] annotatedInterfaces = Class.class.getAnnotatedInterfaces();
        for (AnnotatedType annotatedType : annotatedInterfaces) {
            System.out.println(annotatedType.toString());
        }
    }
}
