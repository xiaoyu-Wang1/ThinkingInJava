package typeinfo;

/**
 * @author yuquanwang
 * @date created on 19-2-20
 */
public class Excise {
    public static void main(String[] args) {
        char[] chars = {};
        System.out.println(chars.getClass().isArray());
        System.out.println(chars.getClass().isPrimitive());
        System.out.println(chars.getClass().isEnum());
        System.out.println(chars.getClass().isAnnotation());
        System.out.println(chars.getClass().getSuperclass().getSimpleName());
        System.out.println(chars instanceof Object);
        System.out.println(chars.getClass().getSimpleName());
        System.out.println(int.class.getSimpleName());
    }
}
