package com.wsw99.test;

import org.junit.Test;

/**
 * @author loriyuhv
 * @date 2024/3/17
 * @description 方法重载（Overloading）和方法重写（Overriding）的区别
 * 方法重载：是一个类中定义了多个方法名相同，而它们的参数的数量不同或数量相同而类型和次序不同。
 * 方法重写：是在子类存在的方法与父类的方法的名字相同，而且参数的个数与类型一样，返回值也一样。
 */

class Person1 {
    public String name;
    public int age;

    public Person1() {
    }

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    // 方法重载指的是一个类中定义了多个相同名字的方法，而他们的参数的数量不同。
    // 返回三个整数的和
    public int add(int x, int y, int z) {
        return x + y + z;
    }

    // 或数量相同而类型和次序不同，此方法成为重载
    // 返回两个整数的和
    public int add(int x, int y) {
        return x + y;
    }

    // 返回两个数的和（单精度浮点类型）
    public float add(float y, float x) {
        return x + y;
    }

    // 返回两个数的和（双精度浮点类型）
    public double add(double x, double y) {
        return x + y;
    }
}

class Student extends Person1 {
    public String stuId;
    public double score;

    public Student() {
    }

    public Student(String stuId, double score) {
        this.stuId = stuId;
        this.score = score;
    }

    public Student(String name, int age, String stuId, double score) {
        super(name, age);
        this.stuId = stuId;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuId='" + stuId + '\'' +
                ", score=" + score +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    // 方法重写是在子类的方法与父类的方法的名字相同，
    // 而且参数的类型和次序一样，返回值也一样的方法，称为重写。
    @Override
    public int add(int x, int y) {
        return x + y;
    }

}

public class CMethodForOverloadingAndOverriding {

    @Test
    public void test() {
        Student student = new Student();
        int add = student.add(2, 5);
        float add1 = student.add((float) 1.2, (float) 1.5);
        System.out.println(add);
        System.out.println(add1);
    }
}
