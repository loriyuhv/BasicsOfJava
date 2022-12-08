package Test.test01;

public class Test01 {
    public static void main(String[] args) {
        Person a = new Person("Alan");
        Person b = a;
        a = null;
        try{
            System.out.println(a.name);
        }catch(NullPointerException e) {
            e.printStackTrace();
        }
        System.out.println(b.name);

    }
}

class Person {
    String name;
    Person(String name) {
        this.name = name;
    }
}