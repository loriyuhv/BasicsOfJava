package Test.test02;

public class Test02 {
    public static void main(String[] args) {
        Person a = new Person();
        a.getName("Alan");
        a.getName();
        a.getName("Jerry");
        a.getName();
    }
}

class Person{
    private String name;

    public void getName() {
        System.out.println(name);
    }
    protected String getName(String name) {

        System.out.println(this.name);
        System.out.println("I am " + this.name);
        this.name = name;
        return name;
    }
}
