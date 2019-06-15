package jvm.classloader;

public class ClassLoaderTest {
    public static void main(String[] args) throws ClassNotFoundException {
        ClassLoader myClassLoader = new ClassLoader() {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                return super.loadClass(name);
            }
        };

        Object obj = myClassLoader.loadClass("jvm.classloader.ClassLoaderTest");
        System.out.println(obj instanceof jvm.classloader.ClassLoaderTest);
    }
}
