package f_Heristance.b_Override;

public class Override {
    public static void main(String[] args) {
        Student jerry = new Student("Jerry", "20197360", (short) 18);
        jerry.displayInformation();
    }

}

class Person{
    String name;
    long age;
    public Person() {

    }
    public Person(String name, long age) {
        this.name = name;
        this.age = age;
    }
    public void displayInformation() {
        System.out.println(name);
    }
    protected long getAge() {
        return age;
    }
}

class Student extends Person {
    String StuNu;
    public Student(String name, String StuNu, short age) {
        super(name, age);
        this.StuNu = StuNu;
    }

    public void displayInformation() {
        System.out.println(this.name + " " + StuNu + " " + age);
    }

    public long getAge() {
        return this.age;
    }
}
