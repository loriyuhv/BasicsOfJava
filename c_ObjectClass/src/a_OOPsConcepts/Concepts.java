package a_OOPsConcepts;

/**
 * Object:
 *  Any entity that has state and behavior is
 *      known as an object.
 *  noticed: state: property: fields    behavior: method
 *  An Object can be defined as an instance
 *      of a class. An object contains an address
 *      and takes up some space in memory.
 *  Example: A dog is an object because it has states like
 *      color, name, breed, etc. as well as behaviors like
 *      wagging the tail, barking, eating, etc.
 *
 * Class
 *  Collection of objects is called class. It is a
 *      logical entity.
 *  A class can also be defined as a blueprint from which
 *      you can create an individual object. Class doesn't
 *      consume any space.
 *
 * 3 Ways to initialize object
 *  There are 3 ways to initialize object in Java
 *      1) By deference variable (Example03)
 *      2) By method
 *      3) By constructor
 *  1) Object and class Example: Initialization through reference
 *      Initializing an object means storing data into the object.
 *      Let's see a simple example where we are going to initialize
 *      the object through a reference variable.
 *          see package Example03.a_ThroughReference
 *
 *      We can also create multiple objects and store information
 *      in it through reference variable.
 *          see package Example03.a_ThroughReference02
 *  2) Object and Class Example: Initialization through method
 *      In this example, we are creating the two objects of
 *      Student class and initializing the value to these objects
 *      by invoking the insertRecord method. Here, we are
 *      displaying the state(data) of the objects by invoking
 *      the displayInformation() method.
 *
 *      see package Example03.a_ThroughMethod
 *
 *      As you can see in the above figure, object gets the
 *      memory in heap memory area. The reference variable
 *      refers to the object allocated in the heap memory area.
 *      Here, s1 and s2 both are reference variables that refer
 *      to the objects allocated in memory.
 *  3) Object and Class Example: Initialization through a constructor
 *      We will learn about constructors in Java later.
 *
 *      Object and class Example Employee
 *      Let's see an example where we are maintaining records
 *      of employees.
 *          see package Example03.a_ThroughConstructor TestEmployee.java
 *
 *      Object and Class Example: Rectangle
 *      There is given another example that maintains the records
 *      of Rectangle class.
 *          see package Example03.a_ThroughConstructor TestRectangle1.java
 *
 *      What are the different ways to create an object in Java?
 *      There are many ways to create an object in Java. They are:
 *          -> By new keyword
 *          -> By newInstance() method
 *          -> By clone() method
 *          -> By deserialization
 *          -> By factory method etc
 *  4)
 *
 *
 */
public class Concepts {
    public static void main(String[] args) {
        // defining an instance
        Dog dog = new Dog();


    }
}

// Class and Object举例
class Dog{
    // states
    String color;
    String name;
    String breed;

    // behaviors
    public void waggingTheTail() {
        System.out.println("The dog is wagging its tail.");
    }

    public void barking() {
        System.out.println("The dog is barking at me.");
    }

    public void eating() {
        System.out.println("The dog is eating.");
    }
}
