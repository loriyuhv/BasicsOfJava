package a_Introduce;

public class Test {
    public static void main(String[] args) {
        Person a = new Student("Alan", true, "20197360", 99.5);
        a.show();
    }
}

abstract class Person {
    private String name;
    private boolean gender;

    public Person() {

    }
    public Person(String name, boolean gender) {
        this.name = name; this.gender = gender;
    }

    public String getName() {
        return name;
    }
    public abstract void show();
}

class Student extends Person {
    private String number;
    private double score;

    public Student(String name, boolean gender, String number, double score) {
        super(name, gender);
        this.number = number; this.score = score;
    }

    public void show() {
        System.out.println("我叫" + getName() + "，学号是" + number + "。");
    }
}
