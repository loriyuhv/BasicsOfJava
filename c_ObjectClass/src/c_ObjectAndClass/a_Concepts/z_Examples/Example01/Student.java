package c_ObjectAndClass.a_Concepts.z_Examples.Example01;

/**
 * Object and class Example: main within the class
 *  In this example, we have created a Student class which
 *  has two data members id and name. We are creating the
 *  object of the Student class by new keyword and printing
 *  the object's value.
 *  Here, we are creating a main() method inside the class.
 */

/* Java Program to illustrate how to define a class and
    fields */
// Defining a Student class
public class Student {
    // defining fields
    int id; // field or data member or instance variable
    String name;

    //creating main method inside the Student class
    public static void main(String[] args) {
        // Creating an object or instance
        Student s1 = new Student(); // creating an object of Student
        //Printing values of the object
        System.out.println(s1.id);// accessing member through reference variable(引用变量)
        System.out.println(s1.name);
    }

}
