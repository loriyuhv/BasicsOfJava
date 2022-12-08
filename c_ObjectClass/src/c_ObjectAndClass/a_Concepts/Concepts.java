package c_ObjectAndClass.a_Concepts;

/**
 * An object has three characteristics.
 *  1) state
 *  2) behavior
 *  3) identity
 *
 *  An object is an instance of a class. a class is a template or
 *      blueprint from which objects are created. So, an object is
 *      the instance(result) of a class.
 *
 */
public class Concepts {
}

// Syntax to declare a class:
class Person{
    // field:
    String name;
    String gender;

    // method:
    public void printInformation() {
        System.out.println(name + gender);
    }
}
