package c_ObjectAndClass.a_Concepts.z_Examples.Example03.c_ThroughConstrutor;

class Employee{
    int id;
    String name;
    float salary;

    void insert(int i, String n, float s) {
        id = i;
        name = n;
        salary = s;
    }
    void display() {
        // printing data with a white space
        System.out.println(id + " " + name + " " + salary);
    }
}
public class TestEmployee {
    public static void main(String[] args) {
        // Creating objects
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();

        e1.insert(101, "Alan", 3000);
        e2.insert(102, "Jerry", 6000);
        e3.insert(103, "Tom", 4000);

        e1.display();
        e2.display();
        e3.display();
    }
}
