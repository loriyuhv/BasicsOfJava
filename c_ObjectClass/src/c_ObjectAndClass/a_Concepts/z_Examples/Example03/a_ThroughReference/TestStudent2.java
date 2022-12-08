package c_ObjectAndClass.a_Concepts.z_Examples.Example03.a_ThroughReference;

public class TestStudent2 {
    // Creating main method
    public static void main(String[] args) {
        // Creating an object or instance
        Student s1 = new Student(); // Creating an object of Student

        // storing information in s1 through reference variable
        s1.id = 101;
        s1.name = "Alan";
        //printing members with a white space(空格)
        System.out.println(s1.id + " " + s1.name);
    }
}

// Defining a Student class
class Student{
    // Defining fields
    int id; // field or data member or instance variable
    String name;
}

