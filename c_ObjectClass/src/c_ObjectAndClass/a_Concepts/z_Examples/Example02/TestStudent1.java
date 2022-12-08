package c_ObjectAndClass.a_Concepts.z_Examples.Example02;

/**
 * Object and Class Example: main outside the class
 *
 *  In real time development, we create classes and use it from
 *  another class. It is a better approach than previous one.
 *  Let's see a simple example, where we are having main()
 *  method in another class.
 *  We Can have multiple classes in different Java files or
 *  single Java file. If you define multiple classes in a single
 *  Java source file, it is a good idea to save the file name
 *  with the class name which has main() method.
 */

// File: TestStudent1.java
/* Java Program to demonstrate having the main method in
    another class */

// Creating Student class.
class Student{
    // Defining fields
    int id;
    String name;
}

// Creating another class TestStudent1 which contains the
// main method
public class TestStudent1 {
    public static void main(String[] args) {
        Student s1 = new Student(); //Creating an object of Student

        System.out.println(s1.id); // Accessing member through deference variable
        System.out.println(s1.name);
    }
}
