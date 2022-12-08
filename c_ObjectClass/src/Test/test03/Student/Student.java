package Test.test03.Student;
import Test.test03.Person.*;

public class Student extends Person {
    float score;
    public Student() {

    }
    public Student(String name) {
        this.setName(name);
    }

    public String getName() {
        return super.getName();
    }
    public static void main01(String[] args) {
        Person a = new Person();
        Student s = new Student();
        //a.setName("Alan"); // 编译不通过，不能通过父类实例（引用）访问父类的实例方法。
        s.setName("Jerry"); // 编译通过
        System.out.println(s.getName());

        Graduate student01 = new Graduate();
        student01.setName("Tom");
        System.out.println(student01.getName());

        Teacher teacher = new Teacher();
        //teacher.setName("Jack"); //编译错误
    }
}

class Graduate extends Student {
    String identity;
}

class Teacher extends Person {
    double salary;
}
