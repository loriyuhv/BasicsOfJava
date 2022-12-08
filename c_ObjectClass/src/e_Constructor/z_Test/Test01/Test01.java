package e_Constructor.z_Test.Test01;

public class Test01 {
    public static void main(String[] args) {
        Person p = new Person("20197360", "王师维");
        System.out.println(p.name + " " + p.id);
        Person p1 = new Person("20197360", "王师维", true, 18);
        System.out.println(p1.id + " " + p1.name + " " + p1.sex + " " + p1.age );
    }
}

class Person {
    String name;
    String id;
    Boolean sex;
    int age;
    public Person() {

    }
    public Person(String id, String name) {
        this.name = name;
        this.id = id;
    }
    public Person(String id, String name, Boolean sex, int age) {
        this(id, name);
        this.sex = sex;
        this.age = age;
    }
}

class Student extends Person {
    String StuNu;
    String Class;
    double score;

    public Student() {

    }
    public Student(String name, String id, Boolean sex, int age, String StuNu) {
        super(name, id, sex, age);
        this.StuNu = StuNu;
    }
    public Student(String name, String id, Boolean sex, int age, String StuNu, double score, String Class) {
        this(name, id, sex, age, StuNu);
        this.score = score;
        this.Class = Class;
    }
}
