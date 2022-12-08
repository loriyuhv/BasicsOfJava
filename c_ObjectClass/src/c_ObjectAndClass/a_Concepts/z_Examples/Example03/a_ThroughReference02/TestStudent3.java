package c_ObjectAndClass.a_Concepts.z_Examples.Example03.a_ThroughReference02;

public class TestStudent3 {
    public static void main(String[] args) {
        // Creating objects
        Student s1 = new Student();
        Student s2 = new Student();
        // Initializing objects
        s1.id = 101;
        // Storing information into id member through reference variable
        s1.name = "Alan";
        s2.id = 102;
        s2.name = "Jerry";
        // Printing data
        System.out.println(s1.id + " " + s1.name);
        System.out.println(s2.id + " " + s2.name);
    }
}

class Student{
    int id;
    String name;
}
