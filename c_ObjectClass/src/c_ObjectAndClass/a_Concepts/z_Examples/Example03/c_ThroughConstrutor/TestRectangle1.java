package c_ObjectAndClass.a_Concepts.z_Examples.Example03.c_ThroughConstrutor;

class Rectangle{
    int length;
    int width;

    void insert(int length, int width) {
        this.length = length;
        this.width = width;
    }

    void calculateArea() {
        System.out.println(length * width);
    }
}

public class TestRectangle1 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();

        r1.insert(3, 4);
        r2.insert(4, 5);
        r1.calculateArea();
        r2.calculateArea();
    }
}
