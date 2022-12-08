package f_Heristance.z_Test.test01;

public class TestSuper {
    public static void main(String[] args) {
        Student a = new Student("Jerry", "20197360");
        System.out.println(a.toString());
    }
}

class Person{
    String name;
    public Person() {

    }
    public Person(String name) {
        this.name = name;
    }
}

class Student extends Person{
    String StuNu;
    int age;
    public Student(String name, String StuNu) {
        super(name);
        this.StuNu = StuNu;
    }
    public Student(String name, String StuNu, int age) {
        this(name, StuNu);
        this.age = age;
    }
}
