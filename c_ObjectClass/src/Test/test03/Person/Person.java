package Test.test03.Person;

public class Person {
    private String name;
    private String id;

    protected void setName(String name) {
        this.name = name;
    }
    protected void setId(String id) {
        this.id = id;
    }
    protected String getName() {
        return name;
    }
    protected String getId() {
        return id;
    }
    public Person() {

    }
    public static void main01(String[] args) {
        Person a = new Person();
        a.setName("Alan");
        System.out.println(a.getName());
    }
}
