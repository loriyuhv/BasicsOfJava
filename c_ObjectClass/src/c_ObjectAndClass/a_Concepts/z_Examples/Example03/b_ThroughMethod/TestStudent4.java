package c_ObjectAndClass.a_Concepts.z_Examples.Example03.b_ThroughMethod;

public class TestStudent4 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.insertRecord(101, "Alan");
        s2.insertRecord(102, "Jerry");

        // displaying the state of the objects
        // by invoking displayInformation() method.
        s1.displayInformation();
        s2.displayInformation();
    }
}

class Student{
    int id;
    String name;

    void insertRecord(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void displayInformation() {
        System.out.println(id + " " + name);
    }
}
