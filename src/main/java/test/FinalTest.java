package test;

/**
 * 此例说明final关键字的特性
 */
public class FinalTest {



    public static void main(String[] args) {
       Student a = new Student("xiaoyu", 20);
       Student b = new Student("xiaoyu", 20);
       final Student c = a;
//       c = b; (编译输出:无法为最终变量c分配值)
        a.setAge(27);
        System.out.println(c);
    }


}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}